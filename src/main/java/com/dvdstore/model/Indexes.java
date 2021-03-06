/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model;


import com.dvdstore.model.tables.Actor;
import com.dvdstore.model.tables.Address;
import com.dvdstore.model.tables.Category;
import com.dvdstore.model.tables.City;
import com.dvdstore.model.tables.Country;
import com.dvdstore.model.tables.Customer;
import com.dvdstore.model.tables.Film;
import com.dvdstore.model.tables.FilmActor;
import com.dvdstore.model.tables.FilmCategory;
import com.dvdstore.model.tables.Inventory;
import com.dvdstore.model.tables.Language;
import com.dvdstore.model.tables.Payment;
import com.dvdstore.model.tables.Rental;
import com.dvdstore.model.tables.Staff;
import com.dvdstore.model.tables.Store;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACTOR_PKEY = Indexes0.ACTOR_PKEY;
    public static final Index IDX_ACTOR_LAST_NAME = Indexes0.IDX_ACTOR_LAST_NAME;
    public static final Index ADDRESS_PKEY = Indexes0.ADDRESS_PKEY;
    public static final Index IDX_FK_CITY_ID = Indexes0.IDX_FK_CITY_ID;
    public static final Index CATEGORY_PKEY = Indexes0.CATEGORY_PKEY;
    public static final Index CITY_PKEY = Indexes0.CITY_PKEY;
    public static final Index IDX_FK_COUNTRY_ID = Indexes0.IDX_FK_COUNTRY_ID;
    public static final Index COUNTRY_PKEY = Indexes0.COUNTRY_PKEY;
    public static final Index CUSTOMER_PKEY = Indexes0.CUSTOMER_PKEY;
    public static final Index IDX_FK_ADDRESS_ID = Indexes0.IDX_FK_ADDRESS_ID;
    public static final Index IDX_FK_STORE_ID = Indexes0.IDX_FK_STORE_ID;
    public static final Index IDX_LAST_NAME = Indexes0.IDX_LAST_NAME;
    public static final Index FILM_FULLTEXT_IDX = Indexes0.FILM_FULLTEXT_IDX;
    public static final Index FILM_PKEY = Indexes0.FILM_PKEY;
    public static final Index IDX_FK_LANGUAGE_ID = Indexes0.IDX_FK_LANGUAGE_ID;
    public static final Index IDX_TITLE = Indexes0.IDX_TITLE;
    public static final Index FILM_ACTOR_PKEY = Indexes0.FILM_ACTOR_PKEY;
    public static final Index IDX_FK_FILM_ID = Indexes0.IDX_FK_FILM_ID;
    public static final Index FILM_CATEGORY_PKEY = Indexes0.FILM_CATEGORY_PKEY;
    public static final Index IDX_STORE_ID_FILM_ID = Indexes0.IDX_STORE_ID_FILM_ID;
    public static final Index INVENTORY_PKEY = Indexes0.INVENTORY_PKEY;
    public static final Index LANGUAGE_PKEY = Indexes0.LANGUAGE_PKEY;
    public static final Index IDX_FK_CUSTOMER_ID = Indexes0.IDX_FK_CUSTOMER_ID;
    public static final Index IDX_FK_RENTAL_ID = Indexes0.IDX_FK_RENTAL_ID;
    public static final Index IDX_FK_STAFF_ID = Indexes0.IDX_FK_STAFF_ID;
    public static final Index PAYMENT_PKEY = Indexes0.PAYMENT_PKEY;
    public static final Index IDX_FK_INVENTORY_ID = Indexes0.IDX_FK_INVENTORY_ID;
    public static final Index IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID = Indexes0.IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID;
    public static final Index RENTAL_PKEY = Indexes0.RENTAL_PKEY;
    public static final Index STAFF_PKEY = Indexes0.STAFF_PKEY;
    public static final Index IDX_UNQ_MANAGER_STAFF_ID = Indexes0.IDX_UNQ_MANAGER_STAFF_ID;
    public static final Index STORE_PKEY = Indexes0.STORE_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index ACTOR_PKEY = createIndex("actor_pkey", Actor.ACTOR, new OrderField[] { Actor.ACTOR.ACTOR_ID }, true);
        public static Index IDX_ACTOR_LAST_NAME = createIndex("idx_actor_last_name", Actor.ACTOR, new OrderField[] { Actor.ACTOR.LAST_NAME }, false);
        public static Index ADDRESS_PKEY = createIndex("address_pkey", Address.ADDRESS, new OrderField[] { Address.ADDRESS.ADDRESS_ID }, true);
        public static Index IDX_FK_CITY_ID = createIndex("idx_fk_city_id", Address.ADDRESS, new OrderField[] { Address.ADDRESS.CITY_ID }, false);
        public static Index CATEGORY_PKEY = createIndex("category_pkey", Category.CATEGORY, new OrderField[] { Category.CATEGORY.CATEGORY_ID }, true);
        public static Index CITY_PKEY = createIndex("city_pkey", City.CITY, new OrderField[] { City.CITY.CITY_ID }, true);
        public static Index IDX_FK_COUNTRY_ID = createIndex("idx_fk_country_id", City.CITY, new OrderField[] { City.CITY.COUNTRY_ID }, false);
        public static Index COUNTRY_PKEY = createIndex("country_pkey", Country.COUNTRY, new OrderField[] { Country.COUNTRY.COUNTRY_ID }, true);
        public static Index CUSTOMER_PKEY = createIndex("customer_pkey", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
        public static Index IDX_FK_ADDRESS_ID = createIndex("idx_fk_address_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.ADDRESS_ID }, false);
        public static Index IDX_FK_STORE_ID = createIndex("idx_fk_store_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.STORE_ID }, false);
        public static Index IDX_LAST_NAME = createIndex("idx_last_name", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.LAST_NAME }, false);
        public static Index FILM_FULLTEXT_IDX = createIndex("film_fulltext_idx", Film.FILM, new OrderField[] { Film.FILM.FULLTEXT }, false);
        public static Index FILM_PKEY = createIndex("film_pkey", Film.FILM, new OrderField[] { Film.FILM.FILM_ID }, true);
        public static Index IDX_FK_LANGUAGE_ID = createIndex("idx_fk_language_id", Film.FILM, new OrderField[] { Film.FILM.LANGUAGE_ID }, false);
        public static Index IDX_TITLE = createIndex("idx_title", Film.FILM, new OrderField[] { Film.FILM.TITLE }, false);
        public static Index FILM_ACTOR_PKEY = createIndex("film_actor_pkey", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
        public static Index IDX_FK_FILM_ID = createIndex("idx_fk_film_id", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.FILM_ID }, false);
        public static Index FILM_CATEGORY_PKEY = createIndex("film_category_pkey", FilmCategory.FILM_CATEGORY, new OrderField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
        public static Index IDX_STORE_ID_FILM_ID = createIndex("idx_store_id_film_id", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.STORE_ID, Inventory.INVENTORY.FILM_ID }, false);
        public static Index INVENTORY_PKEY = createIndex("inventory_pkey", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
        public static Index LANGUAGE_PKEY = createIndex("language_pkey", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
        public static Index IDX_FK_CUSTOMER_ID = createIndex("idx_fk_customer_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.CUSTOMER_ID }, false);
        public static Index IDX_FK_RENTAL_ID = createIndex("idx_fk_rental_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.RENTAL_ID }, false);
        public static Index IDX_FK_STAFF_ID = createIndex("idx_fk_staff_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.STAFF_ID }, false);
        public static Index PAYMENT_PKEY = createIndex("payment_pkey", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.PAYMENT_ID }, true);
        public static Index IDX_FK_INVENTORY_ID = createIndex("idx_fk_inventory_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.INVENTORY_ID }, false);
        public static Index IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID = createIndex("idx_unq_rental_rental_date_inventory_id_customer_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_DATE, Rental.RENTAL.INVENTORY_ID, Rental.RENTAL.CUSTOMER_ID }, true);
        public static Index RENTAL_PKEY = createIndex("rental_pkey", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_ID }, true);
        public static Index STAFF_PKEY = createIndex("staff_pkey", Staff.STAFF, new OrderField[] { Staff.STAFF.STAFF_ID }, true);
        public static Index IDX_UNQ_MANAGER_STAFF_ID = createIndex("idx_unq_manager_staff_id", Store.STORE, new OrderField[] { Store.STORE.MANAGER_STAFF_ID }, true);
        public static Index STORE_PKEY = createIndex("store_pkey", Store.STORE, new OrderField[] { Store.STORE.STORE_ID }, true);
    }
}
