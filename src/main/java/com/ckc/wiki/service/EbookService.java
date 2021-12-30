package com.ckc.wiki.service;

import com.ckc.wiki.config.WikiApplication;
import com.ckc.wiki.domain.Ebook;
import com.ckc.wiki.domain.EbookExample;
import com.ckc.wiki.mapper.EbookMapper;
import com.ckc.wiki.req.EbookReq;
import com.ckc.wiki.resp.EbookResp;
import com.ckc.wiki.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public List<EbookResp> list(EbookReq req){
        //不管哪张表,写法固定
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName()))
        {
            criteria.andNameLike("%"+req.getName()+"%");
            //LOG.info(" ggggggggggggggggggggggggggg");

        }
        //criteria.andDescriptionLike("%"+req.getDescription()+"%");

        List<Ebook> ebookList  = ebookMapper.selectByExample(ebookExample);


//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            //EbookResp ebookResp = new EbookResp();
//            /*可以选择性返回字段给用户*/
//            //ebookResp.setId(ebook.getId());
//            //ebookResp.setName(ebook.getName());
//
//            /*对象直接复制*/
//            //BeanUtils.copyProperties(ebook, ebookResp);
//            EbookResp copy = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(copy);
//        }

        //List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);

        return CopyUtil.copyList(ebookList,EbookResp.class);
    }
}
