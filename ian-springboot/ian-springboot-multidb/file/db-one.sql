/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : db-one

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 05/11/2018 17:31:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config_province_city
-- ----------------------------
DROP TABLE IF EXISTS `config_province_city`;
CREATE TABLE `config_province_city` (
  `id` bigint(20) NOT NULL,
  `province_name` varchar(64) DEFAULT NULL,
  `province_code` varchar(64) DEFAULT NULL,
  `city_name` varchar(64) DEFAULT NULL,
  `city_code` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_province_city
-- ----------------------------
BEGIN;
INSERT INTO `config_province_city` VALUES (1, '安徽', '10250', '泸州', '10288');
INSERT INTO `config_province_city` VALUES (2, '安徽', '10250', '芜湖', '10318');
INSERT INTO `config_province_city` VALUES (3, '安徽', '10250', '滁州', '10326');
INSERT INTO `config_province_city` VALUES (4, '安徽', '10250', '淮北', '10349');
INSERT INTO `config_province_city` VALUES (5, '安徽', '10250', '宿州', '10368');
INSERT INTO `config_province_city` VALUES (6, '安徽', '10250', '铜陵', '10403');
INSERT INTO `config_province_city` VALUES (7, '安徽', '10250', '马鞍山', '10418');
INSERT INTO `config_province_city` VALUES (8, '安徽', '10250', '安庆', '10433');
INSERT INTO `config_province_city` VALUES (9, '安徽', '10250', '明光市', '10443');
INSERT INTO `config_province_city` VALUES (10, '安徽', '10250', '蚌埠', '10445');
INSERT INTO `config_province_city` VALUES (11, '安徽', '10250', '六安', '10446');
INSERT INTO `config_province_city` VALUES (12, '安徽', '10250', '亳州', '10476');
INSERT INTO `config_province_city` VALUES (13, '安徽', '10250', '合肥', '10503');
INSERT INTO `config_province_city` VALUES (14, '安徽', '10250', '黄山', '10538');
INSERT INTO `config_province_city` VALUES (15, '安徽', '10250', '宣城', '10585');
INSERT INTO `config_province_city` VALUES (16, '安徽', '10250', '淮南', '10591');
INSERT INTO `config_province_city` VALUES (17, '安徽', '10250', '池州', '10593');
INSERT INTO `config_province_city` VALUES (18, '安徽', '10250', '阜阳', '10603');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
