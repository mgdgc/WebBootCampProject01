package xyz.ridsoft.theater.service;

import xyz.ridsoft.theater.vo.MovieVO;

import java.util.List;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
    public List<MovieVO> selectMovieList() throws Exception;
    public MovieVO selectMovieById(String movie_id) throws Exception;
    public void insertMovie(MovieVO movie) throws Exception;
    public void updateMovie(MovieVO movie) throws Exception;
    public void deleteMovie(String movie_id) throws Exception;
}