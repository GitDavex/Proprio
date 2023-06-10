-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 10 juin 2023 à 16:28
-- Version du serveur : 8.0.31
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `proprio`
--
CREATE DATABASE IF NOT EXISTS `proprio` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `proprio`;

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

DROP TABLE IF EXISTS `adresse`;
CREATE TABLE IF NOT EXISTS `adresse` (
  `id_adresse` int NOT NULL AUTO_INCREMENT,
  `libellé` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `id_quartier` int NOT NULL,
  PRIMARY KEY (`id_adresse`),
  KEY `id_quartier` (`id_quartier`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `adresse`
--

INSERT INTO `adresse` (`id_adresse`, `libellé`, `id_quartier`) VALUES
(1, 'Rue des Acacias, Abo', 15),
(2, ' Avenue du Plateau, ', 17),
(3, 'Avenue de Niangon, Y', 21);

-- --------------------------------------------------------

--
-- Structure de la table `bien`
--

DROP TABLE IF EXISTS `bien`;
CREATE TABLE IF NOT EXISTS `bien` (
  `id_bien` int NOT NULL AUTO_INCREMENT,
  `libellé` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `id_proprio` int NOT NULL,
  PRIMARY KEY (`id_bien`),
  KEY `id_proprio` (`id_proprio`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `bien`
--

INSERT INTO `bien` (`id_bien`, `libellé`, `id_proprio`) VALUES
(1, 'bon ', 3),
(2, 'excellent', 1);

-- --------------------------------------------------------

--
-- Structure de la table `commune`
--

DROP TABLE IF EXISTS `commune`;
CREATE TABLE IF NOT EXISTS `commune` (
  `id_commune` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_commune`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `commune`
--

INSERT INTO `commune` (`id_commune`, `nom`) VALUES
(1, 'Abobo'),
(2, 'Adjamé'),
(3, 'Treichville'),
(4, 'Cocody'),
(5, 'Yopougon'),
(6, 'Koumassi'),
(7, 'Marcory'),
(8, 'Port-Bouët');

-- --------------------------------------------------------

--
-- Structure de la table `locataire`
--

DROP TABLE IF EXISTS `locataire`;
CREATE TABLE IF NOT EXISTS `locataire` (
  `num_piece` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  `nom` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `prenom` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `telephone` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`num_piece`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `locataire`
--

INSERT INTO `locataire` (`num_piece`, `nom`, `prenom`, `telephone`) VALUES
('CI123456789', 'KOFFI', 'JUDE', '0759376464'),
('CI123459876', 'KOUASSI', 'ESTHER', '1234545676'),
('CI23456543', 'SAGOE', 'CHRISTIAN', '32434565'),
('CI987654321', 'KONAN', 'DAVID', '0778564126');

-- --------------------------------------------------------

--
-- Structure de la table `location`
--

DROP TABLE IF EXISTS `location`;
CREATE TABLE IF NOT EXISTS `location` (
  `id_location` int NOT NULL AUTO_INCREMENT,
  `date_deb` date NOT NULL,
  `date_fin` date NOT NULL,
  `num_piece` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  `id_logement` int NOT NULL,
  PRIMARY KEY (`id_location`),
  KEY `num_piece` (`num_piece`),
  KEY `location_ibfk_1` (`id_logement`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `location`
--

INSERT INTO `location` (`id_location`, `date_deb`, `date_fin`, `num_piece`, `id_logement`) VALUES
(9, '2023-06-17', '2023-06-27', 'CI123456789', 1),
(10, '2023-06-05', '2023-06-30', 'CI987654321', 1),
(11, '2023-06-25', '2023-06-14', 'CI23456543', 2);

-- --------------------------------------------------------

--
-- Structure de la table `logement`
--

DROP TABLE IF EXISTS `logement`;
CREATE TABLE IF NOT EXISTS `logement` (
  `id_logement` int NOT NULL AUTO_INCREMENT,
  `loyer` int NOT NULL,
  `superficie` decimal(15,2) NOT NULL,
  `nb_pieces` int NOT NULL,
  `designation` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `id_bien` int NOT NULL,
  `id_type` int NOT NULL,
  `id_adresse` int NOT NULL,
  PRIMARY KEY (`id_logement`),
  UNIQUE KEY `id_adresse` (`id_adresse`),
  KEY `id_bien` (`id_bien`),
  KEY `id_type` (`id_type`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `logement`
--

INSERT INTO `logement` (`id_logement`, `loyer`, `superficie`, `nb_pieces`, `designation`, `id_bien`, `id_type`, `id_adresse`) VALUES
(1, 250000, '85.00', 7, '1', 2, 1, 2),
(2, 175000, '30.00', 1, '1', 1, 3, 3),
(6, 187655, '23.00', 4, '4', 2, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `proprietaire`
--

DROP TABLE IF EXISTS `proprietaire`;
CREATE TABLE IF NOT EXISTS `proprietaire` (
  `id_proprio` int NOT NULL AUTO_INCREMENT,
  `login` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `mot_de_passe` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_proprio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `proprietaire`
--

INSERT INTO `proprietaire` (`id_proprio`, `login`, `mot_de_passe`) VALUES
(1, 'jude', 'jude'),
(2, 'david', 'david'),
(3, 'esther', 'esther');

-- --------------------------------------------------------

--
-- Structure de la table `quartier`
--

DROP TABLE IF EXISTS `quartier`;
CREATE TABLE IF NOT EXISTS `quartier` (
  `id_quartier` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `id_commune` int NOT NULL,
  PRIMARY KEY (`id_quartier`),
  KEY `id_commune` (`id_commune`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `quartier`
--

INSERT INTO `quartier` (`id_quartier`, `nom`, `id_commune`) VALUES
(15, 'Abobo-Doumé', 1),
(16, 'Abobo-Gare', 1),
(17, 'Plateau', 2),
(18, 'Palmeraie', 3),
(19, 'Angré', 4),
(20, 'Riviera', 4),
(21, 'Niangon', 5),
(22, 'Wassakara', 5),
(23, 'Remblais', 6),
(24, 'Zone 3', 7),
(25, 'Zone 4', 7),
(26, 'Vridi', 8),
(27, 'Locodjoro', 8),
(30, 'idem', 8);

-- --------------------------------------------------------

--
-- Structure de la table `type_logement`
--

DROP TABLE IF EXISTS `type_logement`;
CREATE TABLE IF NOT EXISTS `type_logement` (
  `id_type` int NOT NULL AUTO_INCREMENT,
  `description` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `type_logement`
--

INSERT INTO `type_logement` (`id_type`, `description`) VALUES
(1, 'Appartement moderne en centre-ville'),
(2, 'Maison de ville traditionnelle'),
(3, 'Studio compact');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD CONSTRAINT `adresse_ibfk_1` FOREIGN KEY (`id_quartier`) REFERENCES `quartier` (`id_quartier`);

--
-- Contraintes pour la table `bien`
--
ALTER TABLE `bien`
  ADD CONSTRAINT `bien_ibfk_1` FOREIGN KEY (`id_proprio`) REFERENCES `proprietaire` (`id_proprio`);

--
-- Contraintes pour la table `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`id_logement`) REFERENCES `logement` (`id_logement`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `location_ibfk_2` FOREIGN KEY (`num_piece`) REFERENCES `locataire` (`num_piece`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `logement`
--
ALTER TABLE `logement`
  ADD CONSTRAINT `logement_ibfk_1` FOREIGN KEY (`id_bien`) REFERENCES `bien` (`id_bien`),
  ADD CONSTRAINT `logement_ibfk_2` FOREIGN KEY (`id_type`) REFERENCES `type_logement` (`id_type`),
  ADD CONSTRAINT `logement_ibfk_3` FOREIGN KEY (`id_adresse`) REFERENCES `adresse` (`id_adresse`);

--
-- Contraintes pour la table `quartier`
--
ALTER TABLE `quartier`
  ADD CONSTRAINT `quartier_ibfk_1` FOREIGN KEY (`id_commune`) REFERENCES `commune` (`id_commune`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
