package pl.crm.app.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.crm.app.domain.models.RealEstate;
import pl.crm.app.domain.models.Tenant;

import java.util.List;

public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {

    @Override
    List<RealEstate> findAll();

    @Query(value = "SELECT re FROM real_estate re WHERE owner.id=:ownerId")
    List<RealEstate> findByOwnerId(@Param("ownerId") long ownerId);

}
