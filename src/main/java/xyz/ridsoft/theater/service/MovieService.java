package xyz.ridsoft.theater.service;

import xyz.ridsoft.theater.vo.MovieVO;

import java.util.List;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}