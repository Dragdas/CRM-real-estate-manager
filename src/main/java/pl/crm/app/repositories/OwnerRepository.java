package pl.crm.app.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.crm.app.domain.models.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    @Override
    List<Owner> findAll();
}
