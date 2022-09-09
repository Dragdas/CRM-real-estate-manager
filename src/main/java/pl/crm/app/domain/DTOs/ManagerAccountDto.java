package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ManagerAccountDto {
    private Long id;
    private String userName;
    private String password;
    private List<OwnerDto> owners;
}
