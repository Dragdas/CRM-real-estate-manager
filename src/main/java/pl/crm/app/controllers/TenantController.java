package pl.crm.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.*;

import java.math.BigDecimal;
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
    //Edit tenant
    @PutMapping
    public ResponseEntity<TenantAccountDto> updateTenant(@RequestBody TenantAccountDto tenantAccountDto) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new TenantAccountDto(0L, "Aaaaaa", "Bbbbb", invoiceDtos));
    }
    //Get Invoices by tenants Id
    @GetMapping(value = "/inv_ten_id/{tenantId}")
    public ResponseEntity<List<InvoiceDto>> getInvoicesByTenantId(@PathVariable Long tenantId) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(invoiceDtos);
    }
    //Get invoice by id
    @GetMapping(value = "/inv_id/{invoiceId}")
    public ResponseEntity<InvoiceDto> getInvoicesById(@PathVariable Long invoiceId) {
        return ResponseEntity.ok(new InvoiceDto(
                0L,
                new OwnerDto(0L, "Aaaaa", new ArrayList<>(), new ManagerAccountDto(0L,"","", new ArrayList<>())),
                new TenantAccountDto(0L,"","", new ArrayList<>()),
                new ArrayList<>(),
                "ABCD"
        ));
    }
    //Get invoiceEntry by invoiceId
    @GetMapping(value = "/inven_inv_id/{invoiceId}")
    public ResponseEntity<InvoiceEntryDto> getInvoiceEntriesByInvoiceId(@PathVariable Long invoiceId) {
        return ResponseEntity.ok(new InvoiceEntryDto(
                0L,
                "Description",
                new BigDecimal(1000),
                0.123,
                true
                )
        );
    }
    //Get Owner by Id
    @GetMapping(value = "/own_id/{ownerId}")
    public ResponseEntity<OwnerDto> getOwnerById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(new OwnerDto(
                0L,
                "Piotr",
                new ArrayList<>(),
                new ManagerAccountDto(
                        0L,
                        "Manager1",
                        "password123",
                        new ArrayList<>()
                )
                )
        );
    }
    //Get RealEstates by Owner Id
    @GetMapping(value = "/realest_own_id/{ownerId}")
    public ResponseEntity<RealEstateDto> getRealEstatesByOwnerId(@PathVariable Long ownerId) {
        return ResponseEntity.ok(new RealEstateDto(
                0L,
                ownerId,
                new ArrayList<>()
                )
        );
    }
    //Get Premises by OwnerId
    @GetMapping(value = "/prem_own_id/{ownerId}")
    public ResponseEntity<PremisDto> getPremisesByOwnerId(@PathVariable Long ownerId) {
        return ResponseEntity.ok(new PremisDto(
                0L,
                "ABCDE",
                123L,
                345L,
                new BigDecimal(123)
                )
        );
    }
}
