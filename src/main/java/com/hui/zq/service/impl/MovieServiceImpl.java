package com.hui.zq.service.impl;

import com.hui.zq.dao.mapper.MovieMapper;
import com.hui.zq.model.po.Movie;
import com.hui.zq.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MovieServiceImpl
 * @Description TODO
 * @Author zq
 * Date 2019/9/1 15:50
 * Version 1.0
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;

    @Override
    public List<Movie> selectAllMovie() {
        List<Movie> list = movieMapper.selectAllMovie();
        return list;
    }
}
