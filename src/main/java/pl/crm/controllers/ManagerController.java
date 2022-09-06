package pl.crm.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.domain.TenantAccountDto;

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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/manager")
    public ResponseEntity<Void> createManagerAccount(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/tenant/{managerId}")
    public ResponseEntity<Void> deleteManagerAccount(@PathVariable Long managerId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/owner")
    public ResponseEntity<Void> createOwner(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/realestate")
    public ResponseEntity<Void> createRealEstate(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/premis")
    public ResponseEntity<Void> createPremis(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/invoice")
    public ResponseEntity<Void> createInvoice(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/inv_entry")
    public ResponseEntity<Void> createInvoiceEntry(@RequestBody TenantAccountDto tenantAccountDto) {
        return ResponseEntity.ok().build();
    }
}
