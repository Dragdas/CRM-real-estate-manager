package pl.crm.app.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import pl.crm.app.repositories.TenantRepository;

@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

/*    public TenantAccountDto addTenant(TenantAccountDto tenantAccountDto){

    }*/

}
