package pl.crm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class RealEstateDto {
    private Long id;
    private Long ownerId;
    private List<PremisDto> premises;
}
