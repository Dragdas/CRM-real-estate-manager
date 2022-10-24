package pl.crm.app.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.crm.app.domain.DTOs.PremiseDto;
import pl.crm.app.domain.models.Premise;
import pl.crm.app.domain.models.RealEstate;
import pl.crm.app.domain.models.Tenant;
import pl.crm.app.errorHandling.exceptions.PremiseNotFound;
import pl.crm.app.errorHandling.exceptions.RealEstateNotFound;
import pl.crm.app.repositories.PremiseRepository;
import pl.crm.app.repositories.RealEstateRepository;
import pl.crm.app.repositories.TenantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PremiseService {

        private final PremiseRepository premiseRepository;
        private final TenantRepository tenantRepository;
        private final RealEstateRepository realEstateRepository;

        public List<Premise> getAllPremises(){
            return premiseRepository.findAll();
        }

        public Premise getById(long premiseId) throws PremiseNotFound {
            return premiseRepository.findById(premiseId).orElseThrow(PremiseNotFound::new);
        }

        public List<Premise> getPremisesByTenantId(long tenantId){
            return premiseRepository.findPremisesByTenantId(tenantId);
        }

        public List<Premise> getPremisesByOwner( long ownerId){
            return premiseRepository.findPremisesByOwnerId(ownerId);
        }

        @Transactional
        public Premise addPremise(PremiseDto premiseDto) throws RealEstateNotFound {
            Tenant tenant = tenantRepository.findById(premiseDto.getTenantId()).orElse(null);

            RealEstate realEstate = realEstateRepository.findById(premiseDto.getRealEstateId())
                    .orElseThrow(RealEstateNotFound::new);

            return premiseRepository.save(new Premise(null,
                    premiseDto.getIdentifier(),
                    tenant,
                    realEstate,
                    premiseDto.getRentFee()
                    ));
        }

    @Transactional
    public Premise updatePremise(PremiseDto premiseDto) throws RealEstateNotFound, PremiseNotFound {
        Premise premise = premiseRepository.findById(premiseDto.getId()).orElseThrow(PremiseNotFound::new);

        Tenant tenant = tenantRepository.findById(premiseDto.getTenantId()).orElse(null);

        RealEstate realEstate = realEstateRepository.findById(premiseDto.getRealEstateId())
                .orElseThrow(RealEstateNotFound::new);

        premise.setIdentifier(premiseDto.getIdentifier());
        premise.setTenant(tenant);
        premise.setRealEstate(realEstate);
        premise.setRent(premiseDto.getRentFee());

        return premiseRepository.save(premise);
    }

}
