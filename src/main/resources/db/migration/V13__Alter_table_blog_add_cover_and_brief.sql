alter table blog
  add brief text not null comment '简要';

alter table blog
  add cover varchar(256) not null comment '封面';

alter table blog
  add type varchar(256) not null comment '类别';