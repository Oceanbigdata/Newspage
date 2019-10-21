/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50725
Source Host           : 127.0.0.1:3306
Source Database       : newspaper

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-10-21 16:01:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `newsId` int(32) NOT NULL AUTO_INCREMENT COMMENT '新闻Id',
  `newsTitle` varchar(120) DEFAULT NULL COMMENT '新闻标题',
  `newsContent` text COMMENT '新闻内容',
  `newsAuthor` varchar(32) DEFAULT NULL COMMENT '作者',
  `newsDate` varchar(100) DEFAULT NULL COMMENT '新闻日期',
  `publishStatus` char(5) DEFAULT NULL COMMENT '0为待审核；1为审核通过；2为审核不通过',
  PRIMARY KEY (`newsId`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '测试新闻1', '这里是内容', '熊博文', '2019/10/20', '1');
INSERT INTO `news` VALUES ('2', '测试新闻2', '这里是内容', '胡海洋', '2019/10/20', '1');
INSERT INTO `news` VALUES ('3', '测试新闻3', '这里是内容', '张三', '2019/10/20', '1');
INSERT INTO `news` VALUES ('4', '测试新闻4', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('5', '测试新闻5', '这里是内容', '张三', '2019/10/20', '1');
INSERT INTO `news` VALUES ('6', '测试新闻6', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('7', '测试新闻7', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('8', '测试新闻8', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('9', '测试新闻9', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('10', '测试新闻10', '这里是内容', '李四', '2019/10/20', '1');
INSERT INTO `news` VALUES ('11', '标题', '哈哈', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('27', '1231', '<p><br></p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('28', 'Ocean', '<p><br></p>', '张三', '2019/10/20', '2');
INSERT INTO `news` VALUES ('29', 'Ocean', '<p><br></p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('30', 'Ocean', '<p><br></p>', '张三', '2019/10/20', '1');
INSERT INTO `news` VALUES ('55', '测试', '<p>测试测试</p><p><img src=\"/resources/uploadimg/849dad25-c8b2-41e3-a642-19e298266a2e.png\" style=\"max-width:100%;\"></p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('56', '测试', '<p>测试测试</p><p><img src=\"/resources/uploadimg/849dad25-c8b2-41e3-a642-19e298266a2e.png\" style=\"max-width:100%;\"></p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('57', '哈哈', '<p>测试一下</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('58', 'Ocean', '<p>12121</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('59', 'Ocean', '<p>12121</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('60', 'Ocean', '<p>12121</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('61', 'Ocean', '<p>12121</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('62', 'Ocean', '<p>12121</p>', '张三', '2019/10/20', '0');
INSERT INTO `news` VALUES ('63', '1111', '<p>1111</p>', '张三', '2019/10/20', '1');
INSERT INTO `news` VALUES ('64', '123', '<p><img src=\"/resources/uploadimg/396c4507-f31f-4970-9389-7ee4afaf0a3f.png\" style=\"max-width:100%;\"></p><p>123</p>', '张三', '2019/10/20', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(32) NOT NULL COMMENT '用户Id',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `number` int(32) NOT NULL COMMENT '用户工号',
  `role` char(10) NOT NULL DEFAULT '0' COMMENT '1是管理员，0是普通用户',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '熊博文', '234567', '1');
INSERT INTO `user` VALUES ('2', '张三', '1234567', '0');
INSERT INTO `user` VALUES ('3', '李四', '123456', '1');
