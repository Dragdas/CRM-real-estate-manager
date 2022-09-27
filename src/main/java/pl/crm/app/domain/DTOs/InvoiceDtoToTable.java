package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@AllArgsConstructor
public class InvoiceDtoToTable {
    private Long id;
    private String invoiceIdentyfier;
    private String invoiceOwner;
    private String invoiceRecipient;
    private List<InvoiceEntryDto> invoiceEntriesDto;
}
