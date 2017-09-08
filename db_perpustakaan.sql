-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 22, 2017 at 07:09 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `kode_anggota` varchar(6) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(6) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `kelas` varchar(15) NOT NULL,
  `no_hp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`kode_anggota`, `nama_anggota`, `jenis_kelamin`, `tempat_lahir`, `tgl_lahir`, `alamat`, `kelas`, `no_hp`) VALUES
('123123', 'Iqram', 'Wanita', 'pdg', '2017-01-01', '12323', 'Kelas 1', '123123'),
('123124', 'Iqram Anwar', 'Pria', 'Pandeglang', '1996-10-31', 'Jalan Gagak no 205Y sadang serang', 'Kelas 3 IPA', '08988671476'),
('123125', 'Saeful', 'Pria', 'Garut', '2017-12-13', 'Tubagus Ismail', 'Kelas 1', '123123');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `kode_buku` varchar(8) NOT NULL,
  `id_jenis_buku` int(11) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `tahun_terbit` int(11) NOT NULL,
  `jumlah_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kode_buku`, `id_jenis_buku`, `nama_buku`, `pengarang`, `penerbit`, `tahun_terbit`, `jumlah_buku`) VALUES
('123123', 1, 'aw', 'aw', 'aw', 2017, 2),
('123124', 1, 'qwe', 'qwe', 'qwe', 2017, 4);

-- --------------------------------------------------------

--
-- Table structure for table `detail_peminjaman`
--

CREATE TABLE IF NOT EXISTS `detail_peminjaman` (
  `kode_buku` varchar(8) NOT NULL,
  `kode_peminjaman` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_peminjaman`
--

INSERT INTO `detail_peminjaman` (`kode_buku`, `kode_peminjaman`) VALUES
('123124', 'PJM/210117/0005'),
('123124', 'PJM/210117/0006'),
('123124', 'PJM/220117/0007');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_buku`
--

CREATE TABLE IF NOT EXISTS `jenis_buku` (
`id_jenis_buku` int(11) NOT NULL,
  `nama_jenis_buku` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `jenis_buku`
--

INSERT INTO `jenis_buku` (`id_jenis_buku`, `nama_jenis_buku`) VALUES
(1, 'Sejarah'),
(2, 'Fisika'),
(3, 'Biologi'),
(4, 'Kimia'),
(5, 'Matematika'),
(7, 'Ilmu Komputer');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE IF NOT EXISTS `pegawai` (
`id_pegawai` int(11) NOT NULL,
  `nama_pegawai` varchar(30) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` enum('Kepala Perpustakaan','Petugas Perpustakaan','','') NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `username`, `password`, `status`) VALUES
(1, 'Saeful Rahman', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Kepala Perpustakaan'),
(2, 'Iqram Anwar', 'iqram', '202cb962ac59075b964b07152d234b70', 'Petugas Perpustakaan'),
(4, 'Iqram Anwar', 'iqram31', '81dc9bdb52d04dc20036dbd8313ed055', 'Kepala Perpustakaan');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE IF NOT EXISTS `peminjaman` (
  `kode_peminjaman` varchar(15) NOT NULL,
  `kode_anggota` varchar(6) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_peminjaman` date NOT NULL,
  `status` enum('Pinjam','Kembali') NOT NULL DEFAULT 'Pinjam'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`kode_peminjaman`, `kode_anggota`, `id_pegawai`, `tgl_peminjaman`, `status`) VALUES
('PJM/210117/0005', '123124', 1, '2017-01-21', 'Pinjam'),
('PJM/210117/0006', '123124', 1, '2017-01-21', 'Pinjam'),
('PJM/220117/0007', '123123', 1, '2017-01-22', 'Pinjam');

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE IF NOT EXISTS `pengembalian` (
  `kode_pengembalian` varchar(15) NOT NULL,
  `kode_peminjaman` varchar(15) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_kembali` date NOT NULL,
  `denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
 ADD PRIMARY KEY (`kode_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
 ADD PRIMARY KEY (`kode_buku`), ADD KEY `id_jenis_buku` (`id_jenis_buku`);

--
-- Indexes for table `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
 ADD KEY `kode_buku` (`kode_buku`), ADD KEY `kode_peminjaman` (`kode_peminjaman`);

--
-- Indexes for table `jenis_buku`
--
ALTER TABLE `jenis_buku`
 ADD PRIMARY KEY (`id_jenis_buku`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
 ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
 ADD PRIMARY KEY (`kode_peminjaman`), ADD KEY `id_anggota` (`kode_anggota`), ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
 ADD PRIMARY KEY (`kode_pengembalian`), ADD KEY `kode_peminjaman` (`kode_peminjaman`), ADD KEY `id_pegawai` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenis_buku`
--
ALTER TABLE `jenis_buku`
MODIFY `id_jenis_buku` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
MODIFY `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`id_jenis_buku`) REFERENCES `jenis_buku` (`id_jenis_buku`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
ADD CONSTRAINT `detail_peminjaman_ibfk_1` FOREIGN KEY (`kode_buku`) REFERENCES `buku` (`kode_buku`),
ADD CONSTRAINT `detail_peminjaman_ibfk_2` FOREIGN KEY (`kode_peminjaman`) REFERENCES `peminjaman` (`kode_peminjaman`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`),
ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`kode_anggota`) REFERENCES `anggota` (`kode_anggota`);

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`kode_peminjaman`) REFERENCES `peminjaman` (`kode_peminjaman`),
ADD CONSTRAINT `pengembalian_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
