CREATE DATABASE IF NOT EXISTS `cqc`;
alter database `cqc` character set utf8;
Use cqc;
CREATE TABLE `cqc`.`news` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR (200) NOT Null ,
  `time` VARCHAR(45) NOT NULL,
  `type` VARCHAR(100) NOT NULL,   /* news:新闻 notification:通知 */
  `cover` VARCHAR(1000),
  `content` LONGTEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
