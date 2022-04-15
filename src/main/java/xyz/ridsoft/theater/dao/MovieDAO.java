package xyz.ridsoft.theater.dao;

import xyz.ridsoft.theater.vo.MovieVO;
import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
