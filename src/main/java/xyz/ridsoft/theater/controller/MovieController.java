package xyz.ridsoft.theater.controller;

import com.google.gson.Gson;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.ibatis.annotations.Update;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.ridsoft.theater.service.MovieService;
import xyz.ridsoft.theater.vo.MovieVO;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

@RestController
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Inject
    private MovieService service;

    @GetMapping(value = "/movies", produces="application/json;charset=UTF-8")
    public String getMovies(Locale locale) throws Exception {
        logger.debug("GET: movies");

        List<MovieVO> movieList = service.selectMovie();

        return new Gson().toJson(movieList);
    }

    @GetMapping(value = "/movies/{movie_id}", produces="application/json;charset=UTF-8")
    public String findMovieById(Locale locale, @PathVariable(name = "movie_id") String movie_id) throws Exception {
        logger.debug("GET: movies" + movie_id);

        MovieVO movie = service.selectMovieById(movie_id);

        return new Gson().toJson(movie);
    }

    @PostMapping(value = "/movies")
    public void insertMovie(Locale locale, @RequestParam String movie_id, @RequestParam String movie_name, @RequestParam String director, @RequestParam String type, @RequestParam String moviecol) throws Exception {
        logger.debug("POST: movies");

        MovieVO movie = new MovieVO(movie_id, movie_name, director, type, moviecol);

        service.insertMovie(movie);
    }

    @PutMapping(value = "/movies")
    public void updateMovie(Locale locale, @RequestParam String movie_id, @RequestParam String movie_name, @RequestParam String director, @RequestParam String type, @RequestParam String moviecol) throws Exception {
        logger.debug("PUT: movies");

        MovieVO movie = new MovieVO(movie_id, movie_name, director, type, moviecol);

        service.updateMovie(movie);
    }

    @DeleteMapping(value = "/movies")
    public void deleteMovie(Locale locale, @RequestParam String movie_id) throws Exception {
        logger.debug("DELETE: movies");

        service.deleteMovie(movie_id);
    }
}
