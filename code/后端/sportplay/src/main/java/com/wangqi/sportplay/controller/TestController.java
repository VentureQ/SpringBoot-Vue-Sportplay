package com.wangqi.sportplay.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/9 14:41
 */

@RestController
@CrossOrigin("http://localhost:8080")
public class TestController {

    @RequestMapping("/home")
    public String test(){
        return "Test my controller";
    }
}
