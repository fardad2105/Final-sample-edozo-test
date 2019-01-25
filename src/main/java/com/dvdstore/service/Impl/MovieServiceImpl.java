package com.dvdstore.service.Impl;

import com.dvdstore.model.enums.MpaaRating;
import com.dvdstore.model.tables.pojos.Film;
import com.dvdstore.model.tables.records.FilmRecord;
import com.dvdstore.service.MovieSerice;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.dvdstore.model.tables.Film.FILM;

@Service
@Transactional
public class MovieServiceImpl implements MovieSerice {


    @Autowired
    private DSLContext dsl;

    @Override
    public Film findById(int id) {

        Record record = dsl.select().from(FILM).where(FILM.FILM_ID.eq(id)).fetchOne();
        Film film = null;
        if (record !=null)
        {
            film =getMovieEntity(record);
        }

        return film;
    }

    @Override
    public List<Film> getAllMovies() {

        List<Film> films = new ArrayList<>();
        Result<Record> records = dsl.select().from(FILM).fetch();

        for (Record r: records)
        {
            films.add(getMovieEntity(r));
        }
        return films;
    }


    private Film getMovieEntity(Record r){
        Integer id = r.getValue(FILM.FILM_ID, Integer.class);
        String title = r.getValue(FILM.TITLE, String.class);
        String desc = r.getValue(FILM.DESCRIPTION, String.class);
        Integer release_year = r.getValue(FILM.RELEASE_YEAR,Integer.class);
        Short languageId = r.getValue(FILM.LANGUAGE_ID,Short.class);
        Short rentalDuration = r.getValue(FILM.RENTAL_DURATION,Short.class);
        BigDecimal rentalRate = r.getValue(FILM.RENTAL_RATE,BigDecimal.class);
        Short length = r.getValue(FILM.LENGTH,Short.class);
        BigDecimal replacementCost = r.getValue(FILM.REPLACEMENT_COST,BigDecimal.class);
        MpaaRating rating = r.getValue(FILM.RATING,MpaaRating.class);
        Timestamp lastUpdate = r.getValue(FILM.LAST_UPDATE,Timestamp.class);
        String[]  specialFeatures = r.getValue(FILM.SPECIAL_FEATURES,String[].class);

        return new Film(id,title,desc,release_year,languageId,rentalDuration,rentalRate,length,replacementCost
        ,rating,lastUpdate,specialFeatures,null);
    }
}
