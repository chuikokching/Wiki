package com.ckc.wiki.controller;

import com.ckc.wiki.domain.Test;
import com.ckc.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*@Controller 返回页面*/
@RestController //返回字符串json
public class TestController {

    /*Hello Interface Implementation*/

    @Value("${test.name:CHUIKOKCHING}") //优先读配置项,没有则读取默认值
    private String testname;

    @Resource
    private TestService testService;

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

        return "Hello World!"+testname;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name)
    {
        //参数name要与post请求中的参数名字相同
        return "Hello World! Post "+name;
    }

    @GetMapping("/test/list")
    public List<Test> list()
    {
        return testService.list();
    }
}
