package pl.crm.app.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.crm.app.domain.models.Invoice;
import pl.crm.app.domain.models.Tenant;
import pl.crm.app.errorHandling.exceptions.InvoiceNotFoundException;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;
import pl.crm.app.repositories.InvoiceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final TenantService tenantService;

    public List<Invoice> getAllInvoices () {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceByInvoiceId (final Long invoiceId) throws InvoiceNotFoundException {
        return invoiceRepository.findById(invoiceId).orElseThrow(InvoiceNotFoundException::new);
    }

    public List<Invoice> getInvoiceByTenantId (final Long tenantId) throws TenantNotFoundException {
        Tenant tenant = tenantService.getTenantBy(tenantId);
        return tenant.getInvoices();
    }

}
