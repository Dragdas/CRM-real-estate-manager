package pl.crm.app.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.crm.app.domain.models.Premise;

public interface PremiseRepository extends CrudRepository<Premise, Long> {
}
