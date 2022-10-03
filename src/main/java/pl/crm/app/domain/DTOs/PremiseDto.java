package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class PremiseDto {
    private Long id;
    private String identifier;
    private Long tenantId;
    private Long realEstateId;
    private BigDecimal rentFee;
}
