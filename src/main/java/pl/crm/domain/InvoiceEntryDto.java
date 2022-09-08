package pl.crm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
public class InvoiceEntryDto {
    private Long id;
    private String description;
    private BigDecimal netValue;
    private double vatRate;
    private boolean settled;
}
