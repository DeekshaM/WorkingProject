CREATE DATABASE  IF NOT EXISTS `billing` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `billing`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: billing
-- ------------------------------------------------------
-- Server version	5.5.33

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
-- Table structure for table `bill_details`
--

DROP TABLE IF EXISTS `bill_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_details` (
  `Bill_No` int(11) NOT NULL,
  `Item_Type` varchar(2) DEFAULT NULL,
  `Item_Name` varchar(45) DEFAULT NULL,
  `Quantity` float DEFAULT NULL,
  `Price_Rate` float DEFAULT NULL,
  `Amount` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_details`
--

LOCK TABLES `bill_details` WRITE;
/*!40000 ALTER TABLE `bill_details` DISABLE KEYS */;
INSERT INTO `bill_details` VALUES (0,NULL,'WERLWER',3423,21,71883),(6,NULL,'Abbott',34,333,11322),(6,NULL,'ASDFSAD',23,33,759),(6,NULL,'3434SF',341,2,682),(6,NULL,'ASDFSDF',66,0.59,38.94),(7,NULL,'vENUGOPAL',22,22,484),(7,NULL,'ADSFKLASDKL',33.3,12.3,409.59),(7,NULL,'WERWER',23.33,32.23,751.93),(8,NULL,'sdafasdf',33,33,1089),(9,NULL,'a',23.3,232,5405.6),(9,NULL,'B',33,222,7326),(10,NULL,'afadsfasdf',345,32,11040),(11,NULL,'asadf',23,3,69),(12,NULL,'adfakdlf;lk',234,23,5382),(12,NULL,'3454553',33,2,66),(13,NULL,'ASDFSADF',34,3,102),(13,NULL,'SDIFG',33,22,726),(15,NULL,'2342',23,234,5382),(15,NULL,'sdfgsg',4,55,220),(16,NULL,'sdfgsdfg',55,5,275),(17,NULL,'Testq',23.2,23,533.6),(17,NULL,'RRR',30.4,22.4,680.96),(18,'P','asldfkjasklfdkasl',33.3,22.4,745.92),(18,'P','sadjfal;k',232,22.5,5220),(18,'P','alkfjkaldf',32,1.23,39.36),(19,'P','wwertwert',33.44,22,735.68),(19,'P','FGWERF',345,33,11385),(20,'P','wrtwertwert',345,44,15180),(20,'P','',245,45.88,11240.6),(20,'P','wsdfgsdfg',234,2.99,699.66),(21,'P','asdfsadf',2,23.3,46.6),(21,'P','fsdfd',3,33,99),(21,'P','sdfsdf',23,2,46),(21,'P','sdfgsdfg',34,3,102),(21,'P','sdfgdsfg',22,4,88),(21,'P','xcvb',43,5,215),(21,'P','xvb',45,6,270),(21,'P','xvb',5,7,35),(21,'P','xvb',6,8,48),(21,'P','xcvb',77,9,693),(21,'P','xcvb',89,90,8010),(21,'P','xvbxvcb',90,12,1080),(21,'P','xvcbxcb',89,2,178),(21,'P','xcvb',99,3,297),(21,'P','xcvb',67,4,268),(21,'P','xcv xc',456,5,2280),(21,'P','xcvbxvcb',24,6,144),(21,'P','vxcvb',13,7,91),(21,'P','xvbxcb',12,8,96),(21,'P','cxvbxcb',22,8,176),(21,'P','zxcvzx',22,8,176),(21,'P','zxcvxcv',22,9,198),(21,'P','zxv',22,60,1320),(21,'P','zxcv',3,65,195),(21,'P','zxcvgg',33,4,132),(21,'P','zxcvgg',34,34,1156),(21,'P','fffzxcv',89,3,267),(21,'P','zxcvssd',77,222,17094),(21,'P','sdfsdfafsdf',66,3,198),(21,'P','asdf',56,45,2520),(22,'P','Somthing1, 2345',34,56,1904),(22,'P','asdfkasdf asdf;lkadjsf, 345',4,567,2268),(22,'M','asdfkasdf asdf;lkadjsf, 3454',23.5,567,13324.5),(22,'P','Somthing1, 2345',67,56,3752),(23,'P','Somthing1, 2345',34,56,1904),(23,'P','asdfkasdf asdf;lkadjsf, 345',34,333,11322),(23,'P','ddasdlkfadsl, 234',22,4567,100474),(24,'P','Somthing1, 2345',3,56,168),(25,'P','Somthing1, 2345',33,56,1848),(25,'P','asdlfjkalsdkfkla',343,3,1029),(26,'P','asdfkasdf asdf;lkadjsf, 345',34,44,1496),(27,'P','asdfkasdf asdf;lkadjsf, 3454',7,567,3969),(28,'P','asdfkasdf asdf;lkadjsf, 345',345,5,1725),(29,'P','asdfkasdf asdf;lkadjsf, 345',43,4,172),(30,'P','Somthing1, 2345',4,56,224),(31,'P','fgassdf',44,33,1452),(32,'P','dffgd',3,345,1035),(33,'P','Somthing1, 2345',343,56,19208),(34,'P','dfgdsfg',34,34,1156),(35,'P','asdfkasdf asdf;lkadjsf, 345',34,567,19278),(35,'P','ddasdlkfadsl, 234',7,4567,31969),(36,'P','Somthing1, 2345',45,3434,154530),(36,'P','asdfkasdf asdf;lkadjsf, 3454',4,567,2268),(37,'P','sdfesdfsadf, 56791',44,345,15180);
/*!40000 ALTER TABLE `bill_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_main`
--

DROP TABLE IF EXISTS `bill_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_main` (
  `Bill_No` int(11) NOT NULL AUTO_INCREMENT,
  `Bill_Date` varchar(50) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Mobile_No` varchar(11) DEFAULT NULL,
  `Total_Amount` float DEFAULT NULL,
  `Bill_MainCol` varchar(45) DEFAULT NULL,
  `Created_By` varchar(10) DEFAULT NULL,
  `Recived_Amount` float DEFAULT NULL,
  PRIMARY KEY (`Bill_No`,`Bill_Date`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_main`
--

LOCK TABLES `bill_main` WRITE;
/*!40000 ALTER TABLE `bill_main` DISABLE KEYS */;
INSERT INTO `bill_main` VALUES (1,'2014-12-11 00:00:00','venugopal manchala','9949493340',7326,'Somthing','Venugopal',3000),(2,'2014-12-11 00:00:00','Vijay Babu','8844883000',8996,'Somthing','venu',8996),(3,'2014-12-11 00:00:00','VIJAYA bABU','2353423492',2160040,'Somthing','venu',4555),(4,'2014-12-11 00:00:00','gOPALm','3234523423',171888,'Somthing','venu',1700000),(5,'2014-12-11 00:00:00','cHANDRAKANTH','4353453534',268578,'Somthing','venu',235612),(6,'2014-12-11 00:00:00','SAMSUNG','5423492130',12802,'Somthing','venu',12000),(7,'2014-12-11 00:00:00','dell','3458903409',1646,'Somthing','venu',1548),(8,'2014-12-12 00:00:00','shankaraiah','2145234523',1089,'Somthing','venu',333),(9,'12/12/2014:05:12:25 PM','Test Class','2345242340',12732,'Somthing','venu',12700),(10,'12/12/2014:05:17:40 PM','Testing Bill','333333',11040,'Somthing','venu',23234),(11,'12/12/2014:05:31:12 PM','venugopal','3432423423',69,'Somthing','venu',45),(12,'12/12/2014:05:39:33 PM','Test Venugopal','9949493340',5448,'Somthing','venu',5200),(13,'12/12/2014:05:42:44 PM','aldfk;asldfjkkl;kl','3452345234',828,'Somthing','venu',334),(14,'12/12/2014:05:59:16 PM','venugopal manchala','2342342340',5565460,'Somthing','venu',345234),(15,'12/12/2014:06:01:52 PM','venugopal','2334234234',5602,'Somthing','venu',4545),(16,'12/12/2014:06:02:25 PM','fglkgj','3453453534',275,'Somthing','venu',455),(17,'15/12/2014:04:29:17 PM','Today','9949493340',1214.56,'Somthing','venu',1254.22),(18,'15/12/2014:05:37:57 PM','DellItems','2345233423',6005.28,'Somthing','venu',625.321),(19,'15/12/2014:05:40:05 PM','fdgsdfgsd','3456345345',12120.7,'Somthing','venu',345345),(20,'15/12/2014','ADSFSADFSADF','4534534534',27120.3,'Somthing','venu',4557.9),(21,'15/12/2014','SREE RAMA NARAYAN SIRCILLA','9998898898',37518.6,'Somthing','venu',37520),(22,'16/12/2014','ADSFASDKL','2342342342',21248.5,'Somthing','venu',21245),(23,'16/12/2014','TESTING WITH JNLP','8889999999',113700,'Somthing','venu',113700),(24,'16/12/2014','TEST','3534525424',168,'Somthing','venu',150),(25,'16/12/2014','TESTING DOCUMENT','2342342342',2877,'Somthing','venu',2800),(26,'16/12/2014','ADSFSAD','3453453453',1496,'Somthing','venu',44),(27,'16/12/2014','ASDFSDFSADF','3453453453',3969,'Somthing','venu',6776),(28,'16/12/2014','SDFSDF','3453453453',1725,'Somthing','venu',456),(29,'16/12/2014','SDDFSDFSDF','3453453333',172,'Somthing','venu',3434),(30,'16/12/2014','SDFSDFSADF','3453343343',224,'Somthing','venu',3434),(31,'16/12/2014','ASDFSADF','3453453453',1452,'Somthing','venu',3434),(32,'16/12/2014','DSAFSDFASDF','3434534534',1035,'Somthing','venu',23444),(33,'16/12/2014','ASDFLKJSDKL','2342423422',19208,'Somthing','venu',5656),(34,'16/12/2014','FDSDFGSDFG','4564563563',1156,'Somthing','venu',353),(35,'17/12/2014','XZCGXCV','4543453453',51247,'Somthing','venu',51247),(36,'17/12/2014','SFGASDFASDF','5456323564',156798,'Somthing','venu',1452),(37,'17/12/2014','FADFSDF','2334214123',15180,'Somthing','venu',0);
/*!40000 ALTER TABLE `bill_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collection`
--

DROP TABLE IF EXISTS `collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collection` (
  `Transaction_Date` varchar(15) NOT NULL,
  `Transaction_Info` varchar(100) NOT NULL,
  `Transaction_Amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collection`
--

LOCK TABLES `collection` WRITE;
/*!40000 ALTER TABLE `collection` DISABLE KEYS */;
INSERT INTO `collection` VALUES ('17/12/2014','adsfsadfasdf',3434.8),('17/12/2014','adsfsadfasdfsdf',43434.8),('17/12/2014','asdsdfsdf',34.788),('17/12/2014','asdsdfsdf',3434.79),('17/12/2014','Testing Information',34343.3),('17/12/2014','Adding collection amount',45.4),('17/12/2014','asdfadfsdf',2342),('17/12/2014','36, SFGASDFASDF',1452),('17/12/2014','venugopal',45000);
/*!40000 ALTER TABLE `collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_details`
--

DROP TABLE IF EXISTS `item_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_details` (
  `Item_Number` int(10) NOT NULL,
  `Item_Name` varchar(50) DEFAULT NULL,
  `Purchased_Price` float DEFAULT NULL,
  `Item_Purchased_Company` varchar(50) DEFAULT NULL,
  `Sale_Price` float DEFAULT NULL,
  `Item_Code` varchar(10) DEFAULT NULL,
  `Item_detailscol` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`Item_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_details`
--

LOCK TABLES `item_details` WRITE;
/*!40000 ALTER TABLE `item_details` DISABLE KEYS */;
INSERT INTO `item_details` VALUES (234,'ddasdlkfadsl',456,'jajjjj',4567,'yfyyf','asd;fklasdjfkl;asdjfdfk  adfklasdfk '),(345,'asdfkasdf asdf;lkadjsf',343,'jaju',567,'sdfsdf',NULL),(2345,'Somthing1',45,'jaju',56,'HTF3456','Nothing Changes made'),(3454,'asdfkasdf asdf;lkadjsf',343,'jaju',567,'sdfsdf',NULL),(56788,'venugopal',456,'shaisi',0,'ghretw33','sfkjasdfk'),(56789,'gadwall',456,'jaju sarees',457,'test456','asdlfkasdkfadsfds'),(56790,'name',3454,'asdfasdfasdf',23234,'34534','asdfsadfsadfsdf'),(56791,'sdfesdfsadf',2345,'gasdfsadfsdaff',345,'34534','fgsdfgsagasdff'),(56792,'venugopal manchala',3454,'jaju sarees',4567,'4533','aldkfjaskldfs;alkdfl;asdflaks');
/*!40000 ALTER TABLE `item_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `UserId` varchar(10) NOT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Created_By` varchar(15) DEFAULT NULL,
  `Updated_DateTime` datetime NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('venu','venugopal','venu','2014-12-11 00:00:00');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-17 15:48:52
