/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : db-two

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 05/11/2018 17:32:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config_platform
-- ----------------------------
DROP TABLE IF EXISTS `config_platform`;
CREATE TABLE `config_platform` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `platform_name` varchar(64) NOT NULL COMMENT '平台名称',
  `code` varchar(64) DEFAULT NULL COMMENT '编码',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置-平台表';

-- ----------------------------
-- Records of config_platform
-- ----------------------------
BEGIN;
INSERT INTO `config_platform` VALUES (1, '双平台', 'all', 1);
INSERT INTO `config_platform` VALUES (2, 'iOS', '2', 2);
INSERT INTO `config_platform` VALUES (3, 'Android', '3', 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
