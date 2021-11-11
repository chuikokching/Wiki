package com.ckc.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*@Controller 返回页面*/
@RestController //返回字符串json
public class TestController {

    /*Hello Interface Implementation*/

    /**
     * @RequestMapping(value = "/hello", method = RequestMethod.GET)
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DELETEMapping
     * @405 Method not Allowed, 比如只实现了POST请求却收到了GET请求
     * @return
     */

    @RequestMapping("/hello") //支持所有访问方式
    public String hello()
    {
        return "Hello World!";
    }
}
