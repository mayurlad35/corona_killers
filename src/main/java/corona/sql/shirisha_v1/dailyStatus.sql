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
  `activeCases` int(11) NOT NULL,
  `totalRecovered` int(11) NOT NULL,
  `totalDeaths` int(11) NOT NULL,
  `newCases` int(11) NOT NULL,
  `totalCases` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coronadailystatus` */

insert into `coronadailystatus` values 
('03/09/2020',10,5,1,4,16),
('02/09/2020',22,10,4,9,36),
('01/09/2020',39,6,2,7,42);
