package xyz.ridsoft.theater.service;

import org.springframework.stereotype.Service;
import xyz.ridsoft.theater.dao.MovieDAO;
import xyz.ridsoft.theater.vo.MovieVO;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return dao.selectMovie();
    }

    @Override
    public List<MovieVO> selectMovieList() throws Exception {
        return dao.selectMovieList();
    }

    @Override
    public MovieVO selectMovieById(String movie_id) throws Exception {
        return dao.selectMovieById(movie_id);
    }

    @Override
    public void insertMovie(MovieVO movie) throws Exception {
        dao.insertMovie(movie);
    }

    @Override
    public void updateMovie(MovieVO movie) throws Exception {
        dao.updateMovie(movie);
    }

    @Override
    public void deleteMovie(String movie_id) throws Exception {
        dao.deleteMovie(movie_id);
    }
}
