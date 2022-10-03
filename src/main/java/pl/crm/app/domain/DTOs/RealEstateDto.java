package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class RealEstateDto {
    private Long id;
    private Long ownerId;
    private List<PremiseDto> premises;
}
