package com.dvdstore.controller;


import com.dvdstore.model.tables.pojos.Rental;
import com.dvdstore.service.Impl.RentalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class RentalController {

    @Autowired
    private RentalServiceImpl rentalService;

    /**
     *
     * @return string value with json format , that i retrieve this json
     * from rental service side and convert result query to json with jooq methods
     */

    @GetMapping(value = "/rentals",produces = "application/Json")
    public String getRentals()
    {
        return rentalService.getRentals();
    }


    @PostMapping(value = "/rental",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> saveRental(@RequestBody Rental rental)
    {
        Rental saveRental = rentalService.addRental(rental);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(saveRental.getRentalId()).toUri();

        return ResponseEntity.created(location).build();
    }

    /**
     *
     * @return string value with json format , that i retrieve this json
     * from rental service side and convert result query to json with jooq methods
     */
    @GetMapping(value = "/rental/overdue ",produces = "application/Json")
    public String getRentalOverdue()
    {
        return rentalService.getRentalOverdue();
    }
}
