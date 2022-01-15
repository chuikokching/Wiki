package com.ckc.wiki.controller;

import com.ckc.wiki.req.EbookQueryReq;
import com.ckc.wiki.req.EbookSaveReq;
import com.ckc.wiki.resp.CommonResp;
import com.ckc.wiki.resp.EbookQueryResp;
import com.ckc.wiki.resp.PageResp;
import com.ckc.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

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
    public CommonResp list(EbookQueryReq req)
    {   //泛型json对象
        CommonResp<PageResp<EbookQueryResp>> resp=new CommonResp<>();
        PageResp<EbookQueryResp> plist = ebookService.list(req);
        resp.setContent(plist);
        return resp;
    }

//    @GetMapping("/Hello")
//    /*假如uri中参数过多,避免臃肿,将所有参数封装成一个类*/
//    public CommonResp list()
//    {
//        CommonResp<String> resp=new CommonResp<>();
//        resp.setContent("Tech oktupus saves the world!!");
//        return resp;
//    }

    @PostMapping("/save")
    /**
     * 区分查询和保存
     *
     *
     * @RequestBody: 對應json方式post提交 => Content-Type: application/json
     *               Content-Type: x-www-form-urlencoded => 不需要添加注解
     * */
    public CommonResp save(@RequestBody EbookSaveReq req)
    {
        CommonResp resp=new CommonResp<>();
        ebookService.save(req);

        return resp;
    }
}
