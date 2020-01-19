alter table blog modify content text not null comment '内容';

alter table organization modify honor text not null comment '荣誉';
alter table organization modify `show` text not null comment '展示图';
alter table organization modify description text not null comment '描述';

alter table superior modify honor text comment '荣誉';
alter table superior modify `show` text not null comment '展示图';
alter table superior modify description text not null comment '描述';

alter table video_class modify `show` text not null comment '动作展示图';

alter table course modify `show` text not null comment '展示';
alter table course modify description text not null comment '描述';

alter table shopper modify description text not null comment '描述';

alter table shop_class modify `show` text not null comment '图片展示';
alter table shop_class modify description text not null comment '描述';

alter table goods modify `show` text not null comment '展示图';
alter table goods modify description text not null comment '描述';
alter table goods modify `get` text not null comment '如何购买';

alter table `user` modify description text comment '描述';

alter table `comments` modify `comment` text not null comment '评论';
alter table `comments` modify `after_comment` text comment '追评';



alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';
alter table blog modify content text not null comment '内容';