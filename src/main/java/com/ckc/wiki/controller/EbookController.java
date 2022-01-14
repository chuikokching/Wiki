package com.ckc.wiki.controller;

import com.ckc.wiki.req.EbookReq;
import com.ckc.wiki.resp.CommonResp;
import com.ckc.wiki.resp.EbookResp;
import com.ckc.wiki.resp.PageResp;
import com.ckc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*@Controller 返回页面*/
@RestController //返回字符串json
@RequestMapping("/ebook")
public class EbookController {

    /*Ebook表的所有增删改查以及其他逻辑业务*/

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    /*假如uri中参数过多,避免臃肿,将所有参数封装成一个类*/
    public CommonResp list(EbookReq req)
    {   //泛型json对象
        CommonResp<PageResp<EbookResp>> resp=new CommonResp<>();
        PageResp<EbookResp> plist = ebookService.list(req);
        resp.setContent(plist);
        return resp;
    }

    @GetMapping("/Hello")
    /*假如uri中参数过多,避免臃肿,将所有参数封装成一个类*/
    public CommonResp list()
    {
        CommonResp<String> resp=new CommonResp<>();
        resp.setContent("Tech oktupus saves the world!!");
        return resp;
    }
}
