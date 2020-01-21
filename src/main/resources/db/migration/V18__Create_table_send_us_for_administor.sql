/*管理员消息表*/
create table send_us
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  u_id         INT8 comment '发送人id',
  `name`       VARCHAR(128) NOT NULL COMMENT '用户名',
  `email`      varchar(128) NOT NULL comment '邮箱',
  content      text comment '内容',
  gmt_created  datetime,
  gmt_modified datetime
) DEFAULT CHARSET='utf8';