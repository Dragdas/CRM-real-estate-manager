package pl.crm.app.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.InvoiceDto;
import pl.crm.app.domain.DTOs.TenantAccountDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/tenants")
public class TenantController {

    @GetMapping
    public ResponseEntity<List<TenantAccountDto>> getTenants() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(value = "/byOwner/{ownerId}")
    public ResponseEntity<List<TenantAccountDto>> getTenantsByOwnerId(@PathVariable Long ownerId) {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(value = "/byRealEstate/{realEstateId}")
    public ResponseEntity<List<TenantAccountDto>> getTenantsByRealEstateId(@PathVariable Long realEstateId) {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(value = "{tenantId}")
    public ResponseEntity<TenantAccountDto> getTenantById(@PathVariable Long tenantId) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new TenantAccountDto(0L, "Aaaaaa", "Bbbbb", invoiceDtos));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TenantAccountDto> addTenant(@RequestBody TenantAccountDto tenantAccountDto) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new TenantAccountDto(0L, "Aaaaaa", "Bbbbb", invoiceDtos));
    }

    //Edit tenant
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TenantAccountDto> updateTenant(@RequestBody TenantAccountDto tenantAccountDto) {
        List<InvoiceDto> invoiceDtos = new ArrayList<>();
        return ResponseEntity.ok(new TenantAccountDto(0L, "Aaaaaa", "Bbbbb", invoiceDtos));
    }

    @DeleteMapping(value = "{tenantId}")
    public ResponseEntity<Void> updateTenant(@PathVariable Long tenantId) {
        return ResponseEntity.ok().build();
    }
}
