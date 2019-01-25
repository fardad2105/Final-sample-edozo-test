package com.dvdstore.controller;


import com.dvdstore.Exception.CustomeErrorType;
import com.dvdstore.model.tables.pojos.Film;
import com.dvdstore.service.Impl.MovieServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    public static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieServiceImpl movieService;

    /**
     *
     * @param filmId
     * @return  return movie with id in json format
     */

    @GetMapping(value = "/movies/{filmId}", produces = "application/json")
    public ResponseEntity<?> findById(@PathVariable int filmId)
    {

        //FilmRecord record = service.findOne(filmId);
        Film film = movieService.findById(filmId);
        if (film == null)
        {
            logger.info("Movie with id {} not found",filmId);
            return new ResponseEntity<>(new CustomeErrorType("Movie with id"+filmId+"not found"), HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

    /**
     *
     * @return retuen All Movie in Json format
     */

    @GetMapping(value = "/movies",produces = "application/json")
    public ResponseEntity<List<Film>> getAllMovie()
    {
        List<Film> films = movieService.getAllMovies();
        if (films.isEmpty())
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<List<Film>>(films,HttpStatus.OK);
    }
}
