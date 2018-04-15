CREATE DATABASE IF NOT EXISTS `cqc`;
Use cqc;
CREATE TABLE `cqc`.`news` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR (100) NOT Null,
  `type` VARCHAR(45) NOT NULL,   /* news:新闻 notification:通知 */
  `content` LONGTEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
