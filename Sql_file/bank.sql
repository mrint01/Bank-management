-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 10 Mai 2020 à 05:31
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `bank`
--

-- --------------------------------------------------------

--
-- Structure de la table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_id` varchar(255) NOT NULL,
  `cust_id` varchar(255) NOT NULL,
  `acc_type` varchar(255) NOT NULL,
  `balance` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=54 ;

--
-- Contenu de la table `account`
--

INSERT INTO `account` (`id`, `acc_id`, `cust_id`, `acc_type`, `balance`) VALUES
(1, 'acc001', 'cust001', 'Personal', '860'),
(3, 'acc003', 'cust002', 'Saving', '1200'),
(2, 'acc002', 'cust001', 'Saving', '800'),
(53, 'acc004', 'cust003', 'Checking', '750');

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_uname` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`u_id`, `u_uname`, `u_password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Structure de la table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `street` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `phone` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=33 ;

--
-- Contenu de la table `customer`
--

INSERT INTO `customer` (`id`, `cust_id`, `first_name`, `last_name`, `street`, `city`, `phone`) VALUES
(1, 'cust001', 'hatem', 'sfar', '32 street montazahh', 'mourouj', '50427046'),
(27, 'cust002', 'amine', 'agrebi', '24 street fol', 'manouba', '95258965'),
(31, 'cust003', 'ahmed', 'sfar', '20 street mars', 'mourouj', '50427046');

-- --------------------------------------------------------

--
-- Structure de la table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `emp_id` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `street` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- Contenu de la table `employee`
--

INSERT INTO `employee` (`id`, `username`, `password`, `emp_id`, `first_name`, `last_name`, `street`, `city`, `phone`) VALUES
(12, 'user001', 'user1', 'emp001', 'ahmed', 'agrebi', '36 street fol', 'ben arous', '90969658'),
(13, 'user002', 'user2', 'emp002', 'abdelrazzek', 'mohamed', '20 street intissar', 'manouba', '24589658'),
(17, 'user003', 'user3', 'emp003', 'haykel', 'sfar', '32 street el khadhra', 'khadhra', '50258960'),
(18, 'user004', 'user4', 'emp004', 'mohamed', 'sfar', '23 street mohamed kames', 'centre tunis', '50258965');

-- --------------------------------------------------------

--
-- Structure de la table `operation`
--

CREATE TABLE IF NOT EXISTS `operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_emp` varchar(255) NOT NULL,
  `id_acc1` varchar(255) NOT NULL,
  `id_acc2` varchar(255) NOT NULL,
  `oper_type` varchar(255) NOT NULL,
  `balance` varchar(255) NOT NULL,
  `oper_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `operation`
--

INSERT INTO `operation` (`id`, `id_emp`, `id_acc1`, `id_acc2`, `oper_type`, `balance`, `oper_date`) VALUES
(1, 'emp001', 'acc002', '#', 'Deposit', '50', '2020-05-08'),
(12, 'emp002', 'acc002', 'acc004', 'Transfer', '200', '2020-05-10'),
(11, 'emp002', 'acc002', '#', 'Withdraw', '20', '2020-05-10'),
(6, 'emp004', 'acc003', '#', 'Deposit', '50', '2020-05-09'),
(7, 'emp001', 'acc001', '#', 'Withdraw', '7000', '2020-05-10'),
(13, 'emp001', 'acc002', '#', 'Deposit', '400', '2020-05-10'),
(14, 'emp003', 'acc002', '#', 'Withdraw', '400', '2020-05-10'),
(15, 'emp004', 'acc004', 'acc003', 'Transfer', '200', '2020-05-10'),
(16, 'emp001', 'acc004', '#', 'Withdraw', '50', '2020-05-10'),
(17, 'emp002', 'acc002', '#', 'Deposit', '200', '2020-05-10');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
