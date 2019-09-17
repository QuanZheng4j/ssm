package com.hui.zq.dao.mapper;

import com.hui.zq.model.po.Movie;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface MovieMapper extends Mapper<Movie> {
    /**
     * @author zq
     * 查询全部信息
     */
    List<Movie> selectAllMovie();
}