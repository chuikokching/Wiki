//package com.ckc.wiki.filter;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//
///*
//* 过滤器,查看接口响应时间
//*
//* */
//
//@Component
//public class LogFilter implements Filter {
//
//    private static final Logger LOG = LoggerFactory.getLogger(LogFilter.class);
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    /*
//    * doFilter()
//    *
//    *
//    * @param: FilterChain: 项目中可能有多个过滤器,一环接一环
//    *
//    * */
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        // 打印请求信息
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        LOG.info("------------- LogFilter 开始 -------------");
//        LOG.info("请求地址: {} {}", request.getRequestURL().toString(), request.getMethod());
//        LOG.info("远程地址: {}", request.getRemoteAddr());
//
//        long startTime = System.currentTimeMillis();
//        filterChain.doFilter(servletRequest, servletResponse); //继续执行其他过滤器
//        LOG.info("------------- LogFilter 结束 耗时：{} ms -------------", System.currentTimeMillis() - startTime);
//    }
//}