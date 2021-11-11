package com.ckc.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@Controller 返回页面*/
@RestController //返回字符串json
public class TestController {

    /*Hello Interface Implementation*/

    /**
     * @RequestMapping(value = "/hello", method = RequestMethod.GET)
     * @RequestMapping("/hello") 支持所有访问方式
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DELETEMapping
     * @405 Method not Allowed, 比如只实现了POST请求却收到了GET请求
     * @return
     */

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }
}
