package pl.crm.app.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.*;
import pl.crm.app.domain.models.Tenant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/manager")
public class ManagerController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/tenant")
    public ResponseEntity<Void> createTenantAccount(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/tenant/{tenantId}")
    public ResponseEntity<Void> deleteTenantAccount(@PathVariable Long tenantId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/tenant")
    public ResponseEntity<Tenant> updateTenantAccount(@RequestBody TenantAccountDto tenantAccountDto) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new Tenant(0L, "Aaaaaa", "Bbbbb", Collections.emptyList(),Collections.emptyList()));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/manager")
    public ResponseEntity<Void> createManagerAccount(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/manager/{managerId}")
    public ResponseEntity<Void> deleteManagerAccount(@PathVariable Long managerId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/manager")
    public ResponseEntity<ManagerAccountDto> updateManagerAccount(@RequestBody ManagerAccountDto managerAccountDto) {
        List<OwnerDto> owners = new ArrayList<>();
        return ResponseEntity.ok(new ManagerAccountDto(0L, "Aaaaaa", "Bbbbb", owners));
    }

    @GetMapping(value = "/owner/{ownerId}")
    public ResponseEntity<OwnerDto> getOwner(@PathVariable Long ownerId) {
        return ResponseEntity.ok(new OwnerDto(0L,
                "Aaaaa",
                new ArrayList<>(),
                new ManagerAccountDto(0L,"","", new ArrayList<>())
        ));
    }

    @GetMapping(value = "/owner")
    public ResponseEntity<List<OwnerDto>> getOwners() {
        List<OwnerDto> ownerDtoList = new ArrayList<>();
        return ResponseEntity.ok(ownerDtoList);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/owner")
    public ResponseEntity<Void> createOwner(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/owner/{ownerId}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long ownerId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/owner")
    public ResponseEntity<OwnerDto> updateOwner(@RequestBody OwnerDto ownerDto) {
        return ResponseEntity.ok(new OwnerDto(
                0L,
                "Aaaaa",
                new ArrayList<>(),
                new ManagerAccountDto(0L,"","", new ArrayList<>())
                )
        );
    }

    @GetMapping(value = "/realestate/{realEstateId}")
    public ResponseEntity<RealEstateDto> getRealEstate(@PathVariable Long realEstateId) {
        return ResponseEntity.ok(new RealEstateDto(
                        0L,
                        0L,
                        new ArrayList<>()
                )
        );
    }

    @GetMapping(value = "/realestate")
    public ResponseEntity<List<RealEstateDto>> getRealEstates() {
        List<RealEstateDto> realEstateDtoList = new ArrayList<>();
        return ResponseEntity.ok(realEstateDtoList);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/realestate")
    public ResponseEntity<Void> createRealEstate(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/realestate/{realEstateId}")
    public ResponseEntity<Void> deleteRealEstate(@PathVariable Long realEstateId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/realestate")
    public ResponseEntity<RealEstateDto> updateRealEstate(@RequestBody RealEstateDto realEstateDto) {
        return ResponseEntity.ok(new RealEstateDto(
                        0L,
                        0L,
                        new ArrayList<>()
                )
        );
    }

    @GetMapping(value = "/premis/{premisId}")
    public ResponseEntity<PremisDto> getPremis(@PathVariable Long premisId) {
        return ResponseEntity.ok(new PremisDto(
                        0L,
                        "ABCDE",
                        123L,
                        345L,
                        new BigDecimal(123)
                )
        );
    }

    @GetMapping(value = "/premis")
    public ResponseEntity<List<PremisDto>> getPremises() {
        List<PremisDto> premisDtoList = new ArrayList<>();
        return ResponseEntity.ok(premisDtoList);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/premis")
    public ResponseEntity<Void> createPremis(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/premis/{premisId}")
    public ResponseEntity<Void> deletePremis(@PathVariable Long premisId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/premis")
    public ResponseEntity<PremisDto> updatePremis(@RequestBody PremisDto premisDto) {
        return ResponseEntity.ok(new PremisDto(
                        0L,
                        "ABCDE",
                        123L,
                        345L,
                        new BigDecimal(123)
                )
        );
    }

    @GetMapping(value = "/invoice/{invoiceId}")
    public ResponseEntity<InvoiceDto> getInvoice(@PathVariable Long invoiceId) {
        return ResponseEntity.ok(null );
    }

    @GetMapping(value = "/invoice")
    public ResponseEntity<List<InvoiceDto>> getInvoices() {
        List<InvoiceDto> invoiceDtoList = new ArrayList<>();
        return ResponseEntity.ok(invoiceDtoList);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/invoice")
    public ResponseEntity<Void> createInvoice(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/invoice/{invoiceId}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Long invoiceId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/invoice")
    public ResponseEntity<InvoiceDto> updateInvoice(@RequestBody InvoiceDto invoiceDto) {
        return ResponseEntity.ok(null );
    }

    @GetMapping(value = "/inv_entry/{invEntryId}")
    public ResponseEntity<InvoiceEntryDto> getInvoiceEntry(@PathVariable Long invEntryId) {
        return ResponseEntity.ok(new InvoiceEntryDto(
                        0L,
                        "Description",
                        new BigDecimal(1000),
                        0.123,
                        true
                )
        );
    }

    @GetMapping(value = "/inv_entry")
    public ResponseEntity<List<InvoiceEntryDto>> getInvoiceEntries() {
        List<InvoiceEntryDto> invoiceEntryDtoList = new ArrayList<>();
        return ResponseEntity.ok(invoiceEntryDtoList);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/inv_entry")
    public ResponseEntity<Void> createInvoiceEntry(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/inv_entry/{invoiceEntryId}")
    public ResponseEntity<Void> deleteInvoiceEntry(@PathVariable Long invoiceEntryId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/inv_entry")
    public ResponseEntity<InvoiceEntryDto> updateInvoiceEntry(@RequestBody InvoiceEntryDto invoiceEntryDto) {
        return ResponseEntity.ok(new InvoiceEntryDto(
                        0L,
                        "Description",
                        new BigDecimal(1000),
                        0.123,
                        true
                )
        );
    }
}
