package pl.crm.app.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.crm.app.domain.models.Tenant;

import java.util.List;

public interface TenantRepository extends CrudRepository<Tenant, Long> {
    @Override
    List<Tenant> findAll();

}
