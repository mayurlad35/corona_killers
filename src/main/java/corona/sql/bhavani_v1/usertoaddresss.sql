CREATE DATABASE  IF NOT EXISTS `corona` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `corona`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: corona
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `first_Name` varchar(45) DEFAULT NULL,
  `last_Name` varchar(45) DEFAULT NULL,
  `email` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(20) DEFAULT NULL,
  `re_password` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('bhavani1','chinni1','chinni@gmail.com','0520','0520',16,'7958256564','ROLE_U'),('raghu','roopa','roopa@gmail.com','1820','1820',18,'9502144525','ROLE_U'),('saurav','kumar','sauravraj751@gmail.com','1000','1000',12,'8789785295','ROLE_Customer'),('bhavani1','chinni1','vallamnrgb@gmail.com','0520','0520',15,'8008098995','ROLE_U');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `address_line1` varchar(250) NOT NULL,
  `address_line2` varchar(250) DEFAULT NULL,
  `postcode` varchar(6) NOT NULL,
  `email` varchar(150) NOT NULL,
  `contact_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  UNIQUE KEY `address_id` (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'test','1','test address ','1','1','test1@gmail.com','123456789'),(2,'test','2','test address','2','2','test2@gmail.com','1234567890'),(3,'test','3','test address','3','3','test2@gmail.com','2345678901'),(4,'bhga','bdksed','qkdk','mfed','66','jhdfuw','698989659'),(5,'bhga','bdksed','qkdk','mfed','66','jhdfuw','698989659'),(6,'feknv','odjfoe','foekf','kkfoe','89','fmorjf','56556565'),(7,'feknv','odjfoe','foekf','kkfoe','89','fmorjf','56556565'),(8,'hfuh','djeid','jodjeo','jojoew','517425','utr','1245465'),(9,'hfuh','djeid','jodjeo','jojoew','517425','utr','1245465'),(10,'msfj','mdoe','koree','ekri0','78','eiieru','95989898'),(11,'msfj','mdoe','koree','ekri0','78','eiieru','95989898'),(12,'msfj','mdoe','koree','ekri0','78','eiieru','95989898'),(13,'msfj','mdoe','koree','ekri0','78','eiieru','95989898'),(14,'wef','ere','egrd','erge','25','dver','56595'),(15,'wef','ere','egrd','erge','25','dver','56595'),(16,'raghu','ram','kdr','mtp','57887','ram@gmail.com','598799'),(17,'raghu','ram','kdr','mtp','57887','ram@gmail.com','598799'),(18,'wkmfwr','ekoge','kfpekf','rpkp4','69','fkeofk3','632652'),(19,'wkmfwr','ekoge','kfpekf','rpkp4','69','fkeofk3','632652'),(20,'dad','mom','kdr','mtp','8','dad@gmail.com','8142883239'),(21,'dad','mom','kdr','mtp','8','dad@gmail.com','8142883239'),(22,'roopa','chinni','kdp','ctr','4564','kundella@gmail.com','5846416488'),(23,'roopa','chinni','kdp','ctr','4564','kundella@gmail.com','5846416488');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertoaddress`
--

DROP TABLE IF EXISTS `usertoaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertoaddress` (
  `customer_id` varchar(45) NOT NULL,
  `address_id` int(11) NOT NULL,
  KEY `customer_id_idx` (`customer_id`),
  KEY `address_id_idx` (`address_id`),
  CONSTRAINT `address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`email`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertoaddress`
--

LOCK TABLES `usertoaddress` WRITE;
/*!40000 ALTER TABLE `usertoaddress` DISABLE KEYS */;
INSERT INTO `usertoaddress` VALUES ('sauravraj751@gmail.com',1),('chinni@gmail.com',2),('chinni@gmail.com',1),('chinni@gmail.com',21),('roopa@gmail.com',23);
/*!40000 ALTER TABLE `usertoaddress` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-17 16:36:18
