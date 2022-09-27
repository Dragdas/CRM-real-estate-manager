package pl.crm.app.domain.mappers;

import org.springframework.stereotype.Service;
import pl.crm.app.domain.DTOs.InvoiceEntryDto;
import pl.crm.app.domain.models.InvoiceEntry;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceEntryMapper {

    public InvoiceEntryDto mapEntryToDto (InvoiceEntry invoiceEntry) {
        return new InvoiceEntryDto(invoiceEntry.getId(), invoiceEntry.getDescription(),
                invoiceEntry.getNetValue(), invoiceEntry.getVatRate(), invoiceEntry.isSettled());
    }

    public List<InvoiceEntryDto> mapEntryListToDto (List<InvoiceEntry> invoiceEntries) {
        return invoiceEntries.stream()
                .map(this::mapEntryToDto)
                .collect(Collectors.toList());
    }
}
