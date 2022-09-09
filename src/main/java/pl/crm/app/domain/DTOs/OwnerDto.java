package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class OwnerDto {
    private Long id;
    private String name;
    private List<InvoiceDto> invoices;
    private ManagerAccountDto manager;
}
