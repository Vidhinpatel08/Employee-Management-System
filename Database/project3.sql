-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2021 at 07:12 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project3`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) NOT NULL,
  `name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `sec_q` varchar(25) NOT NULL,
  `sec_ans` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `sec_ans`) VALUES
('vidhin123', 'vidhin', '123', 'Your NickName?', '123');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `emp_id` varchar(20) NOT NULL,
  `first` varchar(10) NOT NULL,
  `second` varchar(10) NOT NULL,
  `Date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`emp_id`, `first`, `second`, `Date`) VALUES
('101', 'Present', 'Present', 'Fri Sep 24 10:27:07 IST 2021');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `name` varchar(25) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `education` varchar(15) NOT NULL,
  `post` varchar(15) NOT NULL,
  `aadhar` varchar(12) NOT NULL,
  `emp_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`name`, `fname`, `age`, `dob`, `address`, `phone`, `email`, `education`, `post`, `aadhar`, `emp_id`) VALUES
('vidhinpatel', 'D', 20, '2021-09-23', 'malosan', 1236547891, 'v@v.com', 'B.tech', 'programer', '789654123654', 101),
('jeet', 'a', 20, '2002-05-15', 'visnagar', 1236547895, 'j@j.com', 'IT', 'hr', '456987123654', 102);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `id` int(10) NOT NULL,
  `hra` decimal(12,2) NOT NULL,
  `da` decimal(12,2) NOT NULL,
  `med` decimal(12,2) NOT NULL,
  `pf` decimal(12,2) NOT NULL,
  `basic_salary` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`id`, `hra`, `da`, `med`, `pf`, `basic_salary`) VALUES
(101, '1000.00', '1000.00', '1555.00', '1000.00', '10000.00'),
(102, '84584.00', '55468.00', '55.00', '5425.00', '5458.00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
