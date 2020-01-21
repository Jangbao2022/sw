rename
table
comments
to
goos_comment;

rename
table
goods
to
good;

/*博客评论表*/
create table blog_comment
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  u_id         int8 not null comment '评论人id',
  x_id         INT8 NOT NULL COMMENT '被评价的东西的id',
  `content`    text NOT NULL COMMENT '内容',
  `type`       int(1) not null comment '被评价的东西的类型',
  gmt_created  datetime,
  gmt_modified datetime,
  FOREIGN KEY (u_id) REFERENCES user (id)
)