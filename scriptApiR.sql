-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: apireservation
-- ------------------------------------------------------
-- Server version	5.7.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `billet`
--

DROP TABLE IF EXISTS `billet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `billet` (
  `billet_id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) NOT NULL,
  `prix` double NOT NULL,
  PRIMARY KEY (`billet_id`),
  KEY `film_id` (`film_id`),
  CONSTRAINT `billet_ibfk_1` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billet`
--

LOCK TABLES `billet` WRITE;
/*!40000 ALTER TABLE `billet` DISABLE KEYS */;
INSERT INTO `billet` VALUES (1,1,800),(2,2,70),(3,1,90);
/*!40000 ALTER TABLE `billet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `prenom` varchar(40) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` varchar(15) NOT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (2,'Wade','fatima',30,'fatima6800@gmail.com','0621228226'),(3,'toukh','Mouhamad',40,'toukh@gmail.com','0621225674'),(4,'Wade','Fatou',25,'wade@mail.com','02 25 87 45 65'),(5,'Lamine','Ndiaye',25,'new@gmail.com','25'),(6,'Lamine','Ndiaye',25,'new@gmail.com','25'),(7,'Lamine','Ndiaye',25,'new@gmail.com','25'),(8,'Lamine','Ndiaye',25,'new@gmail.com','25'),(9,'Lamine','Ndiaye',25,'new@gmail.com','25'),(10,'Lamine','Ndiaye',25,'new@gmail.com','25'),(11,'Lamine','Ndiaye',25,'new@gmail.com','25'),(12,'Lamine','Ndiaye',25,'new@gmail.com','25'),(13,'Lamine','Ndiaye',25,'new@gmail.com','25'),(14,'Lamine','Ndiaye',25,'new@gmail.com','25'),(15,'Lamine','Ndiaye',25,'new@gmail.com','25'),(16,'Lamine','Ndiaye',25,'new@gmail.com','25'),(17,'Lamine','Ndiaye',25,'new@gmail.com','25'),(18,'Lamine','Ndiaye',25,'new@gmail.com','25'),(19,'Lamine','Ndiaye',25,'new@gmail.com','25'),(20,'Lamine','Ndiaye',25,'new@gmail.com','25'),(21,'Lamine','Ndiaye',25,'new@gmail.com','25'),(22,'Lamine','Ndiaye',25,'new@gmail.com','25'),(23,'Lamine','Ndiaye',25,'new@gmail.com','25'),(24,'Lamine','Ndiaye',25,'new@gmail.com','25'),(25,'Lamine','Ndiaye',25,'new@gmail.com','25'),(26,'Lamine','Ndiaye',25,'new@gmail.com','25'),(27,'Lamine','Ndiaye',25,'new@gmail.com','25'),(28,'Lamine','Ndiaye',25,'new@gmail.com','25'),(29,'Lamine','Ndiaye',25,'new@gmail.com','25'),(30,'Lamine','Ndiaye',25,'new@gmail.com','25'),(31,'Lamine','Ndiaye',25,'new@gmail.com','25'),(32,'Lamine','Ndiaye',25,'new@gmail.com','25'),(33,'Lamine','Ndiaye',25,'new@gmail.com','25'),(34,'Lamine','Ndiaye',25,'new@gmail.com','25'),(35,'Lamine','Ndiaye',25,'new@gmail.com','25'),(36,'Lamine','Ndiaye',25,'new@gmail.com','25'),(37,'Lamine','Ndiaye',25,'new@gmail.com','25'),(38,'Lamine','Ndiaye',25,'new@gmail.com','25'),(39,'Lamine','Ndiaye',25,'new@gmail.com','25'),(40,'Lamine','Ndiaye',25,'new@gmail.com','25'),(41,'Lamine','Ndiaye',25,'new@gmail.com','25'),(42,'Lamine','Ndiaye',25,'new@gmail.com','25'),(43,'Lamine','Ndiaye',25,'new@gmail.com','25'),(44,'Lamine','Ndiaye',25,'new@gmail.com','25'),(45,'Lamine','Ndiaye',25,'new@gmail.com','25'),(46,'Lamine','Ndiaye',25,'new@gmail.com','25'),(47,'Lamine','Ndiaye',25,'new@gmail.com','25'),(48,'Lamine','Ndiaye',25,'new@gmail.com','25'),(49,'Lamine','Ndiaye',25,'new@gmail.com','25'),(50,'Lamine','Ndiaye',25,'new@gmail.com','25'),(51,'Lamine','Ndiaye',25,'new@gmail.com','25'),(52,'Lamine','Ndiaye',25,'new@gmail.com','25'),(53,'Lamine','Ndiaye',25,'new@gmail.com','25'),(54,'Lamine','Ndiaye',25,'new@gmail.com','25'),(55,'Lamine','Ndiaye',25,'new@gmail.com','25'),(56,'Lamine','Ndiaye',25,'new@gmail.com','25'),(57,'Lamine','Ndiaye',25,'new@gmail.com','25'),(58,'Lamine','Ndiaye',25,'new@gmail.com','25'),(59,'Lamine','Ndiaye',25,'new@gmail.com','25'),(60,'Lamine','Ndiaye',25,'new@gmail.com','25'),(61,'Lamine','Ndiaye',25,'new@gmail.com','25'),(62,'Lamine','Ndiaye',25,'new@gmail.com','25'),(63,'Lamine','Ndiaye',25,'new@gmail.com','25'),(64,'Lamine','Ndiaye',25,'new@gmail.com','25'),(65,'Lamine','Ndiaye',25,'new@gmail.com','25'),(66,'Lamine','Ndiaye',25,'new@gmail.com','25'),(67,'Lamine','Ndiaye',25,'new@gmail.com','25'),(68,'Lamine','Ndiaye',25,'new@gmail.com','25'),(69,'Lamine','Ndiaye',25,'new@gmail.com','25');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diffusion`
--

