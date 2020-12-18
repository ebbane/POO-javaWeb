-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 18 déc. 2020 à 13:40
-- Version du serveur :  8.0.21
-- Version de PHP : 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `java`
--

-- --------------------------------------------------------

--
-- Structure de la table `annonce`
--

DROP TABLE IF EXISTS `annonce`;
CREATE TABLE IF NOT EXISTS `annonce` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) NOT NULL,
  `description` varchar(1500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `prix` int NOT NULL,
  `nb_chambres` int NOT NULL,
  `nb_voyageurs` int NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `ville` varchar(500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `image` varchar(1500) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `type` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `annonce`
--

INSERT INTO `annonce` (`id`, `titre`, `description`, `prix`, `nb_chambres`, `nb_voyageurs`, `adresse`, `ville`, `image`, `type`) VALUES
(14, 'Nouveau!! Canut entièrement rénové', 'Appartement complétement rénové avec les murs en pierre, les plafond typiquement lyonnais, une cuisine équipé ouverte sur la salon, une grande salle d\'eau, une chambre en mezzanine. il est exposé plein sud lui donnant une ambiance chaleureuse et lumineuse.\r\nAu centre du \"village\" Croix-Rousse, à 1 mn du métro tout comme de nombreux commerces en tout genres et ses nombreuses activités tout au long de l\'année (hors période covid!!!).\r\nLogement : Tout neuf! Plein sud, lumineux, calme. Beaucoup de cachet et authenticité avec ses pierres et ses poutres. Tout est fait pour que votre séjour se passe merveilleusement bien : cuisine entièrement équipée avec le nécessaire pour les petits déjeuner, Toute le literie est fournies, serviettes de bain draps, coussins, couettes.\r\nEnjoy !', 35, 1, 4, '99, rue des Dunes 69005 Lyon', 'Lyon', 'https://cdn.pixabay.com/photo/2016/11/30/08/48/bedroom-1872196__480.jpg', 'Logement entier'),
(15, 'BMYB Bellecour Lyon', 'T2 dans Lyon 7eme\r\nProche place Bellecour ( 10 min à pieds ) et a une station de métro\r\nCouchage 2 personnes ( lit double )\r\nWifi\r\nDigicode 1er étage sans ascenseur\r\nArrivée autonome ( boîtier a clefs sécurisé )\r\n\r\nLe logement\r\nAppartement 2 personnes maximum\r\nLit double dans la chambre\r\nPas de possibilité de dormir sur les canapés du salon\r\n\r\nAutres remarques\r\nTout est a disposition dans l\'appartement lors de votre séjour.', 54, 2, 3, ' 23 Allée Adrienne-Lecouvreur, 69007 LYON', 'Lyon', 'https://cdn.pixabay.com/photo/2017/03/28/12/11/chairs-2181960__480.jpg', 'Logement entier'),
(16, 'Grande chambre dans une colocation', 'Coucou ! Pendant l\'été, nous avons une chambre de libre dans notre colocation, on la met donc à disposition. On est deux étudiants en informatique, et un migrant guinéen, tous assez sympa !\r\n\r\nOn peut partager certains repas, vous donner des conseils sur quoi visiter, ou bien vous laisser tranquille selon ce que vous préférez.\r\n\r\nLe logement\r\nOn a une balconière assez chouette, avec plein de petites plantes qui attendent de fleurir, et une vue sur la basilique de Fourrière depuis ce balcon. On a des plaques vitrocéramique, four, frigo, congel, et aussi une machine à laver si besoin.\r\n\r\nAccès des voyageurs\r\nVous aurez accès à la chambre, au salon, la cuisine, le balcon. Bref, à toutes les parties auxquelles chacun de nous a aussi accès. Possibilité de stationner facilement en bas de l\'appartement.', 12, 1, 2, '13 Allée André-Breton 69005, LYON', 'Lyon', 'https://cdn.pixabay.com/photo/2017/03/28/12/10/chairs-2181947__480.jpg', 'Chambre privée'),
(17, 'Bel appartement lumineux LYON 02 Confluence', 'Situé dans le beau quartier de la Confluence,profitez d\'un T1 Bis au centre de Lyon.\r\nA 5min de Perrache, 15 min de la Part-Dieu et toutes commodités aux alentours(Patinoire de Lyon, Centre commercial de la Confluence,musée du Confluence etc...)\r\nJe laisse mon appartement car je serai en Vacances en Aout SEPTEMBRE\r\nPS: MA VOITURE AUSSI EST DISO AU CAS OÙ. A DISCUTER', 89, 3, 6, '45 Allée Célestin Hennion 69008 LYON', 'Lyon', 'https://cdn.pixabay.com/photo/2017/03/19/01/43/living-room-2155376__480.jpg', 'Appartement en résidence entier'),
(18, 'Bail mobilité. Charmant studio donnant sur cour', 'Studio loué sous le régime du bail mobilité (étudiant, salarié en formation professionnelle ou mission temporaire...), loué pour un minimum d\'un mois.\r\nMon studio est situé sur cour dans une petite maison au calme.\r\nDe dimension modeste, il reste toutefois très fonctionnel. Vous disposez d\'une cuisine équipée d\'un réfrigérateur avec partie freezer, d\'une plaque à induction et d\'un four.\r\nLe couchage se fait en mezzanine.\r\nLe linge de maison est fourni et changé régulièrement.\r\nLe ménage est compris.\r\n', 56, 2, 3, '12 Avenue de l\'Abattoir 69004, LYON', 'Lyon', 'https://cdn.pixabay.com/photo/2015/04/20/06/46/office-730681__480.jpg', 'Logement entier'),
(19, 'Canapé-lit confortable dans un grand salon calme', 'À propos de ce logement\r\nNous sommes un jeune couple souhaitant accueillir et rencontrer régulièrement de nouvelles personnes :)\r\n\r\nNous offrons à la location chaque nuit le canapé-lit confortable de notre grand salon.\r\n\r\nBienvenue !\r\n\r\nNotre appartement est calme et bordé de verdure, au rez-de-chaussée d\'une petite copropriété à proximité de la ligne de tram T6 et des bus C12, 34 et 35.\r\nEn transports en commun vous serez à 22 minutes de Bellecour, 21 minutes de la gare Perrache, et 28 minutes de la gare Part-Dieu.', 22, 1, 2, '34 Rue de l\'Abbé-Papon 69009, LYON', 'Lyon', 'https://cdn.pixabay.com/photo/2014/07/10/17/17/bedroom-389254__480.jpg', 'Chambre privée');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
