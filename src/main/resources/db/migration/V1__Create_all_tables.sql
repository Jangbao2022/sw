/*组织表*/
create table organization(
                           id INT8 PRIMARY KEY AUTO_INCREMENT,
                           `name` VARCHAR(128) NOT NULL COMMENT '姓名',
                           country VARCHAR(32) NOT NULL COMMENT '国家',
                           interal INT(1) NOT NULL COMMENT '国内/外',
                           created_time datetime DEFAULT NULL COMMENT '成立时间',
                           member_num INT8 DEFAULT NULL COMMENT '成员人数',
                           icon VARCHAR(128) NOT NULL COMMENT '图标',
                           honor VARnoCHAR(1024) NOT NULL COMMENT '荣誉',
                           `show` VARCHAR(1024) NOT NULL COMMENT '展示图',
                           gmt_created datetime,
                           gmt_modified datetime
)DEFAULT CHARSET='utf8';


/*大神表*/
create table superior(
                       id INT8 PRIMARY KEY AUTO_INCREMENT,
                       `name` VARCHAR(128) NOT NULL COMMENT '姓名',
                       avatar VARCHAR(128) NOT NULL COMMENT '头像',
                       country VARCHAR(32) NOT NULL COMMENT '国家',
                       interal INT(1) NOT NULL COMMENT '国内/外',
                       honor VARCHAR(1024)  COMMENT '荣誉',
                       `show` VARCHAR(1024) 	NOT NULL COMMENT '图片展示',
                       `describe` VARCHAR(1024) NOT NULL COMMENT '简介',
                       gmt_created datetime,
                       gmt_modified datetime
)DEFAULT CHARSET='utf8';


/*大神组织中间表*/
create table organ_mid_super(
                              id INT8 PRIMARY KEY AUTO_INCREMENT,
                              o_id INT8 NOT NULL COMMENT 'organization表外键',
                              s_id INT8 NOT NULL COMMENT 'superior表外键',
                              FOREIGN KEY(o_id) REFERENCES organization(id),
                              FOREIGN KEY(s_id) REFERENCES superior(id),
                              gmt_created datetime,
                              gmt_modified datetime
)DEFAULT CHARSET='utf8';


/*动作类表*/
create table  video_class(
                           id INT8 PRIMARY KEY AUTO_INCREMENT,
                           `name` VARCHAR(128) NOT NULL COMMENT '动作名',
                           `describe` VARCHAR(128) NOT NULL COMMENT '动作简介',
                           `show` VARCHAR(1024) NOT NULL COMMENT '动作展示图',
                           gmt_created datetime,
                           gmt_modified datetime
)DEFAULT CHARSET='utf8';

/*视频教程*/
create table course(
                     id INT8 PRIMARY KEY AUTO_INCREMENT,
                     o_id INT8 COMMENT 'organization表外键',
                     s_id INT8 COMMENT 'superior表外键',
                     v_id INT8 NOT NULL COMMENT 'video_class表外键',
                     `name` VARCHAR(128) NOT NULL  COMMENT '教程名',
                     link VARCHAR(128) NOT NULL COMMENT '链接',
                     `describe` VARCHAR(1024) NOT NULL COMMENT'简介',
                     `show` VARCHAR(1024) NOT NULL COMMENT'展示',
                     gmt_created datetime,
                     gmt_modified datetime,
                     FOREIGN KEY(o_id) REFERENCES organization(id),
                     FOREIGN KEY(s_id) REFERENCES superior(id),
                     FOREIGN KEY(v_id) REFERENCES video_class(id)
)DEFAULT CHARSET='utf8';

/*商家*/
create table shopper(
                      id INT8 PRIMARY KEY AUTO_INCREMENT,
                      `name` VARCHAR(128) NOT NULL COMMENT '商家名',
                      `describe` VARCHAR(1024) NOT NULL COMMENT '简介',
                      o_id INT8 COMMENT '所属组织',
                      score INT(1) COMMENT '得分',
                      avatar VARCHAR(128) COMMENT '头像',
                      gmt_created datetime,
                      gmt_modified datetime,
                      FOREIGN KEY(o_id) REFERENCES organization(id)
)DEFAULT CHARSET='utf8';

/*商品类*/
create table shop_class(
                         id INT8 PRIMARY KEY AUTO_INCREMENT,
                         `name` VARCHAR(128) NOT NULL COMMENT'类名',
                         `describe` VARCHAR(1024) NOT NULL COMMENT '简介',
                         `show` VARCHAR(1024) NOT NULL COMMENT '图片展示',
                         gmt_created datetime,
                         gmt_modified datetime
)DEFAULT CHARSET='utf8';


/*商品*/
create table goods(
                    id INT8 PRIMARY KEY AUTO_INCREMENT,
                    `name` VARCHAR(32) NOT NULL COMMENT '名称',
                    score INT(1) NOT NULL COMMENT'得分',
                    c_id INT8 NOT NULL COMMENT 'shop_class表外键',
                    s_id INT8 NOT NULL COMMENT 'shopper表外键',
                    old_price float(10,2) COMMENT '原价',
                    new_price DOUBLE(10,2) NOT NULL COMMENT'现价',
                    `describe` VARCHAR(1024) NOT NULL COMMENT '描述',
                    `get` VARCHAR(1024) NOT NULL COMMENT '如何购买',
                    `show` VARCHAR(1024) NOT NULL COMMENT '展示图',
                    gmt_created datetime,
                    gmt_modified datetime,
                    FOREIGN KEY(c_id) REFERENCES shop_class(id),
                    FOREIGN KEY(s_id) REFERENCES shopper(id)
)DEFAULT CHARSET='utf8';

/*用户表*/
create table `user`(
                     id INT8 PRIMARY KEY AUTO_INCREMENT,
                     `name` VARCHAR(128) NOT NULL COMMENT '用户名',
                     account INT8 NOT NULL comment '账号',
                     `password` VARCHAR(20) NOT NULL COMMENT '密码',
                     avatar VARCHAR(128) NOT NULL COMMENT '头像',
                     sex VARCHAR(1)  comment '性别',
                     `describe` VARCHAR(1024)  COMMENT '描述',
                     category int(1) NOT NULL comment '用户类别',
                     prohibit datetime comment '封号时间',
                     gmt_created datetime,
                     gmt_modified datetime
)DEFAULT CHARSET='utf8';


/*商品评价*/
create table `comments` (
                          id INT8 PRIMARY KEY AUTO_INCREMENT,
                          u_id INT8 NOT NULL COMMENT 'user表外键',
                          g_id INT8 NOT NULL COMMENT 'goods表外键',
                          score int(1) NOT NULL COMMENT '评分',
                          `comment` VARCHAR(1024) NOT NULL COMMENT '评价',
                          `after_comment` VARCHAR(1024) COMMENT '追评',
                          gmt_created datetime,
                          gmt_modified datetime,
                          FOREIGN KEY(u_id) REFERENCES `user`(id),
                          FOREIGN KEY(g_id) REFERENCES goods(id)
)DEFAULT CHARSET='utf8';
