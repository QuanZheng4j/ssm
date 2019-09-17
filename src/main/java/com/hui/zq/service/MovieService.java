package com.hui.zq.service;

import com.hui.zq.model.po.Movie;

import java.util.List;

/**
 * @ClassName MovieService
 * @Description TODO
 * @Author zq
 * Date 2019/9/1 15:49
 * Version 1.0
 */
public interface MovieService {
    /**
     * @author zq
     * 查询全部信息
     */
    List<Movie> selectAllMovie();
}
