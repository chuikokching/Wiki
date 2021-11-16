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