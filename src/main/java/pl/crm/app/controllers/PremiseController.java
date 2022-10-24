package pl.crm.app.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.crm.app.domain.DTOs.PremiseDto;
import pl.crm.app.domain.models.Premise;
import pl.crm.app.errorHandling.exceptions.PremiseNotFound;
import pl.crm.app.errorHandling.exceptions.RealEstateNotFound;
import pl.crm.app.services.PremiseService;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/premise")
public class PremiseController {

    private final PremiseService premiseService;


    @GetMapping
    public ResponseEntity<List<Premise>> getPremises() {
        return ResponseEntity.ok(premiseService.getAllPremises());
    }

    @GetMapping(value = "/byId/{premiseId}")
    public ResponseEntity<Premise> getPremiseById(@PathVariable Long premiseId)
            throws PremiseNotFound {
        return ResponseEntity.ok(premiseService.getById(premiseId));
    }

    @GetMapping(value = "/byTenantId/{tenantId}")
    public ResponseEntity<List<Premise>> getPremisesByTenantId(@PathVariable Long tenantId){
        return ResponseEntity.ok(premiseService.getPremisesByTenantId(tenantId));
    }

    @GetMapping(value = "/byOwnerId/{ownerId}")
    public ResponseEntity<List<Premise>> getPremisesByOwnerId(@PathVariable Long ownerId){
        return ResponseEntity.ok(premiseService.getPremisesByOwner(ownerId));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Premise> addPremise(@RequestBody PremiseDto premiseDto)
            throws RealEstateNotFound {
        return ResponseEntity.ok(premiseService.addPremise(premiseDto));
    }

    //edit
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Premise> updatePremise(@RequestBody PremiseDto premiseDto)
            throws PremiseNotFound, RealEstateNotFound {
        return ResponseEntity.ok(premiseService.updatePremise(premiseDto));
    }


    //delete ?// TODO przemysłeć jak to bedzie działać



}
