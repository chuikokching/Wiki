package com.ckc.wiki.config;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//@ComponentScan({"com.ckc","com.bat"}) 添加多个Package
@ComponentScan("com.ckc") //手动添加Package
@SpringBootApplication //ComponentScan 只会扫描文件所在目录下的子目录Package
@MapperScan("com.ckc.wiki.mapper") //MyBatis扫描
public class WikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Successfully started!!!!");
        LOG.info("address: \thttp://localhost:{}", env.getProperty("server.port"));

    }

}
