-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Gazdă: 127.0.0.1
-- Timp de generare: ian. 03, 2022 la 06:41 PM
-- Versiune server: 10.4.18-MariaDB
-- Versiune PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Bază de date: `logindb`
--

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `adrese`
--

CREATE TABLE `adrese` (
  `id` int(255) NOT NULL,
  `nume` varchar(255) NOT NULL,
  `telefon` varchar(255) NOT NULL,
  `adresa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `adrese`
--

INSERT INTO `adrese` (`id`, `nume`, `telefon`, `adresa`) VALUES
(2, 'Mihnea', '0742133212', 'Bd Dacia nr 17 , bloc U3 , ap 34'),
(3, 'Mihai', '0761202112', 'Str Cerbului nr 10 , bloc X1, ap 45'),
(4, 'Florin ', '0743967891', 'Bld Decebal nr 9, bloc K3 , ap 72');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `loginusers`
--

CREATE TABLE `loginusers` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `loginusers`
--

INSERT INTO `loginusers` (`id`, `username`, `password`) VALUES
(1, 'ghincea', '1234'),
(2, 'dinga', 'apartament');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `meniu`
--

CREATE TABLE `meniu` (
  `id` int(255) NOT NULL,
  `nume` varchar(255) NOT NULL,
  `pret` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `meniu`
--

INSERT INTO `meniu` (`id`, `nume`, `pret`) VALUES
(1, 'Pepsi', 6),
(2, 'Coca-Cola', 6),
(3, 'Sprite', 6),
(4, 'Fanta', 6),
(5, 'Cafea', 7),
(6, 'Ceai', 7),
(7, 'Ciocolata calda', 12),
(8, 'Timisoreana', 7),
(9, 'Ciorba de burta', 16),
(10, 'Ciorba de fasole', 15),
(11, 'Pizza Diavolo', 28),
(12, 'Pizza Canibal', 30),
(13, 'Pizza Casei', 33),
(14, 'Paste Carbonara', 23),
(15, 'Papanasi', 19);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `mese`
--

CREATE TABLE `mese` (
  `id` int(255) NOT NULL,
  `nume` varchar(255) NOT NULL,
  `telefon` varchar(255) NOT NULL,
  `data` varchar(255) NOT NULL,
  `ora` varchar(255) NOT NULL,
  `nrmasa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `mese`
--

INSERT INTO `mese` (`id`, `nume`, `telefon`, `data`, `ora`, `nrmasa`) VALUES
(1, 'Dinga', '0742321332', '2022-01-05', '9:30', 'Nr1'),
(2, 'Lucian', '0723193128', '2022-01-06', '13:15', 'Nr4'),
(3, 'Paul', '0728381233', '2022-01-09', '18:00', 'Nr8');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `orders`
--

CREATE TABLE `orders` (
  `saleid` int(255) NOT NULL,
  `pret` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `orders`
--

INSERT INTO `orders` (`saleid`, `pret`) VALUES
(1, 5043),
(2, 636),
(3, 260),
(4, 1300);

--
-- Indexuri pentru tabele eliminate
--

--
-- Indexuri pentru tabele `adrese`
--
ALTER TABLE `adrese`
  ADD PRIMARY KEY (`id`);

--
-- Indexuri pentru tabele `loginusers`
--
ALTER TABLE `loginusers`
  ADD PRIMARY KEY (`id`);

--
-- Indexuri pentru tabele `meniu`
--
ALTER TABLE `meniu`
  ADD PRIMARY KEY (`id`);

--
-- Indexuri pentru tabele `mese`
--
ALTER TABLE `mese`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nrmasa` (`nrmasa`);

--
-- Indexuri pentru tabele `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`saleid`);

--
-- AUTO_INCREMENT pentru tabele eliminate
--

--
-- AUTO_INCREMENT pentru tabele `adrese`
--
ALTER TABLE `adrese`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pentru tabele `loginusers`
--
ALTER TABLE `loginusers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pentru tabele `meniu`
--
ALTER TABLE `meniu`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT pentru tabele `mese`
--
ALTER TABLE `mese`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pentru tabele `orders`
--
ALTER TABLE `orders`
  MODIFY `saleid` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
