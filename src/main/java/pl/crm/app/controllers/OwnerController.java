package pl.crm.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.crm.app.domain.DTOs.ManagerAccountDto;
import pl.crm.app.domain.DTOs.OwnerDto;

import java.util.ArrayList;


@RestController
@RequestMapping("/v1/owners")
public class OwnerController {

    //Get Owner by Id
    @GetMapping(value = "/own_id/{ownerId}")
    public ResponseEntity<OwnerDto> getOwnerById(@PathVariable Long ownerId) {
        return ResponseEntity.ok(new OwnerDto(
                        0L,
                        "Piotr",
                        new ArrayList<>(),
                        new ManagerAccountDto(
                                0L,
                                "Manager1",
                                "password123",
                                new ArrayList<>()
                        )
                )
        );
    }


}
