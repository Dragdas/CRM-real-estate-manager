package pl.crm.app.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import pl.crm.app.domain.DTOs.TenantAccountDto;
import pl.crm.app.domain.models.Tenant;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;
import pl.crm.app.repositories.TenantRepository;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

    public List<Tenant> getAllTenants(){
        return tenantRepository.findAll();
    }

    public Tenant getTenantBy(Long id) throws TenantNotFoundException {
        return tenantRepository.findById(id).orElseThrow(TenantNotFoundException::new);
    }

    public Tenant addTenant(TenantAccountDto tenantAccountDto){
        return tenantRepository.save(new Tenant(null,
                                        tenantAccountDto.getUserName(),
                                        tenantAccountDto.getPassword(),
                                        Collections.emptyList(),
                                        Collections.emptyList()));
    }

}
