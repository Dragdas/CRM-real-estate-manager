package pl.crm.app.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.crm.app.domain.models.Invoice;

import java.util.List;

public interface InvoiceRepository extends CrudRepository <Invoice, Long> {

    @Override
    List<Invoice> findAll ();
}
