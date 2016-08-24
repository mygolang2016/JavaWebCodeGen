create table holiday(
  `id` bigint(20) not null comment 'id',
  `create_time` datetime comment '创建时间',
  `company_id` int(11) not null default '0'comment '公司id',
  `name` varchar(128) not null default '' comment '名称',
  `cost` double not null default '0.00'comment '成本',
  `delete_flag` int(8) not null default '0' comment '删除标记',
  primary key(`id`)
)charset=utf8mb4;