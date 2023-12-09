package com.hdu.train.controller;

import com.hdu.train.util.Result;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2023-12-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    public Result hello(){
        return Result.ok().data("hello","world");
    }
}
