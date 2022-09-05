package pl.crm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class InvoiceDto {
    private Long id;
    private OwnerDto issuer;
    private TenantAccountDto recipient;
    private List<InvoiceEntryDto> invoiceEntries;
    private String invoiceIdentifier;
}
