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
}
