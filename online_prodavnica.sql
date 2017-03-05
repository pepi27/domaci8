-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: onlineprodavnica
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `adresa`
--

DROP TABLE IF EXISTS `adresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adresa` (
  `adresa_id` int(11) NOT NULL AUTO_INCREMENT,
  `ulica` varchar(255) DEFAULT NULL,
  `grad` varchar(255) DEFAULT NULL,
  `drzava` varchar(255) DEFAULT NULL,
  `korisnik_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`adresa_id`),
  KEY `korisnik_id` (`korisnik_id`),
  CONSTRAINT `adresa_ibfk_1` FOREIGN KEY (`korisnik_id`) REFERENCES `korisnik` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adresa`
--

LOCK TABLES `adresa` WRITE;
/*!40000 ALTER TABLE `adresa` DISABLE KEYS */;
INSERT INTO `adresa` VALUES (1,'Takovska 11','Beograd','Srbija',1),(2,'Futoska 22','Novi Sad','Srbija',2),(3,'Cara Dusana 33','Nis','Srbija',3),(4,'Bugarska 55','Plovdiv','Bugarska',4),(5,'32 Fedex St','Bazel','Svajcarska',5),(6,'35 Euler Strasse','Bazel','Svajcarska',6),(8,'Kneza Milosa 15','Subotica','Srbija',7);
/*!40000 ALTER TABLE `adresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `korisnik`
--

DROP TABLE IF EXISTS `korisnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `korisnik` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnik`
--

LOCK TABLES `korisnik` WRITE;
/*!40000 ALTER TABLE `korisnik` DISABLE KEYS */;
INSERT INTO `korisnik` VALUES (1,'Pera','Peric','pera@hotmail.com'),(2,'Sima','Simovic','sima@hotmail.com'),(3,'Milos','Milosevic','milos@hotmail.com'),(4,'Hristo','Stoichkov','hss@hotmail.com'),(5,'Roger','Federer','fedex@yahoo.com'),(6,'Leonhard ','Euler','euler@yahoo.com'),(7,'Marko','Markovic','marko@gmail.com');
/*!40000 ALTER TABLE `korisnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prodaja`
--

DROP TABLE IF EXISTS `prodaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prodaja` (
  `prodajaID` int(11) NOT NULL AUTO_INCREMENT,
  `prodatoKorisnikuID` int(11) DEFAULT NULL,
  `prodatoProizvodID` int(11) DEFAULT NULL,
  `prodatoKom` int(11) DEFAULT NULL,
  PRIMARY KEY (`prodajaID`),
  KEY `prodatoKorisnikuID` (`prodatoKorisnikuID`),
  KEY `prodatoProizvodID` (`prodatoProizvodID`),
  CONSTRAINT `prodaja_ibfk_1` FOREIGN KEY (`prodatoKorisnikuID`) REFERENCES `korisnik` (`id`),
  CONSTRAINT `prodaja_ibfk_2` FOREIGN KEY (`prodatoProizvodID`) REFERENCES `proizvod` (`proizvod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodaja`
--

LOCK TABLES `prodaja` WRITE;
/*!40000 ALTER TABLE `prodaja` DISABLE KEYS */;
INSERT INTO `prodaja` VALUES (1,1,1,1),(2,1,4,2),(3,2,2,1),(4,3,3,12),(5,3,1,1),(6,4,2,3),(7,5,3,2),(8,5,4,5),(9,6,4,0);
/*!40000 ALTER TABLE `prodaja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proizvod`
--

DROP TABLE IF EXISTS `proizvod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proizvod` (
  `proizvod_id` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) DEFAULT NULL,
  `cena` double DEFAULT NULL,
  PRIMARY KEY (`proizvod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proizvod`
--

LOCK TABLES `proizvod` WRITE;
/*!40000 ALTER TABLE `proizvod` DISABLE KEYS */;
INSERT INTO `proizvod` VALUES (1,'Fen',1200),(2,'Lutka',5234),(3,'Lan Seme',67.5),(4,'Hleb',55.8);
/*!40000 ALTER TABLE `proizvod` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-05 18:22:25


#Zadatak c)
#SELECT ime, prezime, email, ulica, grad, drzava FROM onlineprodavnica.korisnik
#JOIN adresa ON id = korisnik_id 
#ORDER BY drzava ASC;

#Zadadak d)
#SELECT ime, prezime, naziv, prodatoKom FROM prodaja p
#JOIN korisnik k ON p.prodatoKorisnikuID = k.id
#JOIN proizvod pr ON p.prodatoProizvodID = pr.proizvod_id 

#Zadatak e)
#select drzava, naziv from prodaja p
#join korisnik k on p.prodatoKorisnikuID = k.id
#join proizvod pr on p.prodatoProizvodID = pr.proizvod_id 
#join adresa a on k.id = a.adresa_id 

#Zadatak f)
#select ime, prezime, drzava, naziv from prodaja p
#join korisnik k on p.prodatoKorisnikuID = k.id
#join proizvod pr on p.prodatoProizvodID = pr.proizvod_id 
#join adresa a on k.id = a.adresa_id 
#where drzava = 'Svajcarska'and p.prodatoKom > 0

#Zadatak g)
#select ime, prezime, naziv, prodatoKom from prodaja p
#join korisnik k on p.prodatoKorisnikuID = k.id
#join proizvod pr on p.prodatoProizvodID = pr.proizvod_id 
#order by p.prodatoKom desc; 

#Zadatak i)
#select ime, prezime, naziv, prodatoKom from prodaja p
#join korisnik k on p.prodatoKorisnikuID = k.id
#join proizvod pr on p.prodatoProizvodID = pr.proizvod_id 
#where p.prodatoKom < 1

#Zatadak k)
#select drzava, SUM(prodatoKom) as prodato from prodaja p
#join korisnik k on p.prodatoKorisnikuID = k.id
#join proizvod pr on p.prodatoProizvodID = pr.proizvod_id 
#join adresa a on k.id = a.adresa_id
#group by drzava order by prodato desc

#Zadatak l)
#select drzava, count(drzava) as kupaca_iz_drzave from adresa a 
#join korisnik k on k.id = a.korisnik_id
#group by drzava
#order by count(drzava) desc

#Zadatak m)
#SELECT drzava, sum(prodatoKom * cena) as Ukupna_Zarada FROM onlineprodavnica.prodaja p
#JOIN korisnik k ON p.prodatoKorisnikuID = k.id 
#JOIN proizvod pr ON p.prodatoProizvodID = pr.proizvod_id
#JOIN adresa a ON k.id = a.korisnik_id
#group by drzava order by Ukupna_Zarada desc