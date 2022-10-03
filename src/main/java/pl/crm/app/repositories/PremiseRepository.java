package pl.crm.app.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.crm.app.domain.models.Premise;
import pl.crm.app.domain.models.RealEstate;

import java.util.List;

public interface PremiseRepository extends CrudRepository<Premise, Long> {

    @Override
    List<Premise> findAll();

    List<Premise> findPremisesByTenantId(Long tenantId);//TODO przetestować czy to dziąła

    @Query(value = "select p from premise p left join fetch real_estate as re on re.owner.id=:ownerId ")
    List<Premise> findPremisesByOwnerId(Long ownerId);

}
