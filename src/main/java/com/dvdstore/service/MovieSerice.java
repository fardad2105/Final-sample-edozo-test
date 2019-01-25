package com.dvdstore.service;

import com.dvdstore.model.tables.pojos.Film;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MovieSerice {

    @Transactional
    Film findById(int id);

    @Transactional
    List<Film> getAllMovies();
}
