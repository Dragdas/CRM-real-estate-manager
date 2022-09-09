package pl.crm.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class TenantAccountDto {
    private Long id;
    private String userName;
    private String password;
    private List<InvoiceDto> invoices;
}
