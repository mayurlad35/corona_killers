
DROP TABLE IF EXISTS `vaccine`;

CREATE TABLE `vaccine` (
  `vaccineId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`vaccineId`)
) ;
LOCK TABLES `vaccine` WRITE;

INSERT INTO `vaccine` VALUES (1001,'Oxford-AstraZeneca\'s COVID-19 vaccine, Developed by UK',1000,1),(1002,'Sputnik V, Developed by Russia',800,1),(1003,'COVAXIN, Developed by Bharat Biotech International Limited India',500,1),(1004,'COVAX-19, Developed by Flinders University Australia',600,1);

UNLOCK TABLES;
