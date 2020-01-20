/*用户组织中间表*/
create table organ_mid_user
(
  id           INT8 PRIMARY KEY AUTO_INCREMENT,
  o_id         INT8 NOT NULL COMMENT 'organization表外键',
  u_id         INT8 NOT NULL COMMENT 'user表外键',
  FOREIGN KEY (o_id) REFERENCES organization (id),
  FOREIGN KEY (u_id) REFERENCES user (id),
  gmt_created  datetime,
  gmt_modified datetime
) DEFAULT CHARSET='utf8';