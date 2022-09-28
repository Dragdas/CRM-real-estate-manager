package pl.crm.app.domain.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.crm.app.domain.DTOs.InvoiceDto;
import pl.crm.app.domain.DTOs.InvoiceDtoToTable;
import pl.crm.app.domain.models.Invoice;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceMapper {

    private final InvoiceEntryMapper invoiceEntryMapper;

    public InvoiceDtoToTable mapToInvoiceDto (Invoice invoice) {
        return new InvoiceDtoToTable(invoice.getId(), invoice.getInvoiceIdentyfier(),
                invoice.getIssuer().getOwnerName(), invoice.getRecipient().getUserName(),
                invoiceEntryMapper.mapEntryListToDto(invoice.getInvoiceEntries()));
    }

    public List<InvoiceDtoToTable> InvoiceListToListDto (List<Invoice> invoices) {
        return invoices.stream()
                .map(this::mapToInvoiceDto)
                .collect(Collectors.toList());
    }
}
