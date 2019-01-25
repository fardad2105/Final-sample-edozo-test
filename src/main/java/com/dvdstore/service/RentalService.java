package com.dvdstore.service;

import com.dvdstore.model.tables.pojos.Rental;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RentalService {

    @Transactional
    String getRentals();

    @Transactional
    Rental addRental(Rental rental);

    @Transactional
    String getRentalOverdue();
}
