-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 29, 2017 at 06:56 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chess_tournament`
--

-- --------------------------------------------------------

--
-- Table structure for table `actual_tournament_sponsor`
--

CREATE TABLE `actual_tournament_sponsor` (
  `tournament_id` int(11) NOT NULL,
  `sponsor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `actual_tournament_sponsor`
--

INSERT INTO `actual_tournament_sponsor` (`tournament_id`, `sponsor_id`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `chess_clubs`
--

CREATE TABLE `chess_clubs` (
  `club_id` int(11) NOT NULL,
  `club_name` varchar(45) DEFAULT NULL,
  `club_address` varchar(100) DEFAULT NULL,
  `organizer_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `chess_clubs`
--

INSERT INTO `chess_clubs` (`club_id`, `club_name`, `club_address`, `organizer_id`) VALUES
(1, 'Liverpool', 'liverpool', 1),
(2, 'Arsenal', 'London', 2),
(3, 'Chelsea', 'London', 3),
(4, 'barca', 'esp', 1);

-- --------------------------------------------------------

--
-- Table structure for table `list_of_sponsor`
--

CREATE TABLE `list_of_sponsor` (
  `sponsor_id` int(11) NOT NULL,
  `sponsor_name` varchar(45) DEFAULT NULL,
  `sponsor_phone` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `list_of_sponsor`
--

INSERT INTO `list_of_sponsor` (`sponsor_id`, `sponsor_name`, `sponsor_phone`) VALUES
(1, 'Nike', '02134546'),
(2, 'Adidas', '2132132'),
(3, 'Puma', '13213245');

-- --------------------------------------------------------

--
-- Table structure for table `matches`
--

CREATE TABLE `matches` (
  `tournament_id` int(11) NOT NULL,
  `player_id_1` int(11) NOT NULL,
  `player_id_2` int(11) NOT NULL,
  `match_start_date` date NOT NULL,
  `result_code` int(11) DEFAULT NULL,
  `match_end_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE `players` (
  `player_id` int(11) NOT NULL,
  `club_id` int(11) NOT NULL,
  `ranking_code` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone_number` varchar(12) DEFAULT NULL,
  `email_address` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`player_id`, `club_id`, `ranking_code`, `name`, `address`, `phone_number`, `email_address`) VALUES
(1, 1, 1, 'Coutinho', 'Brazil', '02135456', 'a@gmail'),
(2, 2, 1, 'Ozil', 'Gremany', '02345566', 'b@gmail.com'),
(3, 3, 2, 'Hazard', 'Belgium', '02324', 'c@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `player_tournament_participation`
--

CREATE TABLE `player_tournament_participation` (
  `player_id` int(11) NOT NULL,
  `tournament_id` int(11) NOT NULL,
  `final_result` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `player_tournament_participation`
--

INSERT INTO `player_tournament_participation` (`player_id`, `tournament_id`, `final_result`) VALUES
(1, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ref_ranking_codes`
--

CREATE TABLE `ref_ranking_codes` (
  `ranking_code` int(11) NOT NULL,
  `ranking_description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ref_ranking_codes`
--

INSERT INTO `ref_ranking_codes` (`ranking_code`, `ranking_description`) VALUES
(1, 'number1'),
(2, 'number2');

-- --------------------------------------------------------

--
-- Table structure for table `ref_result_codes`
--

CREATE TABLE `ref_result_codes` (
  `result_code` int(11) NOT NULL,
  `result_description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ref_result_codes`
--

INSERT INTO `ref_result_codes` (`result_code`, `result_description`) VALUES
(1, 'Player 1 win'),
(2, 'Player 2 win');

-- --------------------------------------------------------

--
-- Table structure for table `tournament`
--

CREATE TABLE `tournament` (
  `tournament_id` int(11) NOT NULL,
  `organizer_id` int(11) NOT NULL,
  `tournament_start_date` date DEFAULT NULL,
  `tournamtent_end_date` date DEFAULT NULL,
  `tournament_name` varchar(100) DEFAULT NULL,
  `tournament_details` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tournament`
--

INSERT INTO `tournament` (`tournament_id`, `organizer_id`, `tournament_start_date`, `tournamtent_end_date`, `tournament_name`, `tournament_details`) VALUES
(1, 1, '2017-12-12', '2017-12-21', 'England Primiere League', 'Detail');

-- --------------------------------------------------------

--
-- Table structure for table `tournament_organizers`
--

CREATE TABLE `tournament_organizers` (
  `organizer_id` int(11) NOT NULL,
  `club_id` int(11) DEFAULT NULL,
  `organizer_name` varchar(45) DEFAULT NULL,
  `organizer_details` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tournament_organizers`
--

INSERT INTO `tournament_organizers` (`organizer_id`, `club_id`, `organizer_name`, `organizer_details`) VALUES
(1, 1, 'Wenger', 'Richer'),
(2, 2, 'Klopp', 'Fatter'),
(3, NULL, 'Tour1', 'Tour detail'),
(4, NULL, 'Tour1', 'Tour detail'),
(5, NULL, 'Tour1', 'Tour detail'),
(6, NULL, 'Tour1', 'Tour detail'),
(7, NULL, 'Tour1', 'Tour detail');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `actual_tournament_sponsor`
--
ALTER TABLE `actual_tournament_sponsor`
  ADD PRIMARY KEY (`tournament_id`,`sponsor_id`),
  ADD KEY `fk_tour_sponsor_idx` (`sponsor_id`);

--
-- Indexes for table `chess_clubs`
--
ALTER TABLE `chess_clubs`
  ADD PRIMARY KEY (`club_id`),
  ADD KEY `organizer_id` (`organizer_id`);

--
-- Indexes for table `list_of_sponsor`
--
ALTER TABLE `list_of_sponsor`
  ADD PRIMARY KEY (`sponsor_id`);

--
-- Indexes for table `matches`
--
ALTER TABLE `matches`
  ADD PRIMARY KEY (`tournament_id`,`player_id_1`,`player_id_2`,`match_start_date`),
  ADD KEY `fk_resultcode_idx` (`result_code`),
  ADD KEY `fk_pl_1_idx` (`player_id_1`),
  ADD KEY `fk_pl_2_idx` (`player_id_2`);

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD PRIMARY KEY (`player_id`),
  ADD KEY `fk_1_idx` (`ranking_code`),
  ADD KEY `fk_2_idx` (`club_id`);

--
-- Indexes for table `player_tournament_participation`
--
ALTER TABLE `player_tournament_participation`
  ADD PRIMARY KEY (`player_id`,`tournament_id`),
  ADD KEY `fk_tour_player_idx` (`tournament_id`);

--
-- Indexes for table `ref_ranking_codes`
--
ALTER TABLE `ref_ranking_codes`
  ADD PRIMARY KEY (`ranking_code`);

--
-- Indexes for table `ref_result_codes`
--
ALTER TABLE `ref_result_codes`
  ADD PRIMARY KEY (`result_code`);

--
-- Indexes for table `tournament`
--
ALTER TABLE `tournament`
  ADD PRIMARY KEY (`tournament_id`,`organizer_id`),
  ADD KEY `fk_tourorganer_idx` (`organizer_id`);

--
-- Indexes for table `tournament_organizers`
--
ALTER TABLE `tournament_organizers`
  ADD PRIMARY KEY (`organizer_id`),
  ADD KEY `Fk1_idx` (`club_id`),
  ADD KEY `Fk1_idx1` (`club_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chess_clubs`
--
ALTER TABLE `chess_clubs`
  MODIFY `club_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `list_of_sponsor`
--
ALTER TABLE `list_of_sponsor`
  MODIFY `sponsor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `player_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ref_ranking_codes`
--
ALTER TABLE `ref_ranking_codes`
  MODIFY `ranking_code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ref_result_codes`
--
ALTER TABLE `ref_result_codes`
  MODIFY `result_code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tournament_organizers`
--
ALTER TABLE `tournament_organizers`
  MODIFY `organizer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `actual_tournament_sponsor`
--
ALTER TABLE `actual_tournament_sponsor`
  ADD CONSTRAINT `fk_sponsor_tour` FOREIGN KEY (`tournament_id`) REFERENCES `tournament` (`tournament_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tour_sponsor` FOREIGN KEY (`sponsor_id`) REFERENCES `list_of_sponsor` (`sponsor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `chess_clubs`
--
ALTER TABLE `chess_clubs`
  ADD CONSTRAINT `chess_clubs_ibfk_1` FOREIGN KEY (`organizer_id`) REFERENCES `tournament_organizers` (`organizer_id`);

--
-- Constraints for table `matches`
--
ALTER TABLE `matches`
  ADD CONSTRAINT `fk_pl_1` FOREIGN KEY (`player_id_1`) REFERENCES `players` (`player_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_pl_2` FOREIGN KEY (`player_id_2`) REFERENCES `players` (`player_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_resultcode` FOREIGN KEY (`result_code`) REFERENCES `ref_result_codes` (`result_code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tour_match` FOREIGN KEY (`tournament_id`) REFERENCES `tournament` (`tournament_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `players`
--
ALTER TABLE `players`
  ADD CONSTRAINT `fk_club` FOREIGN KEY (`club_id`) REFERENCES `chess_clubs` (`club_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ranking` FOREIGN KEY (`ranking_code`) REFERENCES `ref_ranking_codes` (`ranking_code`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `player_tournament_participation`
--
ALTER TABLE `player_tournament_participation`
  ADD CONSTRAINT `fk_player_tour` FOREIGN KEY (`player_id`) REFERENCES `players` (`player_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tour_player` FOREIGN KEY (`tournament_id`) REFERENCES `tournament` (`tournament_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tournament`
--
ALTER TABLE `tournament`
  ADD CONSTRAINT `tournament_ibfk_1` FOREIGN KEY (`organizer_id`) REFERENCES `tournament_organizers` (`organizer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
