package com.ckc.wiki.controller;

import com.ckc.wiki.domain.Ebook;
import com.ckc.wiki.resp.CommonResp;
import com.ckc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*@Controller 返回页面*/
@RestController //返回字符串json
@RequestMapping("/ebook")
public class EbookController {

    /*Ebook表的所有增删改查以及其他逻辑业务*/

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list()
    {   //泛型json对象
        CommonResp<List<Ebook>> resp=new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
