CREATE DATABASE  IF NOT EXISTS `doctor` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `doctor`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: doctor
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `add_doctor`
--

DROP TABLE IF EXISTS `add_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `add_doctor` (
  `Doctor ID` varchar(45) NOT NULL,
  `First Name` varchar(45) NOT NULL,
  `Middle Name` varchar(45) NOT NULL,
  `Last Name` varchar(45) NOT NULL,
  `Age` int NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Contact` int NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Department` varchar(45) NOT NULL,
  `Joining Date` varchar(45) NOT NULL,
  `Visiting Time` varchar(45) NOT NULL,
  PRIMARY KEY (`Doctor ID`),
  UNIQUE KEY `Doctor ID_UNIQUE` (`Doctor ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_doctor`
--

LOCK TABLES `add_doctor` WRITE;
/*!40000 ALTER TABLE `add_doctor` DISABLE KEYS */;
INSERT INTO `add_doctor` VALUES (' D - 111','Haresh','Nilesh','Mokashi',33,'Male',998976789,'Budhagi Nagar,Thane,400605','Cardiologist','2020/11/31/0','10 : 00 AM'),('D - 226','Naman','Mrugesh','Tatkare',31,'Male',771212781,'503,Arenja Corner,Vashi,Mumbai','Neurology','2020/9/22','10 : 00 AM'),('D - 321','Vinay','Manoj','Kharkar',30,'Male',809763366,'Creep Road,Thane,400605','Cardiologist','2020/2/30','10 : 00 AM'),('D - 322','Sahil','Santosh','Warude',33,'Male',993344526,'Hiranandani Estate,Thane , 400605','general surgery','2020/10/31','10 : 00 AM');
/*!40000 ALTER TABLE `add_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `add_patient`
--

DROP TABLE IF EXISTS `add_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `add_patient` (
  `Patient_ID` varchar(45) NOT NULL,
  `First Name` varchar(45) NOT NULL,
  `Middle Name` varchar(45) NOT NULL,
  `Last Name` varchar(45) NOT NULL,
  `Age` int NOT NULL,
  `Blood Group` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Contact No` int NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Prescription` varchar(200) NOT NULL,
  PRIMARY KEY (`Patient_ID`),
  UNIQUE KEY `Patient_ID_UNIQUE` (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_patient`
--

LOCK TABLES `add_patient` WRITE;
/*!40000 ALTER TABLE `add_patient` DISABLE KEYS */;
INSERT INTO `add_patient` VALUES ('P - 116','Tushar','Naresh','Tubhe',35,'AB+','Male',778797879,'Prem Jyoti,Rambaug,Kalyan','Nebistar SA, Moxovas 0.3, Ciplox'),('P - 117','Aarav','Yogesh','Desai',26,'O+','Male',981298192,'Firingi Road,Airoli,Navi Mumbai',''),('P - 118','Ridhvi','Sandesh','Aarole',32,'A+','Female',811298657,'Amarpali Apt,Ankur road,Mulund East,Mumbai','Calpol'),('P - 119','Seema','Mohan','Mayekar',40,'B-','Female',777127789,'Vallabh Lane,Ghatkopar,Mumbai',''),('P - 303','Vaibhavi','Manoj','Kharkar',20,'AB-','Female',932445174,'Thane','Calpol');
/*!40000 ALTER TABLE `add_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `Doctor ID` varchar(45) NOT NULL,
  `PATIENT ID` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Time` varchar(45) NOT NULL,
  PRIMARY KEY (`Doctor ID`),
  UNIQUE KEY `Doctor ID_UNIQUE` (`Doctor ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES ('','','',''),('D - 215','P - 116','2020/1/2','1 : 00  PM'),('D - 218','P - 111','2020/12/30','1 :00 PM'),('D - 220','P - 118','2021/1/12','11 : 00 AM'),('D - 221','P - 222','2020-11-12','1: 30'),('D - 222','P - 116','2021/1/20','6 : 30 PM'),('D - 321','D - 303','2020/8/30','2 : 00 PM'),('D - 322','P - 303','2020/12/31','2 : 00 PM'),('D - 999','P - 111','2020/11/1','12 :00 AM');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-05 10:47:38
