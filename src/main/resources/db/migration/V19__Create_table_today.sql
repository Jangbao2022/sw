/*今日计划*/
create table today
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  u_id         INT8 NOT NULL COMMENT '用户id',
  push_plan    text not null COMMENT '推力计划',
  pull_plan    text not null COMMENT '拉力计划',
  leg_plan     text not null COMMENT '练腿计划',

  push_finish  text not null COMMENT '推力完成',
  pull_finish  text not null COMMENT '拉力完成',
  leg_finish   text not null COMMENT '练腿完成',
  gmt_created  datetime,
  gmt_modified datetime,
  FOREIGN KEY (u_id) REFERENCES user (id)
) DEFAULT CHARSET='utf8';


