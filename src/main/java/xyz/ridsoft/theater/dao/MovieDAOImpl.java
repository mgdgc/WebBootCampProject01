package xyz.ridsoft.theater.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import xyz.ridsoft.theater.vo.MovieVO;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;
    private static final String test_namespace = "xyz.ridsoft.mybatis.sql.test";
    private static final String namespace = "xyz.ridsoft.mybatis.sql.movie";

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return sqlSession.selectList(test_namespace + ".selectMovie");
    }

    @Override
    public List<MovieVO> selectMovieList() throws Exception {
        return sqlSession.selectList(namespace + ".selectMovieList");
    }

    @Override
    public MovieVO selectMovieById(String movie_id) throws Exception {
        return sqlSession.selectOne(namespace + ".selectMovieById", movie_id);
    }

    @Override
    public void insertMovie(MovieVO movie) throws Exception {
        sqlSession.insert(namespace + ".insertMovie", movie);
    }

    @Override
    public void updateMovie(MovieVO movieVO) throws Exception {
        sqlSession.update(namespace + ".updateMovie", movieVO);
    }

    @Override
    public void deleteMovie(String movie_id) throws Exception {
        sqlSession.delete(namespace + ".deleteMovie", movie_id);
    }
}
