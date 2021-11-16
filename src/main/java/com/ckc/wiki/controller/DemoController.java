package com.ckc.wiki.controller;

import com.ckc.wiki.domain.Demo;
import com.ckc.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*@Controller 返回页面*/
@RestController //返回字符串json
@RequestMapping("/demo")
public class DemoController {

    /*Demo表的所有增删改查以及其他逻辑业务*/

    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list()
    {
        return demoService.list();
    }
}
