-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.48-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hms_db
--

CREATE DATABASE IF NOT EXISTS hms_db;
USE hms_db;

--
-- Definition of table `admitpatient_room`
--

DROP TABLE IF EXISTS `admitpatient_room`;
CREATE TABLE `admitpatient_room` (
  `AdmitID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(45) DEFAULT NULL,
  `Disease` longtext,
  `RoomNo` varchar(45) DEFAULT NULL,
  `AdmitDate` longtext,
  `DoctorID` varchar(45) DEFAULT NULL,
  `AP_Remarks` longtext,
  PRIMARY KEY (`AdmitID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admitpatient_room`
--

/*!40000 ALTER TABLE `admitpatient_room` DISABLE KEYS */;
INSERT INTO `admitpatient_room` (`AdmitID`,`PatientID`,`Disease`,`RoomNo`,`AdmitDate`,`DoctorID`,`AP_Remarks`) VALUES 
 (1,'20004','sdfdsfsdf','3','13/03/2014','1000','for fever'),
 (2,'20004','sdfsd','2','13/03/2014','1000','sdfsdf');
/*!40000 ALTER TABLE `admitpatient_room` ENABLE KEYS */;


--
-- Definition of table `admitpatient_ward`
--

DROP TABLE IF EXISTS `admitpatient_ward`;
CREATE TABLE `admitpatient_ward` (
  `admitID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `patientID` varchar(50) NOT NULL,
  `Disease` longtext NOT NULL,
  `Wardname` varchar(50) NOT NULL,
  `AdmitDate` longtext NOT NULL,
  `DoctorID` varchar(50) NOT NULL,
  `AP_Remarks` longtext NOT NULL,
  PRIMARY KEY (`admitID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admitpatient_ward`
--

/*!40000 ALTER TABLE `admitpatient_ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `admitpatient_ward` ENABLE KEYS */;


--
-- Definition of table `bill_room`
--

DROP TABLE IF EXISTS `bill_room`;
CREATE TABLE `bill_room` (
  `BillNo` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `DischargeID` int(11) unsigned DEFAULT NULL,
  `BillingDate` text,
  `NoOfDays` int(11) unsigned DEFAULT NULL,
  `RoomCharges` double DEFAULT NULL,
  `TotalRoomCharges` double DEFAULT NULL,
  `ServiceCharges` double DEFAULT NULL,
  `TotalCharges` double DEFAULT NULL,
  `PaymentMode` text,
  `PaymentModeDetails` text,
  `ChargesPaid` double DEFAULT NULL,
  `DueCharges` double DEFAULT NULL,
  PRIMARY KEY (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_room`
--

/*!40000 ALTER TABLE `bill_room` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill_room` ENABLE KEYS */;


--
-- Definition of table `bill_ward`
--

DROP TABLE IF EXISTS `bill_ward`;
CREATE TABLE `bill_ward` (
  `BillNo` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `DischargeID` int(11) unsigned DEFAULT NULL,
  `BillingDate` longtext,
  `BedCharges` double DEFAULT NULL,
  `NoOfDays` int(11) unsigned DEFAULT NULL,
  `TotalBedCharges` double DEFAULT NULL,
  `ServiceCharges` double DEFAULT NULL,
  `TotalCharges` double DEFAULT NULL,
  `PaymentMode` longtext,
  `PaymentModeDetails` longtext,
  `ChargesPaid` double DEFAULT NULL,
  `DueCharges` double DEFAULT NULL,
  PRIMARY KEY (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_ward`
--

/*!40000 ALTER TABLE `bill_ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill_ward` ENABLE KEYS */;


--
-- Definition of table `dischargepatient_room`
--

DROP TABLE IF EXISTS `dischargepatient_room`;
CREATE TABLE `dischargepatient_room` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `AdmitID` int(11) unsigned DEFAULT NULL,
  `DischargeDate` text,
  `DP_Remarks` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dischargepatient_room`
--

/*!40000 ALTER TABLE `dischargepatient_room` DISABLE KEYS */;
INSERT INTO `dischargepatient_room` (`ID`,`AdmitID`,`DischargeDate`,`DP_Remarks`) VALUES 
 (1,2,'14/03/2014','dfdfdf');
/*!40000 ALTER TABLE `dischargepatient_room` ENABLE KEYS */;


--
-- Definition of table `dischargepatient_ward`
--

DROP TABLE IF EXISTS `dischargepatient_ward`;
CREATE TABLE `dischargepatient_ward` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `AdmitID` int(11) unsigned DEFAULT NULL,
  `DischargeDate` text,
  `DP_Remarks` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dischargepatient_ward`
--

/*!40000 ALTER TABLE `dischargepatient_ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `dischargepatient_ward` ENABLE KEYS */;


--
-- Definition of table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `DoctorID` varchar(50) NOT NULL DEFAULT '',
  `DoctorName` text,
  `Fathername` text,
  `Address` text,
  `ContactNo` text,
  `Email` text,
  `Qualifications` text,
  `Specialization` text,
  `Gender` text,
  `BloodGroup` text,
  `DateOfJoining` text,
  PRIMARY KEY (`DoctorID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` (`DoctorID`,`DoctorName`,`Fathername`,`Address`,`ContactNo`,`Email`,`Qualifications`,`Specialization`,`Gender`,`BloodGroup`,`DateOfJoining`) VALUES 
 ('1000','santosh singhal','anil','dsfsf','9074739352','gauravgargcs1991@gmail.com','mbbs','heart','M','B+','06/06/1998');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;


--
-- Definition of table `patientregistration`
--

DROP TABLE IF EXISTS `patientregistration`;
CREATE TABLE `patientregistration` (
  `PatientID` varchar(50) NOT NULL DEFAULT '',
  `Patientname` text,
  `Fathername` text,
  `Address` text,
  `ContactNo` text,
  `Email` text,
  `Age` int(11) unsigned DEFAULT NULL,
  `Gen` text,
  `BG` text,
  `Remarks` text,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patientregistration`
--

/*!40000 ALTER TABLE `patientregistration` DISABLE KEYS */;
INSERT INTO `patientregistration` (`PatientID`,`Patientname`,`Fathername`,`Address`,`ContactNo`,`Email`,`Age`,`Gen`,`BG`,`Remarks`) VALUES 
 ('20004','gaurav garg','anil garg','flat no. 2022','9074739352','gauravgargcs1991@gmail.com',23,'M','AB+','admitted for fever');
/*!40000 ALTER TABLE `patientregistration` ENABLE KEYS */;


--
-- Definition of table `registration`
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `username` varchar(45) NOT NULL DEFAULT '',
  `password` text,
  `NameOfUser` text,
  `ContactNo` text,
  `Email` text,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` (`username`,`password`,`NameOfUser`,`ContactNo`,`Email`) VALUES 
 ('gauravgargcs','24207853','gaurav garg','9074739352','gauravgargcs1991@gmail.com');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;


--
-- Definition of table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `RoomNo` varchar(50) NOT NULL DEFAULT '',
  `RoomType` text,
  `RoomCharges` int(11) unsigned DEFAULT NULL,
  `RoomStatus` text,
  PRIMARY KEY (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` (`RoomNo`,`RoomType`,`RoomCharges`,`RoomStatus`) VALUES 
 ('1','General',500,'Vacant'),
 ('2','General',500,'Vacant'),
 ('3','General',500,'Booked'),
 ('4','General',500,'Vacant'),
 ('5','General',500,'Vacant'),
 ('6','Deluxe',800,'Vacant'),
 ('7','Deluxe',800,'Vacant'),
 ('8','Deluxe',800,'Vacant');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;


--
-- Definition of table `services`
--

DROP TABLE IF EXISTS `services`;
CREATE TABLE `services` (
  `ServiceID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Servicename` text NOT NULL,
  `ServiceDate` text NOT NULL,
  `PatientID` varchar(50) NOT NULL,
  `ServiceCharges` int(11) unsigned NOT NULL,
  PRIMARY KEY (`ServiceID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--

/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` (`ServiceID`,`Servicename`,`ServiceDate`,`PatientID`,`ServiceCharges`) VALUES 
 (1,'fever','13/03/2014','20004',200);
/*!40000 ALTER TABLE `services` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(45) NOT NULL,
  `user_Password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`username`,`user_Password`) VALUES 
 ('gaurav','12345'),
 ('gauravgargcs','24207853');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;


--
-- Definition of table `ward`
--

DROP TABLE IF EXISTS `ward`;
CREATE TABLE `ward` (
  `wardname` varchar(50) NOT NULL DEFAULT '',
  `wardtype` text,
  `NoOfBeds` int(11) unsigned DEFAULT NULL,
  `Charges` int(11) unsigned NOT NULL,
  PRIMARY KEY (`wardname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ward`
--

/*!40000 ALTER TABLE `ward` DISABLE KEYS */;
INSERT INTO `ward` (`wardname`,`wardtype`,`NoOfBeds`,`Charges`) VALUES 
 ('10','General',10,300);
/*!40000 ALTER TABLE `ward` ENABLE KEYS */;


--
-- Definition of table `wardboy_nurse_tbl`
--

DROP TABLE IF EXISTS `wardboy_nurse_tbl`;
CREATE TABLE `wardboy_nurse_tbl` (
  `ID` varchar(50) NOT NULL DEFAULT '',
  `W_N_Name` text,
  `Category` text,
  `Address` text,
  `ContactNo` text,
  `Email` text,
  `Qualifications` text,
  `BloodGroup` text,
  `DateOfJoining` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wardboy_nurse_tbl`
--

/*!40000 ALTER TABLE `wardboy_nurse_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `wardboy_nurse_tbl` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
