
CREATE TABLE `address` (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `address_line1` varchar(250) NOT NULL,
  `address_line2` varchar(250) DEFAULT NULL,
  `postcode` varchar(6) NOT NULL,
  `email` varchar(150) NOT NULL,
  `contact_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  UNIQUE KEY `address_id` (`address_id`)
);
INSERT INTO `address` VALUES (1,'test','1','test address ','1','1','test1@gmail.com','123456789'),(2,'test','2','test address','2','2','test2@gmail.com','1234567890'),(3,'test','3','test address','3','3','test2@gmail.com','2345678901');

UNLOCK TABLES;
