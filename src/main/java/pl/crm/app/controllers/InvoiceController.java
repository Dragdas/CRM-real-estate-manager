package pl.crm.app.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.*;
import pl.crm.app.domain.mappers.InvoiceMapper;
import pl.crm.app.domain.models.Invoice;
import pl.crm.app.errorHandling.exceptions.InvoiceNotFoundException;
import pl.crm.app.errorHandling.exceptions.TenantNotFoundException;
import pl.crm.app.services.InvoiceService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;
    private final InvoiceMapper invoiceMapper;

    //Get Invoices by tenants Id
    @GetMapping(value = "/inv_ten_id/{tenantId}")
    public ResponseEntity<List<InvoiceDtoToTable>> getInvoicesByTenantId
    (@PathVariable Long tenantId) throws TenantNotFoundException {
        List<Invoice> invoicesOfTenantFromDb = invoiceService.getInvoiceByTenantId(tenantId);
        return ResponseEntity.ok(invoiceMapper.InvoiceListToListDto(invoicesOfTenantFromDb));
    }

    //Get invoice by id
    @GetMapping(value = "/inv_id/{invoiceId}")
    public ResponseEntity<InvoiceDtoToTable> getInvoicesById
    (@PathVariable Long invoiceId) throws InvoiceNotFoundException {
        Invoice invoice = invoiceService.getInvoiceByInvoiceId(invoiceId);
        return ResponseEntity.ok(invoiceMapper.mapToInvoiceDto(invoice));
    }



}
