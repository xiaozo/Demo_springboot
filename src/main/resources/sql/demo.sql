/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.64.2
 Source Server Type    : MySQL
 Source Server Version : 100138
 Source Host           : 192.168.64.2:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 100138
 File Encoding         : 65001

 Date: 27/01/2022 11:09:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `pub_date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `FKpxk2jtysqn41oop7lvxcp6dqq` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of blog
-- ----------------------------
BEGIN;
INSERT INTO `blog` VALUES (1, 'SpringMVC教程', '这是SpringMVC的简单教程。TEST TEST TEST', 2, '2015-03-18');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'ssdf', 'NoJob');
INSERT INTO `user` VALUES (2, 'Bill', 'Gates');
INSERT INTO `user` VALUES (3, 'Mark', 'Zuckerberg');
INSERT INTO `user` VALUES (4, 'Ga方法ussic', 'D');
INSERT INTO `user` VALUES (5, '3232', '3232');
INSERT INTO `user` VALUES (6, '3232', '3232');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
