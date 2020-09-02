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
  `date` date NOT NULL,
  `activeCases` int(11) NOT NULL,
  `totalRecoverd` int(11) NOT NULL,
  `totalDeaths` int(11) NOT NULL,
  `newCases` int(11) NOT NULL,
  `totalCases` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coronadailystatus` */
