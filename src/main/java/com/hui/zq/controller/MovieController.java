package com.hui.zq.controller;

import com.hui.zq.annotations.ResponseResult;
import com.hui.zq.model.po.Movie;
import com.hui.zq.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MovieController
 * @Description TODO
 * @Author zq
 * Date 2019/9/1 15:51
 * Version 1.0
 */
@ResponseResult
@RequestMapping("/movie")
@RestController
@Api(tags = "Movie相关接口 @ 郑权", description = "MovieController")
public class MovieController {

    @Resource
    private MovieService movieService;

    @GetMapping("/movieList")
    @ResponseBody
    @ApiOperation("查询全部信息")
    public List<Movie> movieList() {
        List<Movie> list = movieService.selectAllMovie();
        return list;
    }

}
