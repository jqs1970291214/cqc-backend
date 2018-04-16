CREATE DATABASE IF NOT EXISTS `cqc`;
Use cqc;
CREATE TABLE `cqc`.`news` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR (100) NOT Null UNIQUE ,
  `time` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,   /* news:新闻 notification:通知 */
  `cover` VARCHAR(200),
  `content` LONGTEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
