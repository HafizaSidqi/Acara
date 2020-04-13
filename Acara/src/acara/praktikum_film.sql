-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Apr 2020 pada 17.17
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `praktikum_film`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `acara`
--

CREATE TABLE `acara` (
  `id_acara` int(11) NOT NULL,
  `judul_acara` varchar(50) NOT NULL,
  `tipe` varchar(10) NOT NULL,
  `episode` int(11) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `acara`
--

INSERT INTO `acara` (`id_acara`, `judul_acara`, `tipe`, `episode`, `genre`, `status`, `rating`) VALUES
(2, 'Spongebob', 'cartoon', 2000, 'komedi, anak-anak', 'Ongoing', 5),
(5, 'Frozen', 'film', 2, 'fantasi', 'Complete', 5),
(6, 'Running Man', 'tv', 500, 'Variety Show', 'Ongoing', 5),
(10, 'Healer', 'drama', 18, 'action', 'Complete', 4),
(12, 'Mission Impossible', 'film', 18, 'action', 'Ongoing', 5);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `acara`
--
ALTER TABLE `acara`
  ADD PRIMARY KEY (`id_acara`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `acara`
--
ALTER TABLE `acara`
  MODIFY `id_acara` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
