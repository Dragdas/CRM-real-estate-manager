package pl.crm.app.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.InvoiceDto;
import pl.crm.app.domain.DTOs.TenantAccountDto;
import pl.crm.app.domain.models.Tenant;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;
import pl.crm.app.services.TenantService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/tenants")
public class TenantController {

    private final TenantService tenantService;

    @GetMapping
    public ResponseEntity<List<Tenant>> getTenants() {

        return ResponseEntity.ok(tenantService.getAllTenants());
    }

    @GetMapping(value = "/byOwner/{ownerId}")//todo by Krzysiek
    public ResponseEntity<List<Tenant>> getTenantsByOwnerId(@PathVariable Long ownerId) {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(value = "/byRealEstate/{realEstateId}")//todo by Krzysiek
    public ResponseEntity<List<Tenant>> getTenantsByRealEstateId(@PathVariable Long realEstateId) {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(value = "{tenantId}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable Long tenantId) throws TenantNotFoundException {
        return ResponseEntity.ok(tenantService.getTenantBy(tenantId));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tenant> addTenant(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok(tenantService.addTenant(tenantAccountDto));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)//todo by Krzysiek rozbić na akcje w stylu add invoice, rent premiss, leave premis
    public ResponseEntity<Tenant> updateTenant(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok(new Tenant(0L, "Aaaaaa", "Bbbbb", Collections.emptyList(),Collections.emptyList()));
    }

    @DeleteMapping(value = "{tenantId}")//todo by Krzysiek
    public ResponseEntity<Void> updateTenant(@PathVariable Long tenantId) {

        return ResponseEntity.ok().build();
    }
}
