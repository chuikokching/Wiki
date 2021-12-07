package com.ckc.wiki.service;

import com.ckc.wiki.domain.Ebook;
import com.ckc.wiki.domain.EbookExample;
import com.ckc.wiki.mapper.EbookMapper;
import com.ckc.wiki.req.EbookReq;
import com.ckc.wiki.resp.EbookResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        //不管哪张表,写法固定
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        criteria.andNameLike("%"+req.getName()+"%");
        //criteria.andDescriptionLike("%"+req.getName()+"%");


        List<Ebook> ebookList  = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            /*可以选择性返回字段给用户*/
            //ebookResp.setId(ebook.getId());
            ebookResp.setName(ebook.getName());

            /*对象直接复制*/
            //BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
