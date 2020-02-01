/*壁纸表*/
create table photo
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  name         varchar(128) COMMENT '照片名',
  `reveal`     text COMMENT '展示图',
  `love`       int COMMENT '收藏数',
  gmt_created  datetime,
  gmt_modified datetime
) DEFAULT CHARSET='utf8';


