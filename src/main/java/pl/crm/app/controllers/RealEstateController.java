package pl.crm.app.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.RealEstateDto;
import pl.crm.app.domain.models.RealEstate;
import pl.crm.app.errorHandling.exceptions.OwnerNotFoundException;
import pl.crm.app.errorHandling.exceptions.PremiseNotFound;
import pl.crm.app.errorHandling.exceptions.RealEstateNotFound;
import pl.crm.app.services.RealEstateService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/realestate")
public class RealEstateController {

    private final RealEstateService realEstateService;

    @GetMapping
    public ResponseEntity<List<RealEstate>> getRealEstates() {

        return ResponseEntity.ok(realEstateService.getAllRealEstates());
    }

    @GetMapping(value = "/id/{realEstateId}")
    public ResponseEntity<RealEstate> getRealEstatesById(@PathVariable Long realEstateId)
            throws RealEstateNotFound {

        return ResponseEntity.ok(realEstateService.getRealEstateById(realEstateId));
    }

    @GetMapping(value = "/owner/{ownerId}")
    public ResponseEntity<List<RealEstate>> getRealEstatesByOwner(@PathVariable Long ownerId) {
        return ResponseEntity.ok(realEstateService.getRealEstatesByOwner(ownerId));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RealEstate> addRealEstate(@RequestBody RealEstateDto realEstateDto)
            throws OwnerNotFoundException {
        return ResponseEntity.ok(realEstateService.addRealEstate(realEstateDto));
    }

    @PutMapping(value = "/updateOwner")
    public ResponseEntity<RealEstate> updateRealEstateOwner(@RequestParam long realEstateID,
                                                            @RequestParam long newOwnerId)
                                                            throws OwnerNotFoundException,
                                                            RealEstateNotFound {
        return ResponseEntity.ok(realEstateService.updateOwner(realEstateID,newOwnerId));
    }

    @PutMapping(value = "/addPremise")
    public ResponseEntity<RealEstate> addPremise(@RequestParam long realEstateId,
                                                 @RequestParam long newPremiseId)
                                                throws RealEstateNotFound,
                                                PremiseNotFound {
        return ResponseEntity.ok(realEstateService.updateAddPremise(realEstateId, newPremiseId));
    }




    //update - delete premis //TODO by krzysiek - przemy??le?? zabezpieczenia, kaskadowanie itp
    //delete - niemo??liwe je??eli s?? jakie?? lokale //TODO by krzysiek





}
