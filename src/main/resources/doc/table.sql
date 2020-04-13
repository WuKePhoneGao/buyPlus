CREATE TABLE `goods` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '链接',
  `price` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '价格',
  `release_time` varchar(20) DEFAULT NULL COMMENT '发布时间',
  `cur_time` date DEFAULT NULL COMMENT '当天时间',
  `class_i` varchar(50) DEFAULT NULL COMMENT '一级分类',
  `class_ii` varchar(50) DEFAULT NULL COMMENT '二级分类',
  `class_iii` varchar(50) DEFAULT NULL COMMENT '三级分类',
  `class_iv` varchar(50) DEFAULT NULL COMMENT '四级分类',
  `mall` varchar(50) DEFAULT NULL COMMENT '商城',
  `brand` varchar(50) DEFAULT NULL COMMENT '品牌',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8