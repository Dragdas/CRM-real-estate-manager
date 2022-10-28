package pl.crm.app.domain.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OwnersDataDTOtoTable {
    private Long id;
    private String personalData;
    private String forwardingAddress;
    private String dataToInvoice;
    private String addressToInvoice;
}
