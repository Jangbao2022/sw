/*目标表*/
create table target
(
  id                INT8 PRIMARY KEY AUTO_INCREMENT,
  u_id              INT8 NOT NULL COMMENT '用户id',
  push_target       text  COMMENT '推力目标',
  pull_target       text  COMMENT '拉力目标',

  short_period_one   text COMMENT '短期目标1',
  short_period_two   text COMMENT '短期目标2',
  short_period_three text COMMENT '短期目标3',
  gmt_created       datetime,
  gmt_modified      datetime,
  FOREIGN KEY (u_id) REFERENCES user (id)
) DEFAULT CHARSET='utf8';


