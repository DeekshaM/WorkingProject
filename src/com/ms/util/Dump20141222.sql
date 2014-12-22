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
INSERT INTO `bill_details` VALUES (0,NULL,'WERLWER',3423,21,71883),(6,NULL,'Abbott',34,333,11322),(6,NULL,'ASDFSAD',23,33,759),(6,NULL,'3434SF',341,2,682),(6,NULL,'ASDFSDF',66,0.59,38.94),(7,NULL,'vENUGOPAL',22,22,484),(7,NULL,'ADSFKLASDKL',33.3,12.3,409.59),(7,NULL,'WERWER',23.33,32.23,751.93),(8,NULL,'sdafasdf',33,33,1089),(9,NULL,'a',23.3,232,5405.6),(9,NULL,'B',33,222,7326),(10,NULL,'afadsfasdf',345,32,11040),(11,NULL,'asadf',23,3,69),(12,NULL,'adfakdlf;lk',234,23,5382),(12,NULL,'3454553',33,2,66),(13,NULL,'ASDFSADF',34,3,102),(13,NULL,'SDIFG',33,22,726),(15,NULL,'2342',23,234,5382),(15,NULL,'sdfgsg',4,55,220),(16,NULL,'sdfgsdfg',55,5,275),(17,NULL,'Testq',23.2,23,533.6),(17,NULL,'RRR',30.4,22.4,680.96),(18,'P','asldfkjasklfdkasl',33.3,22.4,745.92),(18,'P','sadjfal;k',232,22.5,5220),(18,'P','alkfjkaldf',32,1.23,39.36),(19,'P','wwertwert',33.44,22,735.68),(19,'P','FGWERF',345,33,11385),(20,'P','wrtwertwert',345,44,15180),(20,'P','',245,45.88,11240.6),(20,'P','wsdfgsdfg',234,2.99,699.66),(21,'P','asdfsadf',2,23.3,46.6),(21,'P','fsdfd',3,33,99),(21,'P','sdfsdf',23,2,46),(21,'P','sdfgsdfg',34,3,102),(21,'P','sdfgdsfg',22,4,88),(21,'P','xcvb',43,5,215),(21,'P','xvb',45,6,270),(21,'P','xvb',5,7,35),(21,'P','xvb',6,8,48),(21,'P','xcvb',77,9,693),(21,'P','xcvb',89,90,8010),(21,'P','xvbxvcb',90,12,1080),(21,'P','xvcbxcb',89,2,178),(21,'P','xcvb',99,3,297),(21,'P','xcvb',67,4,268),(21,'P','xcv xc',456,5,2280),(21,'P','xcvbxvcb',24,6,144),(21,'P','vxcvb',13,7,91),(21,'P','xvbxcb',12,8,96),(21,'P','cxvbxcb',22,8,176),(21,'P','zxcvzx',22,8,176),(21,'P','zxcvxcv',22,9,198),(21,'P','zxv',22,60,1320),(21,'P','zxcv',3,65,195),(21,'P','zxcvgg',33,4,132),(21,'P','zxcvgg',34,34,1156),(21,'P','fffzxcv',89,3,267),(21,'P','zxcvssd',77,222,17094),(21,'P','sdfsdfafsdf',66,3,198),(21,'P','asdf',56,45,2520),(22,'P','Somthing1, 2345',34,56,1904),(22,'P','asdfkasdf asdf;lkadjsf, 345',4,567,2268),(22,'M','asdfkasdf asdf;lkadjsf, 3454',23.5,567,13324.5),(22,'P','Somthing1, 2345',67,56,3752),(23,'P','Somthing1, 2345',34,56,1904),(23,'P','asdfkasdf asdf;lkadjsf, 345',34,333,11322),(23,'P','ddasdlkfadsl, 234',22,4567,100474),(24,'P','Somthing1, 2345',3,56,168),(25,'P','Somthing1, 2345',33,56,1848),(25,'P','asdlfjkalsdkfkla',343,3,1029),(26,'P','asdfkasdf asdf;lkadjsf, 345',34,44,1496),(27,'P','asdfkasdf asdf;lkadjsf, 3454',7,567,3969),(28,'P','asdfkasdf asdf;lkadjsf, 345',345,5,1725),(29,'P','asdfkasdf asdf;lkadjsf, 345',43,4,172),(30,'P','Somthing1, 2345',4,56,224),(31,'P','fgassdf',44,33,1452),(32,'P','dffgd',3,345,1035),(33,'P','Somthing1, 2345',343,56,19208),(34,'P','dfgdsfg',34,34,1156),(35,'P','asdfkasdf asdf;lkadjsf, 345',34,567,19278),(35,'P','ddasdlkfadsl, 234',7,4567,31969),(36,'P','Somthing1, 2345',45,3434,154530),(36,'P','asdfkasdf asdf;lkadjsf, 3454',4,567,2268),(37,'P','sdfesdfsadf, 56791',44,345,15180),(38,'P','Somthing1, 2345',4,56,224),(39,'P','sadsdafsdf',3,44,132),(40,'P','sdfesdfsadf, 56791',34,3,102),(41,'P','sad',3434,4,13736),(42,'P','sfsdfsadfsdaf',4,444,1776),(42,'P','sdfgsdfgsdg',4,566,2264),(43,'P','sfgsdfg',44,4,176),(43,'P','sfgsdfgsdfg',5,34,170),(43,'P','asdfgsdfg',43,5,215),(44,'P','ssdfg',4,55,220),(44,'P','sfdgsdfgsdfg',45,4,180),(45,'P','sdfgsdfg',45,456,20520),(45,'P','dfghdfg',44,4,176),(46,'P','sdfgsadfs',345,55,18975),(46,'P','sdfgsdf',4,3456,13824),(47,'P','3434343',34,76,2584),(47,'P','dgdfg',4,764,3056),(48,'P','wdrtwerwert',345,5,1725),(48,'P','56790\' name',33,3,99),(48,'P','234\' ddasdlkfadsl',34,23,782),(49,'P','234, ddasdlkfadsl',33,4567,150711),(49,'P','56788, venugopal',33,30,990),(49,'P','56790, name',3,23234,69702),(50,'P','2345, Somthing1',33,56,1848),(50,'P','56789, gadwall',33,2,66),(51,'P','234, ddasdlkfadsldg',4,45,180),(52,'P','234, ddasdlkfadsl',5,5.68,28.38),(52,'P','56792, venugopal manchala',5.4,4567,24661.8),(52,'P','56790, name',55,54.6,3003),(52,'P','56791, sdfesdfsadf',54,32,1728),(53,'P','234, ddasdlkfadslasff',44,4,176),(54,'P','234, ddasdlkfadsl',44,33,1452),(54,'P','344',45,3,135),(54,'P','234, ddasdlkfadsl',4,55,220),(54,'P','345, asdfkasdf asdf;lkadjsf',6,77,462),(54,'P','56790, name',7,7.77,54.39),(55,'P','234, ddasdlkfadsl',3,4567,13701),(55,'P','56788, venugopal',3425,34,116450),(55,'P','56788, venugopal',33,3.66,120.78),(55,'P','56788, venugopal',43,678,29154),(56,'P','234, ddasdlkfadsl',23,2,46),(56,'P','345, asdfkasdf asdf;lkadjsf',33,567,18711),(56,'P','56788, venugopal',4,4.4,17.6),(57,'P','234, ddasdlkfadsl',3,4567,13701),(57,'P','3454, asdfkasdf asdf;lkadjsf',4,567,2268),(57,'P','56788, venugopal',4,3,12),(57,'P','56788, venugopal',34,3.78,128.52),(57,'P','56788, venugopal',33,22,726),(57,'P','56791, sdfesdfsadf',2,2.67,5.34),(58,'P','ADSFSDF',33,3.45,113.85),(58,'P','345, asdfkasdf asdf;lkadjsf',23.33,22,513.26),(58,'P','3454, asdfkasdf asdf;lkadjsf',34,22.56,767.04),(58,'P','56788, venugopal',23,20,460),(58,'P','56789, gadwall',23,22,506),(58,'P','56789, gadwall',34,22,748),(59,'P','234, ddasdlkfadsl',3,4567,13701),(59,'P','345, asdfkasdf asdf;lkadjsf',34,3.67,124.78),(59,'P','3454, asdfkasdf asdf;lkadjsf',2,567,1134),(59,'P','56789, gadwall',32,22.22,711.04),(59,'P','56790, name',21.2,22.09,468.308),(59,'P','VENUGOPAL',34,33.3,1132.2),(59,'P','MANCHALA',23,22,506),(60,'P','234, ddasdlkfadsl',33,2,66),(60,'P','345, asdfkasdf asdf;lkadjsf',33,21,693),(60,'P','32',12,323,3876),(60,'P','345, asdfkasdf asdf;lkadjsf',113,21,2373),(60,'P','2345, Somthing1',22,21,462),(61,'P','fgdgsdfgsdfg',5,4,20),(61,'P','f',44,44,1936),(61,'P','sfgsdfgsdfg',442,22,9724),(61,'P','sfvsdfgsdfg',3,5,15),(61,'P','sdfgsdfgsdfg',4,232,928),(61,'P','34534',4,4,16),(62,'P','234, ddasdlkfadsl',233,23334,5436820),(63,'P','sdf',4,345,1380),(64,'P','234, ddasdlkfadsl',242,23,5566),(64,'P','345, asdfkasdf asdf;lkadjsf',23,2,46),(64,'P','56788, venugopal',3,345,1035),(65,'P','234, ddasdlkfadsl',23,2,46),(66,'P','234, ddasdlkfadsl',233,2,466),(66,'P','345, asdfkasdf asdf;lkadjsf',33,3,99),(66,'P','345, asdfkasdf asdf;lkadjsf',3,223,669),(66,'P','56788, venugopal',3,323,969),(67,'P','234, ddasdlkfadsl',45,3,135),(67,'P','234, ddasdlkfadsl',43,22,946),(67,'P','56788, venugopal',65,12,780),(67,'P','56789, gadwall',33,345,11385),(68,'P','234, ddasdlkfadslq',34,3,102),(68,'P','3454, asdfkasdf asdf;lkadjsf',3,33,99),(68,'P','56788, venugopal',3,23,69),(68,'P','56790, name',3,44,132),(69,'P','dfgsdfg',456,5,2280),(70,'P','wertewrtewrt',2342.44,2452.34,5744460),(71,'P','234, ddasdlkfadsl',4,4567,18268),(71,'P','345, asdfkasdf asdf;lkadjsf',34,23,782),(71,'P','3454, asdfkasdf asdf;lkadjsf',33,3,99),(71,'P','56790, name',3,22.22,66.66),(71,'P','56790, name',4,3,12),(72,'P','sfdgdfg',45,34,1530),(72,'P','sdgsfgs',53,3,159),(72,'P','safgsfg',4,4,16),(72,'P','sfgsdgsfg',45,34,1530),(72,'P','sfgsdgfas',4,56,224),(72,'P','234, ddasdlkfadsl',45,5,225),(72,'P','45',34,4,136),(72,'P','wrtertwrt',4,6,24),(72,'P','45t',4,34,136),(73,'P','234, ddasdlkfadsl',23,32.2,740.6),(73,'P','345, asdfkasdf asdf;lkadjsf',3,32,96),(73,'P','234, ddasdlkfadsl',32,12,384),(73,'P','3454, asdfkasdf asdf;lkadjsf',32,43,1376),(73,'P','56789, gadwall',32,32,1024),(74,'P','234, ddasdlkfadsl',34,4567,155278),(74,'P','234, ddasdlkfadsl',234,3,702),(74,'P','56788, venugopal',3,3.33,9.99),(74,'P','56788, venugopal',32,22,704),(75,'P','sdfasdf',34,3,102),(75,'P','adfasdfasdf',3,2,6),(75,'P','adfasdfadf',33,2,66),(75,'P','adf',23,3,69),(75,'P','adfsdfdf',32,3,96),(75,'P','234, ddasdlkfadsl',33,23,759),(75,'P','23',3,3,9),(76,'P','234, ddasdlkfadsl',33,22,726),(76,'P','asdfasdf',34,23,782),(76,'P','asdfadsfasdf',3,32,96),(76,'P','adfsadfasdf',3,333,999),(76,'P','asdfsadfasdf',3,34,102),(76,'P','sfgasdf',2344,3,7032),(76,'P','e33434',4,343,1372),(76,'P','345',34,4,136),(77,'P','23`',4,43,172),(77,'P','wadrsadf',4,34,136),(77,'P','sdfgs',44,34,1496),(77,'P','asfaxdfad',34,4,136),(77,'P','asasdf',34,34,1156),(77,'P','sdfsdf',4,44,176),(77,'P','56788, venugopal',4,234,936),(78,'P','234, ddasdlkfadsl',3,33,99),(78,'P','345, asdfkasdf asdf;lkadjsf',323,33,10659),(78,'P','adfasdf',33,2,66),(78,'P','asfasdfdfa',3,32,96),(78,'P','adfadfsdf',3,43,129),(78,'P','234, ddasdlkfadsl',23,2,46),(78,'P','345, asdfkasdf asdf;lkadjsf',34,4,136),(79,'P','2345, Somthing1',56,5,280),(79,'P','afasdf',6,55,330),(79,'P','adsfadf',45,4,180),(79,'P','adsf',45,5,225),(79,'P','adfadf',45,55,2475),(79,'P','sfgsaf',4,44,176),(79,'P','adfa',4,44,176),(79,'P','asdfadf',56,6,336),(79,'P','asdfasdf',55,5,275),(80,'P','35234',55,55,3025),(80,'P','rsdfgsdfg',4,5,20),(80,'P','sdfgsdfg',34,6,204),(80,'P','sdfg',34,7,238),(80,'P','sdfg',34,7,238),(80,'P','234, ddasdlkfadsl',345,4,1380),(80,'P','fgsdfg',76,5,380),(80,'P','sfdg',7,6,42),(80,'P','sag',56,3,168),(80,'P','sdfgsdfg',4,2,8),(81,'P','wsefsdfg',234,5,1170),(81,'P','sadfsdf',23,5,115),(81,'P','sadf',3,5,15),(81,'P','asdfsdf',3,5,15),(81,'P','wertwert',3,5,15),(81,'P','rtwertwert',3,5,15),(81,'P','wert',3,6,18),(81,'P','wertwertwert',3,7,21),(82,'P','fsdfgsfdgsdfg',54,9,486),(82,'P','sdfg',45,8,360),(82,'P','sdfg',45,7,315),(82,'P','sdfg',45,6,270),(82,'P','sfdg',33,5,165),(82,'P','sdfgsdfg',345,4,1380),(82,'P','sdfg',667,3,2001),(82,'P','sdfg',888,3,2664),(82,'P','56eryeryw',77,2,154),(82,'P','rwertwertewr',67,7,469),(84,'P','wdrt',34,4,136),(84,'P','sdds',3,45,135),(84,'P','sdfdf',23,6,138),(84,'P','fdsgsdfg',4,6,24),(84,'P','sdfg',4,665,2660),(85,'P','fgsdf',23,3,69),(85,'P','sdf',434,2,868),(85,'P','dfsdf',34,2,68),(85,'P','adf',34,2,68),(85,'P','adf',34,442,15028),(85,'P','fasdfsadf',34,4,136),(85,'P','asdfasdf',34,3,102),(85,'P','234, ddasdlkfadsladfasdf',34,4,136),(85,'P','adfadfdaf',4,34,136),(86,'P','dsfg',3434,4,13736),(86,'P','sdfg',34,4,136),(86,'P','sfg',44,4,176),(86,'P','sdfg',233,2,466),(86,'P','sfgsdf',23,3,69),(87,'P','sdf',34,34,1156),(87,'P','asdf',4,2344,9376),(87,'P','adf',3,4,12),(87,'P','adsf',44,42,1848),(87,'P','asdfadf',3,3,9),(88,'P','fasdfsdfsdaf',34,3,102),(88,'P','sdsdafsdf',4,4,16),(88,'P','sdfgasd',4,4,16),(88,'P','adsfsadf',4,4,16),(88,'P','asdfasdfsdfsdf',4,4,16),(88,'P','234, ddasdlkfadsl',4,4,16),(88,'P','ert',3,4,12),(88,'P','wertwertwertr',3,4,12),(89,'P','sadfdfdf',34,4,136),(89,'P','adfadf',23,3,69),(89,'P','asdf',33,2,66),(89,'P','adf',333,3,999),(89,'P','adfadf',233,2,466),(89,'P','345, asdfkasdf asdf;lkadjsf',4,567,2268),(89,'P','345',345,345,119025),(90,'P','32423452345',4,4,16),(90,'P','etwertwertwert',34,345,11730),(90,'P','345, asdfkasdf asdf;lkadjsf',3,345,1035),(91,'P','aasldfkjasdkf',23,22,506),(91,'P','345, asdfkasdf asdf;lkadjsf',2,567,1134),(91,'P','',34,3,102),(92,'P','2356',4,7,28),(92,'P','2345, Somthing1',4,45,180),(92,'P','fgasdfasdf',44,2,88),(92,'P','asdfasdfaf',345,5,1725),(93,'P','dfsdafasdf',3,3,9),(93,'P','asdfkasdf asdf;lkadjsf',4,3,12),(93,'P','dfsdafasdf',3,3,9),(93,'P','asdfkasdf asdf;lkadjsf',4,3,12),(94,'P','Somthing1',65,34,2210),(94,'P','asdfkasdf asdf;lkadjsf',4,22,88);
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
  `Created_By` varchar(10) DEFAULT NULL,
  `Recived_Amount` float DEFAULT NULL,
  PRIMARY KEY (`Bill_No`,`Bill_Date`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_main`
--

LOCK TABLES `bill_main` WRITE;
/*!40000 ALTER TABLE `bill_main` DISABLE KEYS */;
INSERT INTO `bill_main` VALUES (1,'2014-12-11 00:00:00','venugopal manchala','9949493340',7326,'Venugopal',3000),(2,'2014-12-11 00:00:00','Vijay Babu','8844883000',8996,'venu',8996),(3,'2014-12-11 00:00:00','VIJAYA bABU','2353423492',2160040,'venu',4555),(4,'2014-12-11 00:00:00','gOPALm','3234523423',171888,'venu',1700000),(5,'2014-12-11 00:00:00','cHANDRAKANTH','4353453534',268578,'venu',235612),(6,'2014-12-11 00:00:00','SAMSUNG','5423492130',12802,'venu',12000),(7,'2014-12-11 00:00:00','dell','3458903409',1646,'venu',1548),(8,'2014-12-12 00:00:00','shankaraiah','2145234523',1089,'venu',333),(9,'12/12/2014:05:12:25 PM','Test Class','2345242340',12732,'venu',12700),(10,'12/12/2014:05:17:40 PM','Testing Bill','333333',11040,'venu',23234),(11,'12/12/2014:05:31:12 PM','venugopal','3432423423',69,'venu',45),(12,'12/12/2014:05:39:33 PM','Test Venugopal','9949493340',5448,'venu',5200),(13,'12/12/2014:05:42:44 PM','aldfk;asldfjkkl;kl','3452345234',828,'venu',334),(14,'12/12/2014:05:59:16 PM','venugopal manchala','2342342340',5565460,'venu',345234),(15,'12/12/2014:06:01:52 PM','venugopal','2334234234',5602,'venu',4545),(16,'12/12/2014:06:02:25 PM','fglkgj','3453453534',275,'venu',455),(17,'15/12/2014:04:29:17 PM','Today','9949493340',1214.56,'venu',1254.22),(18,'15/12/2014:05:37:57 PM','DellItems','2345233423',6005.28,'venu',625.321),(19,'15/12/2014:05:40:05 PM','fdgsdfgsd','3456345345',12120.7,'venu',345345),(20,'15/12/2014','ADSFSADFSADF','4534534534',27120.3,'venu',4557.9),(21,'15/12/2014','SREE RAMA NARAYAN SIRCILLA','9998898898',37518.6,'venu',37520),(22,'16/12/2014','ADSFASDKL','2342342342',21248.5,'venu',21245),(23,'16/12/2014','TESTING WITH JNLP','8889999999',113700,'venu',113700),(24,'16/12/2014','TEST','3534525424',168,'venu',150),(25,'16/12/2014','TESTING DOCUMENT','2342342342',2877,'venu',2800),(26,'16/12/2014','ADSFSAD','3453453453',1496,'venu',44),(27,'16/12/2014','ASDFSDFSADF','3453453453',3969,'venu',6776),(28,'16/12/2014','SDFSDF','3453453453',1725,'venu',456),(29,'16/12/2014','SDDFSDFSDF','3453453333',172,'venu',3434),(30,'16/12/2014','SDFSDFSADF','3453343343',224,'venu',3434),(31,'16/12/2014','ASDFSADF','3453453453',1452,'venu',3434),(32,'16/12/2014','DSAFSDFASDF','3434534534',1035,'venu',23444),(33,'16/12/2014','ASDFLKJSDKL','2342423422',19208,'venu',5656),(34,'16/12/2014','FDSDFGSDFG','4564563563',1156,'venu',353),(35,'17/12/2014','XZCGXCV','4543453453',51247,'venu',51247),(36,'17/12/2014','SFGASDFASDF','5456323564',156798,'venu',1452),(37,'17/12/2014','FADFSDF','2334214123',15180,'venu',0),(38,'17/12/2014','SADLFKSAJDK','2349872048',224,'venu',343),(39,'17/12/2014','SDASAD','3423232222',132,'venu',444),(40,'17/12/2014','ADFDFDS','3433444444',102,'venu',334),(41,'17/12/2014','ADFASDF','2323233333',13736,'venu',33434),(42,'17/12/2014','EADFA','2222222222',4040,'venu',3444),(43,'17/12/2014','ADSFSDFASDF','3443444444',561,'venu',3445),(44,'17/12/2014','ASAS','3444444444',400,'venu',344453),(45,'17/12/2014','ASADFSDF','5666666666',20696,'venu',34534),(46,'17/12/2014','ZXVZXCV','3453534534',32799,'venu',345345),(47,'17/12/2014','ASDSDF','3434343434',5640,'venu',3445),(48,'17/12/2014','ASDFSADFASDF','3453453453',2606,'venu',3444),(49,'17/12/2014','ASDFASDFASDF','3423452443',221403,'venu',3534540),(50,'18/12/2014','TESTING PROJECT FOR THE TIME BEAIN','1234567890',1914,'venu',1914),(51,'18/12/2014','TESTING DOCUMENT FOR ','3434534534',180,'venu',454),(52,'18/12/2014','DSFADFSDFF56','2345324543',29421.2,'venu',34555),(53,'18/12/2014','DFASDF','3453452234',176,'venu',3443),(54,'18/12/2014','SFGADFADF','4534534534',2323.39,'venu',345),(55,'18/12/2014','VENUGOPAL MANCHAL','2342134908',159426,'venu',3455),(56,'19/12/2014','VENUGOPAL MANCHALA','9989453432',18774.6,'venu',345),(57,'19/12/2014','TESTING DOCUMENT','2223423423',16840.9,'venu',16000),(58,'19/12/2014','HOME TAAA','3523423423',3108.15,'venu',3444),(59,'19/12/2014','TESTING THE DOCUMENT','1234567890',17777.3,'venu',17777.3),(60,'19/12/2014','ADKFJADKFLASDFKLK','2342342342',7470,'venu',7470),(61,'19/12/2014','SDGSDFG','3453453452',12639,'venu',455),(62,'19/12/2014','GFDAFKASDKFK','2342342342',5436820,'venu',3),(63,'19/12/2014','SDFSADFASDF','3452314452',1380,'venu',3434),(64,'19/12/2014','DFSADFJ','2323412341',6647,'venu',1245),(65,'19/12/2014','VENUGOPAL MANCHALA','2445242342',46,'venu',44),(66,'19/12/2014','TESTIND','2342342340',2203,'venu',7778),(67,'19/12/2014','JHGKJHGKJHHK','5645647564',13246,'venu',3454),(68,'19/12/2014','ERRDFGSDAF','3456343456',402,'venu',5634),(69,'19/12/2014','ERTWERFG','5623453452',2280,'venu',4645),(70,'19/12/2014','ASDFSADF','3453452345',5744460,'venu',4455440),(71,'19/12/2014','AWEKFSL;DKFJ;LK','2342342342',19227.7,'venu',334223),(72,'19/12/2014','SFDSDAF','3434523452',3980,'venu',3453),(73,'19/12/2014','ASDFLJKASDFL;KJ','3234234234',3620.6,'venu',34343),(74,'19/12/2014','ZCKASDFJKJ','2323242342',156694,'venu',3434),(75,'19/12/2014','KJVGL;ASDFJAKL1','2342342342',1107,'venu',234),(76,'19/12/2014','SDAFADSFL;KJ','2123232232',11245,'venu',3443),(77,'19/12/2014','ERRGSDFG','2342342342',4208,'venu',2232),(78,'19/12/2014','WEEFSDFSDF345','2345234523',11231,'venu',2342),(79,'19/12/2014','WERTWERTWERT','2345345356',4453,'venu',3345),(80,'19/12/2014','WERWER','2542345234',5703,'venu',3456),(81,'19/12/2014','RTEDFASDFASDF','3452345234',1384,'venu',456),(82,'19/12/2014','SDAFSADFSDAF2345','5345345345',8264,'venu',45455),(83,'19/12/2014','ADFASDFASDFASDFASDFASDFSADFSADFSADF','2345234523',3613,'venu',45456),(84,'19/12/2014','SDFSADFSADF','3453453453',3093,'venu',34534),(85,'19/12/2014','SDDFASDF43R','3434534252',16611,'venu',23434),(86,'19/12/2014','DFASDFSDAF','3453453453',14583,'venu',34434),(87,'19/12/2014','FSGFSALDKFSLAKDF','3453245234',12401,'venu',34545),(88,'19/12/2014','SDFLJKLFKJSD','4235234234',206,'venu',345),(89,'19/12/2014','VENUGOPAL ','2344444443',123029,'venu',234),(90,'19/12/2014','SDFFSDFSDAF34534','3453453452',12781,'venu',345),(91,'19/12/2014','DFKAJSDFKLJSADF','2234234234',1742,'venu',23423),(92,'19/12/2014','DFSDAFSDF','3453453435',2021,'venu',3445),(93,'22/12/2014','','',21,'venu',0),(94,'22/12/2014','','',2298,'venu',0);
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
INSERT INTO `collection` VALUES ('17/12/2014','adsfsadfasdf',3434.8),('17/12/2014','adsfsadfasdfsdf',43434.8),('17/12/2014','asdsdfsdf',34.788),('17/12/2014','asdsdfsdf',3434.79),('17/12/2014','Testing Information',34343.3),('17/12/2014','Adding collection amount',45.4),('17/12/2014','asdfadfsdf',2342),('17/12/2014','36, SFGASDFASDF',1452),('17/12/2014','venugopal',45000),('17/12/2014','38, SADLFKSAJDK',343),('17/12/2014','39, SDASAD',444),('17/12/2014','40, ADFDFDS',334),('17/12/2014','41, ADFASDF',33434),('17/12/2014','42, EADFA',3444),('17/12/2014','43, ADSFSDFASDF',3445),('17/12/2014','44, ASAS',344453),('17/12/2014','45, ASADFSDF',34534),('17/12/2014','46, ZXVZXCV',345345),('17/12/2014','47, ASDSDF',3445),('17/12/2014','48, ASDFSADFASDF',3444),('17/12/2014','49, ASDFASDFASDF',3534540),('18/12/2014','50, TESTING PROJECT FOR THE TIME BEAIN',1914),('18/12/2014','51, TESTING DOCUMENT FOR ',454),('18/12/2014','52, DSFADFSDFF56',34555),('18/12/2014','53, DFASDF',3443),('18/12/2014','54, SFGADFADF',345),('18/12/2014','55, VENUGOPAL MANCHAL',3455),('19/12/2014','56, VENUGOPAL MANCHALA',345),('19/12/2014','57, TESTING DOCUMENT',16000),('19/12/2014','58, HOME TAAA',3444),('19/12/2014','59, TESTING THE DOCUMENT',17777.3),('19/12/2014','60, ADKFJADKFLASDFKLK',7470),('19/12/2014','61, SDGSDFG',455),('19/12/2014','62, GFDAFKASDKFK',3),('19/12/2014','63, SDFSADFASDF',3434),('19/12/2014','64, DFSADFJ',1245),('19/12/2014','65, VENUGOPAL MANCHALA',44),('19/12/2014','66, TESTIND',7778),('19/12/2014','67, JHGKJHGKJHHK',3454),('19/12/2014','68, ERRDFGSDAF',5634),('19/12/2014','69, ERTWERFG',4645),('19/12/2014','70, ASDFSADF',4455440),('19/12/2014','71, AWEKFSL;DKFJ;LK',334223),('19/12/2014','72, SFDSDAF',3453),('19/12/2014','73, ASDFLJKASDFL;KJ',34343),('19/12/2014','74, ZCKASDFJKJ',3434),('19/12/2014','75, KJVGL;ASDFJAKL1',234),('19/12/2014','76, SDAFADSFL;KJ',3443),('19/12/2014','77, ERRGSDFG',2232),('19/12/2014','78, WEEFSDFSDF345',2342),('19/12/2014','79, WERTWERTWERT',3345),('19/12/2014','80, WERWER',3456),('19/12/2014','81, RTEDFASDFASDF',456),('19/12/2014','82, SDAFSADFSDAF2345',45455),('19/12/2014','84, SDFSADFSADF',34534),('19/12/2014','85, SDDFASDF43R',23434),('19/12/2014','86, DFASDFSDAF',34434),('19/12/2014','87, FSGFSALDKFSLAKDF',34545),('19/12/2014','88, SDFLJKLFKJSD',345),('19/12/2014','89, VENUGOPAL ',234),('19/12/2014','90, SDFFSDFSDAF34534',345),('19/12/2014','91, DFKAJSDFKLJSADF',23423),('19/12/2014','92, DFSDAFSDF',3445),('22/12/2014','94, ',0);
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

-- Dump completed on 2014-12-22 12:06:40
