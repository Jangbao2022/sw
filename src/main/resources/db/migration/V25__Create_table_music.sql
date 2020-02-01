/*音乐表*/
create table music
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  name         text COMMENT '音乐名',
  `author`     text COMMENT '作者',
  `love`       int COMMENT '收藏数',
  gmt_created  datetime,
  gmt_modified datetime
) DEFAULT CHARSET='utf8';


