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
    private static final String namespace = "xyz.ridsoft.mybatis.sql.test";

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return sqlSession.selectList(namespace + ".selectMovie");
    }
}
