CREATE TABLE `t_movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(255) DEFAULT NULL,
  `release_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上映时间',
  `cover` varchar(255) DEFAULT NULL COMMENT '封面',
  `votes` int(255) DEFAULT NULL COMMENT '总票数',
  `remain_votes` int(255) DEFAULT NULL COMMENT '剩余票数',
  `box_office` int(255) DEFAULT NULL COMMENT '票房',
  `score` double(255,0) DEFAULT NULL COMMENT '评分',
  `price` decimal(10,0) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