DROP TABLE IF EXISTS `diffusion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diffusion` (
  `diffusion_id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) NOT NULL,
  `numero_salle` int(11) NOT NULL,
  `date_diffusion` varchar(15) DEFAULT NULL,
  `horaire_diffusion` varchar(10) NOT NULL,
  PRIMARY KEY (`diffusion_id`),
  KEY `film_id` (`film_id`),
  CONSTRAINT `diffusion_ibfk_1` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diffusion`
--

LOCK TABLES `diffusion` WRITE;
/*!40000 ALTER TABLE `diffusion` DISABLE KEYS */;
INSERT INTO `diffusion` VALUES (1,1,12,'25/12/2012','2h'),(2,3,22,'20/02/2002','1h'),(3,1,10,'10/12/2012','1h-303n');
/*!40000 ALTER TABLE `diffusion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film`
--

DROP TABLE IF EXISTS `film`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film` (
  `film_id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(100) DEFAULT NULL,
  `duree` varchar(10) NOT NULL,
  PRIMARY KEY (`film_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film`
--

LOCK TABLES `film` WRITE;
/*!40000 ALTER TABLE `film` DISABLE KEYS */;
INSERT INTO `film` VALUES (1,'le début de la fin','2h'),(2,'fin du début','2h'),(3,'mi-temps','2h'),(4,'Film dans un film','1h 45h'),(5,'Film dans un film','1h 45h'),(6,'Film dans un film','1h 45h');
/*!40000 ALTER TABLE `film` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `date_reservation` varchar(100) DEFAULT NULL,
  `nombre_billet` int(11) DEFAULT NULL,
  `prix_billet` varchar(30) DEFAULT NULL,
  `nombre_place` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `film_id` int(11) NOT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `film_id` (`film_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE CASCADE,
  CONSTRAINT `reservation_ibfk_3` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (1,'25/10/2022',800,'70 £',800,NULL,1),(4,'25/10/2022',25,'85 £',NULL,4,5),(5,'25/10/2022',25,'85 £',NULL,4,5),(6,'25/10/2022',25,'85 £',NULL,4,5),(7,'25/10/2022',25,'85 £',NULL,4,5),(13,'25/10/2022',25,'85 £',NULL,4,5),(14,'25/10/2022',25,'85 £',NULL,4,5),(15,'25/10/2022',25,'85 £',NULL,4,5),(16,'25/10/2022',25,'85 £',NULL,4,5),(17,'25/10/2022',25,'85 £',NULL,4,5),(18,'25/10/2022',25,'85 £',NULL,4,5),(19,'25/10/2022',25,'85 £',NULL,4,5),(20,'25/10/2022',25,'85 £',NULL,4,5),(21,'25/10/2022',25,'85 £',NULL,4,5),(22,'25/10/2022',25,'85 £',NULL,4,5),(23,'25/10/2022',25,'85 £',NULL,4,5),(24,'25/10/2022',25,'85 £',NULL,4,5),(25,'25/10/2022',25,'85 £',NULL,4,5),(26,'25/10/2022',25,'85 £',NULL,4,5),(27,'25/10/2022',25,'85 £',NULL,4,5),(28,'25/10/2022',25,'85 £',NULL,4,5),(29,'25/10/2022',25,'85 £',NULL,4,5),(30,'25/10/2022',25,'85 £',NULL,4,5),(31,'25/10/2022',25,'85 £',NULL,4,5),(32,'25/10/2022',25,'85 £',NULL,4,5),(33,'25/10/2022',25,'85 £',NULL,4,5),(34,'25/10/2022',25,'85 £',NULL,4,5),(35,'25/10/2022',25,'85 £',NULL,4,5),(36,'25/10/2022',25,'85 £',NULL,4,5),(37,'25/10/2022',25,'85 £',NULL,4,5),(38,'25/10/2022',25,'85 £',NULL,4,5),(39,'25/10/2022',25,'85 £',NULL,4,5),(40,'25/10/2022',25,'85 £',NULL,4,5),(41,'25/10/2022',25,'85 £',NULL,4,5),(42,'25/10/2022',25,'85 £',NULL,4,5),(43,'25/10/2022',25,'85 £',NULL,4,5),(44,'25/10/2022',25,'85 £',NULL,4,5),(45,'25/10/2022',25,'85 £',NULL,4,5),(46,'25/10/2022',25,'85 £',NULL,4,5),(47,'25/10/2022',25,'85 £',NULL,4,5),(48,'25/10/2022',25,'85 £',NULL,4,5),(49,'25/10/2022',25,'85 £',NULL,4,5),(50,'25/10/2022',25,'85 £',NULL,4,5),(51,'25/10/2022',25,'85 £',NULL,4,5),(52,'25/10/2022',25,'85 £',NULL,4,5),(53,'25/10/2022',25,'85 £',NULL,4,5),(54,'25/10/2022',25,'85 £',NULL,4,5),(55,'25/10/2022',25,'85 £',NULL,4,5),(56,'25/10/2022',25,'85 £',NULL,4,5),(57,'25/10/2022',25,'85 £',NULL,4,5),(58,'25/10/2022',25,'85 £',NULL,4,5),(59,'25/10/2022',25,'85 £',NULL,4,5),(60,'25/10/2022',25,'85 £',NULL,4,5),(61,'25/10/2022',25,'85 £',NULL,4,5),(62,'25/10/2022',25,'85 £',NULL,4,5),(63,'25/10/2022',25,'85 £',NULL,4,5),(64,'25/10/2022',25,'85 £',NULL,4,5),(65,'25/10/2022',25,'85 £',NULL,4,5),(66,'25/10/2022',25,'85 £',NULL,4,5),(67,'25/10/2022',25,'85 £',NULL,4,5),(68,'25/10/2022',25,'85 £',NULL,4,5),(69,'25/10/2022',25,'85 £',NULL,4,5),(70,'25/10/2022',25,'85 £',NULL,4,5),(71,'25/10/2022',25,'85 £',NULL,4,5),(72,'25/10/2022',25,'85 £',NULL,4,5),(73,'25/10/2022',25,'85 £',NULL,4,5),(74,'25/10/2022',25,'85 £',NULL,4,5),(75,'25/10/2022',25,'85 £',NULL,4,5),(76,'25/10/2022',25,'85 £',NULL,4,5),(77,'25/10/2022',25,'85 £',NULL,4,5),(78,'25/10/2022',25,'85 £',NULL,4,5);
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spectateur`
--

DROP TABLE IF EXISTS `spectateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `spectateur` (
  `spectateur_id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(60) DEFAULT NULL,
  `reservation_id` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`spectateur_id`),
  KEY `reservation_id` (`reservation_id`),
  CONSTRAINT `spectateur_ibfk_1` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`reservation_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spectateur`
--

LOCK TABLES `spectateur` WRITE;
/*!40000 ALTER TABLE `spectateur` DISABLE KEYS */;
INSERT INTO `spectateur` VALUES (4,'wadela','Fatoua',1,25);
/*!40000 ALTER TABLE `spectateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'apireservation'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-06 22:45:23
