package pl.crm.app.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.crm.app.domain.DTOs.RealEstateDto;
import pl.crm.app.domain.models.Owner;
import pl.crm.app.domain.models.Premise;
import pl.crm.app.domain.models.RealEstate;
import pl.crm.app.errorHandling.exceptions.OwnerNotFoundException;
import pl.crm.app.errorHandling.exceptions.PremiseNotFound;
import pl.crm.app.errorHandling.exceptions.RealEstateNotFound;
import pl.crm.app.repositories.OwnerRepository;
import pl.crm.app.repositories.PremiseRepository;
import pl.crm.app.repositories.RealEstateRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RealEstateService {

    private final RealEstateRepository realEstateRepository;
    private final OwnerRepository ownerRepository;
    private final PremiseRepository premiseRepository;

    public List<RealEstate> getAllRealEstates(){return realEstateRepository.findAll();}

    public RealEstate getRealEstateById(Long realEstateId) throws RealEstateNotFound {
        return realEstateRepository.findById(realEstateId).orElseThrow(RealEstateNotFound::new);
    }

    public List<RealEstate> getRealEstatesByOwner(Long ownerId){
        return realEstateRepository.findByOwnerId(ownerId);
    }
    @Transactional
    public RealEstate addRealEstate(RealEstateDto realEstateDto) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findById(realEstateDto.getOwnerId()).orElseThrow(OwnerNotFoundException::new);
        return realEstateRepository.save(new RealEstate(null,owner,new ArrayList<>()));
    }

    @Transactional
    public RealEstate updateOwner(long realEstateId, long ownerId) throws OwnerNotFoundException, RealEstateNotFound {
        RealEstate realEstate = realEstateRepository.findById(realEstateId).orElseThrow(RealEstateNotFound::new);
        Owner owner = ownerRepository.findById(ownerId).orElseThrow(OwnerNotFoundException::new);

        realEstate.setOwner(owner);
        return realEstateRepository.save(realEstate);
    }

    @Transactional
    public RealEstate updateAddPremise(long realEstateId, long premiseId) throws RealEstateNotFound, PremiseNotFound {
        RealEstate realEstate = realEstateRepository.findById(realEstateId).orElseThrow(RealEstateNotFound::new);
        Premise premise = premiseRepository.findById(premiseId).orElseThrow(PremiseNotFound::new);

        realEstate.getPremises().add(premise);
        return realEstateRepository.save(realEstate);
    }

}
