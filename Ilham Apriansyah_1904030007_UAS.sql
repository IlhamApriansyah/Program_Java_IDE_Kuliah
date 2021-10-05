-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2021 at 05:12 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `1904030007_apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `KodeProduk` varchar(20) NOT NULL,
  `NamaProduk` varchar(20) NOT NULL,
  `Harga` int(30) NOT NULL,
  `Stock` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`KodeProduk`, `NamaProduk`, `Harga`, `Stock`) VALUES
('AP001', 'Inhaler', 150000, -30),
('AP002', 'Paramex', 10000, -5),
('AP003', 'Bodrex', 9000, 8),
('AP004', 'Antimo', 5000, 39);

-- --------------------------------------------------------

--
-- Table structure for table `sementara`
--

CREATE TABLE `sementara` (
  `KodeProduk` varchar(5) NOT NULL,
  `NamaProduk` varchar(20) NOT NULL,
  `Harga` double NOT NULL,
  `Qty` int(11) NOT NULL,
  `SubTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `NoTransaksi` varchar(20) NOT NULL,
  `Tanggal` date NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`NoTransaksi`, `Tanggal`, `Total`) VALUES
('AP001', '2021-07-15', 100000),
('AP002', '2021-07-15', 1650000),
('AP003', '2021-07-16', 75000),
('AP004', '2021-07-16', 50000),
('AP005', '2021-07-27', 3000000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `KodeUser` varchar(3) NOT NULL,
  `NamaUser` varchar(20) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `HakAkses` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`KodeUser`, `NamaUser`, `Password`, `HakAkses`) VALUES
('', '', '', 'Admin'),
('P01', 'Ilham', '123', 'Admin'),
('P02', 'April', '456', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`KodeProduk`);

--
-- Indexes for table `sementara`
--
ALTER TABLE `sementara`
  ADD UNIQUE KEY `KodeProduk` (`KodeProduk`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`NoTransaksi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`KodeUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
