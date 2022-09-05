package pl.crm.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.crm.domain.InvoiceDto;
import pl.crm.domain.TenantAccountDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tenant")
public class TenantController {
    //Get tenant by Id
    @GetMapping(value = "{tenantId}")
    public ResponseEntity<TenantAccountDto> getTenant(@PathVariable Long tenantId) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new TenantAccountDto(0L, "Aaaaaa", "Bbbbb", invoiceDtos));
    }
    //Get Invoices by tenants Id
    //Get invoice by id
    //Get invoiceEntry by invoiceId
    //Get Owner by Id
    //Get RealEstates by Owner Id
    //Get Premises by OwnerId
}
