package pl.crm.app.domain.mappers;

import org.springframework.stereotype.Service;
import pl.crm.app.domain.DTOs.OwnersDataDTOtoTable;
import pl.crm.app.domain.models.Owner;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerMapper {

    public OwnersDataDTOtoTable mapToOwnerDto(Owner owner) {
        return new OwnersDataDTOtoTable(
                owner.getId(),
                owner.getOwnerName(),
                owner.getForwardingAddress(),
                owner.getDataToInvoice(),
                owner.getApartmentAddress()
        );
    }

    public Owner mapToOwner(OwnersDataDTOtoTable ownersDataDTOtoTable) {
        return new Owner(
                ownersDataDTOtoTable.getOwnerId(),
                ownersDataDTOtoTable.getPersonalData(),
                ownersDataDTOtoTable.getForwardingAddress(),
                ownersDataDTOtoTable.getDataToInvoice(),
                ownersDataDTOtoTable.getApartmentAddress()
        );
    }

    public List<OwnersDataDTOtoTable> mapToOwnerDtoList(List<Owner> ownerList) {
        return ownerList.stream().
                map(this::mapToOwnerDto)
                .collect(Collectors.toList());
    }
}
