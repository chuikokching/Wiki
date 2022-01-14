drop table if exists `ebook`;
create table `ebook` (
  `id` bigint not null comment 'id',
  `name` varchar(50) comment '名称',
  `category1_id` bigint comment '分类1',
  `category2_id` bigint comment '分类2',
  `description` varchar(200) comment '描述',
  `cover` varchar(200) comment '封面',
  `doc_count` int comment '文档数',
  `view_count` int comment '阅读数',
  `vote_count` int comment '点赞数',
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='电子书';

insert into `ebook` (id, name, description) values (1, 'Spring Boot 入门教程', '零基础入门 Java 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (2, 'Vue 入门教程', '零基础入门 Vue 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (3, 'Python 入门教程', '零基础入门 Python 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (4, 'Mysql 入门教程', '零基础入门 Mysql 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (5, 'Oracle 入门教程', '零基础入门 Oracle 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (6, 'React 入门教程', '零基础入门 React 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (7, 'Go 入门教程', '零基础入门 Go 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (8, 'html 入门教程', '零基础入门 html 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (9, 'css 入门教程', '零基础入门 css 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (10, 'mongo 入门教程', '零基础入门 mongo 开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values (11, 'Nginx 入门教程', '零基础入门 Nginx 开发，企业级应用开发最佳首选框架');

update  `ebook` set cover='/image/cover1.png' where id=1;
update  `ebook` set cover='/image/cover2.png' where id=2;
update  `ebook` set cover='/image/cover2.png' where id=2;
update  `ebook` set category1_id=1,category2_id=2 where id=2;

select * from ebook;


drop table if exists `test`;
create table `test`(
  `id` bigint not null comment 'ID',
  `name` varchar(50) comment '名称',
  `password` varchar(50) comment '密码',
  primary key(`id`)
) engine =innodb default charset = utf8mb4 comment '测试';

select * from ckc_wiki_projectdev.test;

insert into `test` values (1, "chuikokching","123456");

drop table if exists `demo`;
create table `demo`(
  `id` bigint not null comment 'ID',
  `name` varchar(50) comment '名称',
  primary key(`id`)
) engine =innodb default charset = utf8mb4 comment '测试';

insert into `demo` values (1, "chuikokching");

select * from ckc_wiki_projectdev.demo;