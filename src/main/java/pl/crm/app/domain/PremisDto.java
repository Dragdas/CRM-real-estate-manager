package pl.crm.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class PremisDto {
    private Long id;
    private String identifier;
    private Long tenantId;
    private Long realEstateId;
    private BigDecimal rentFee;
}
