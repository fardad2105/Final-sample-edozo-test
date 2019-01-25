package com.dvdstore.service.Impl;

import com.dvdstore.model.tables.*;
import com.dvdstore.model.tables.pojos.Rental;
import com.dvdstore.service.RentalService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class RentalServiceImpl implements RentalService {

    @Autowired
    private DSLContext dsl;


    String SQl = "SELECT"+ Customer.CUSTOMER.FIRST_NAME+","+ City.CITY.CITY_+","+ Film.FILM.TITLE+
            "FROM"+ com.dvdstore.model.tables.Rental.RENTAL+"INNER JOIN"+ Customer.CUSTOMER+ "ON"+
            com.dvdstore.model.tables.Rental.RENTAL.RENTAL_ID+"="+Customer.CUSTOMER.CUSTOMER_ID+
            "INNER JOIN"+ Address.ADDRESS+"ON"+ Customer.CUSTOMER.ADDRESS_ID+"="+ Address.ADDRESS.ADDRESS_ID+
            "INNER JOIN"+City.CITY+"ON"+Address.ADDRESS.CITY_ID+"="+City.CITY.CITY_ID+
            "INNER JOIN"+ Inventory.INVENTORY+"ON"+ com.dvdstore.model.tables.Rental.RENTAL.INVENTORY_ID+"="+ Inventory.INVENTORY.INVENTORY_ID+
            "INNER JOIN"+ Film.FILM+"ON"+ Inventory.INVENTORY.FILM_ID+"="+Film.FILM.FILM_ID+
            "ORDER BY"+ com.dvdstore.model.tables.Rental.RENTAL.RENTAL_DATE+"ASC";


    String SQL_overdue = "SELECT"+ Customer.CUSTOMER.FIRST_NAME+","+ Address.ADDRESS.PHONE+"," + Film.FILM.TITLE+
            "FROM"+ com.dvdstore.model.tables.Rental.RENTAL+"INNER JOIN"+ Customer.CUSTOMER+ "ON"+
            com.dvdstore.model.tables.Rental.RENTAL.CUSTOMER_ID+"=" +Customer.CUSTOMER.CUSTOMER_ID+
            "INNER JOIN"+ Address.ADDRESS+"ON" +Customer.CUSTOMER.ADDRESS_ID+"="+Address.ADDRESS.ADDRESS_ID+
            "INNER JOIN"+ Inventory.INVENTORY+"ON" + com.dvdstore.model.tables.Rental.RENTAL.INVENTORY_ID+"="+Inventory.INVENTORY.INVENTORY_ID+
            "INNER JOIN"+ Film.FILM+"ON" + Inventory.INVENTORY.FILM_ID+"="+ Film.FILM.FILM_ID+
            "WHERE"+ com.dvdstore.model.tables.Rental.RENTAL.RETURN_DATE+"IS NULL AND"+
            com.dvdstore.model.tables.Rental.RENTAL.RENTAL_DATE+"+ INTERVAL '1 day' *"+ Film.FILM.RENTAL_DURATION+" <CURRENT_DATE LIMIT 5";


    @Override
    public String getRentals() {

        //List<Rental> rentals = new ArrayList<>();
        String Json = dsl.fetch(SQl).formatJSON();

        return Json;

    }

    @Override
    public Rental addRental(Rental rental) {

        Rental rental1 = (Rental) dsl.insertInto(com.dvdstore.model.tables.Rental.RENTAL,
                com.dvdstore.model.tables.Rental.RENTAL.RENTAL_ID,
                com.dvdstore.model.tables.Rental.RENTAL.RENTAL_DATE,
                com.dvdstore.model.tables.Rental.RENTAL.INVENTORY_ID,
                com.dvdstore.model.tables.Rental.RENTAL.CUSTOMER_ID,
                com.dvdstore.model.tables.Rental.RENTAL.RETURN_DATE,
                com.dvdstore.model.tables.Rental.RENTAL.STAFF_ID,
                com.dvdstore.model.tables.Rental.RENTAL.LAST_UPDATE)
                .values(rental.getRentalId(),rental.getRentalDate(),rental.getInventoryId(),
                        rental.getCustomerId(),rental.getReturnDate(),rental.getStaffId()
                ,rental.getLastUpdate());

        return rental1;
    }

    @Override
    public String getRentalOverdue() {

        // List<Rental> rentals = new ArrayList<>();
        String rental_overdue = dsl.fetch(SQL_overdue).formatJSON();
        return rental_overdue;
    }


}
