package com.ckc.wiki.service;

import com.ckc.wiki.domain.Ebook;
import com.ckc.wiki.domain.EbookExample;
import com.ckc.wiki.mapper.EbookMapper;
import com.ckc.wiki.req.EbookQueryReq;
import com.ckc.wiki.req.EbookSaveReq;
import com.ckc.wiki.resp.EbookQueryResp;
import com.ckc.wiki.resp.PageResp;
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

    public PageResp<EbookQueryResp> list(EbookQueryReq req){



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

        PageHelper.startPage(req.getPage(),req.getSize());
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



        List<EbookQueryResp> list = CopyUtil.copyList(ebookList, EbookQueryResp.class);

        PageResp<EbookQueryResp> plist = new PageResp();
        plist.setTotal(pageInfo.getTotal());
        plist.setList(list);

        return plist;
    }

    /*
    * 保存
    *
    * */
    public void save(EbookSaveReq req){

        Ebook ebook = CopyUtil.copy(req, Ebook.class);

        if(ObjectUtils.isEmpty(req.getId()))
        {
            //id爲空,新增記錄
            ebookMapper.insert(ebook);
        }
        else ebookMapper.updateByPrimaryKey(ebook);

    }
}
