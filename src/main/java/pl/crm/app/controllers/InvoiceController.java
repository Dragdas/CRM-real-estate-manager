package pl.crm.app.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.crm.app.domain.DTOs.InvoiceDto;
import pl.crm.app.domain.DTOs.ManagerAccountDto;
import pl.crm.app.domain.DTOs.OwnerDto;
import pl.crm.app.domain.DTOs.TenantAccountDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/invoices")
public class InvoiceController {

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



}
