package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;

@Getter
@AllArgsConstructor
public class TenantAccountDto {

    @Nullable
    private Long id;
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @Nullable
    private List<InvoiceDto> invoices;
}
