/*精品文章*/
create table blog
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  `title`      VARCHAR(32)   NOT NULL COMMENT '标题',
  score        INT(1) COMMENT '得分',
  u_id         INT8          NOT NULL COMMENT 'user表外键',
  o_id         INT8          NOT NULL COMMENT 'organization表外键',
  `content`    VARCHAR(4096) NOT NULL COMMENT '内容',
  gmt_created  datetime,
  gmt_modified datetime,
  FOREIGN KEY (u_id) REFERENCES user (id),
  FOREIGN KEY (o_id) REFERENCES organization (id)
) DEFAULT CHARSET='utf8';


