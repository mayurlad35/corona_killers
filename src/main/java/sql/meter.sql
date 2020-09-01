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
  `Date` date NOT NULL,
  `Active Cases` int(50) NOT NULL,
  `Total Recoverd` int(50) NOT NULL,
  `Total Deaths` int(50) NOT NULL,
  `New Cases` int(50) NOT NULL,
  `Total cases` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coronadailystatus` */
