/**
购物车表
 */
create table cart
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  u_id         INT8 NOT NULL COMMENT '用户id',
  g_id         INT8 NOT NULL COMMENT 'goodsId',
  num          INT  NOT NULL comment '数量',
  FOREIGN KEY (u_id) REFERENCES user (id),
  FOREIGN KEY (g_id) REFERENCES goods (id),
  gmt_created  datetime,
  gmt_modified datetime
)