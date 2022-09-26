package pl.crm.app.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.OwnersDataDTOtoTable;
import pl.crm.app.domain.mappers.OwnerMapper;
import pl.crm.app.domain.models.Owner;
import pl.crm.app.errorHandling.exceptions.OwnerNotFoundException;
import pl.crm.app.services.OwnerService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/owners")
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;
    private final OwnerMapper ownerMapper;

    @GetMapping
    public ResponseEntity<List<OwnersDataDTOtoTable>> getOwners() {
        List<Owner> owners = ownerService.getAllOwners();
        return ResponseEntity.ok(ownerMapper.mapToOwnerDtoList(owners));
    }

    @GetMapping(value = "{ownerId}")
    public ResponseEntity<OwnersDataDTOtoTable> getOwner(@PathVariable Long ownerId) throws OwnerNotFoundException {
        return ResponseEntity.ok(ownerMapper.mapToOwnerDto(ownerService.getOwner(ownerId)));
    }

    @DeleteMapping(value = "{ownerId}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long ownerId) throws OwnerNotFoundException {
        ownerService.deleteOwner(ownerId);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<OwnersDataDTOtoTable> updateOwner(@RequestBody OwnersDataDTOtoTable ownersDataDTOtoTable) {
        Owner owner = ownerMapper.mapToOwner(ownersDataDTOtoTable);
        Owner savedOwner = ownerService.saveOwner(owner);
        return ResponseEntity.ok(ownerMapper.mapToOwnerDto(savedOwner));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createOwner(@RequestBody OwnersDataDTOtoTable ownersDataDTOtoTable) {
        Owner owner = ownerMapper.mapToOwner(ownersDataDTOtoTable);
        ownerService.saveOwner(owner);
        return ResponseEntity.ok().build();
    }
}
