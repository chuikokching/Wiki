package com.ckc.wiki.service;

import com.ckc.wiki.domain.Ebook;
import com.ckc.wiki.domain.EbookExample;
import com.ckc.wiki.mapper.EbookMapper;
import com.ckc.wiki.req.EbookReq;
import com.ckc.wiki.resp.EbookResp;
import com.ckc.wiki.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

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


        //后端分页查抄 只对第一个遇到的sql起作用(important!!!!)
        //分页4个重要参数:
        // @param: pageNum,pageSize,
        // @return: ebookList,pageInfo.getTotal(总行数)

        PageHelper.startPage(1,3);
        List<Ebook> ebookList  = ebookMapper.selectByExample(ebookExample);

        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        LOG.info("总行数：{} ",pageInfo.getTotal());
        LOG.info("总页数：{} ",pageInfo.getPages());

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
