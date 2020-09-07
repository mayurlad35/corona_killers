/*
SQLyog - Free MySQL GUI v5.02
Host - 5.5.27 : Database - corona
*********************************************************************
Server version : 5.5.27
*/


create database if not exists `corona`;

USE `corona`;

/*Table structure for table `coronadailystatus` */

DROP TABLE IF EXISTS `coronadailystatus`;

CREATE TABLE `coronadailystatus` (
  `date` varchar(30) NOT NULL,
  `activeCases` int(50) NOT NULL,
  `totalRecovered` int(50) NOT NULL,
  `totalDeaths` int(50) NOT NULL,
  `newCases` int(50) NOT NULL,
  `totalCases` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coronadailystatus` */

insert into `coronadailystatus` values 
('2020-09-04',199998,12900,789,1400,213687),
('2020-09-03',184000,3400,601,1200,188001),
('2020-09-02',95678,1600,34,980,97312),
('2020-09-01',7611,906,28,490,8545),
('2020-08-31',854,159,9,680,1022),
('2020-09-05',135000,4600,1500,18950,141100),
('2020-09-06',154900,8900,1200,1800,165000),
('2020-09-07',248600,1600,900,5000,251100);
