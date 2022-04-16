package xyz.ridsoft.theater.dao;

import xyz.ridsoft.theater.vo.MovieVO;
import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
    public List<MovieVO> selectMovieList() throws Exception;
    public MovieVO selectMovieById(String movie_id) throws Exception;
    public void insertMovie(MovieVO movie) throws Exception;
    public void updateMovie(MovieVO movieVO) throws Exception;
    public void deleteMovie(String movie_id) throws Exception;
}
