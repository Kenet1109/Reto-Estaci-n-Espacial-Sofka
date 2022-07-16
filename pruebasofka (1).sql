-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-07-2022 a las 00:33:41
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebasofka`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lanzadera`
--

CREATE TABLE `lanzadera` (
  `idlanza` int(11) NOT NULL,
  `tamaño` int(11) NOT NULL,
  `carga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lanzadera`
--

INSERT INTO `lanzadera` (`idlanza`, `tamaño`, `carga`) VALUES
(1, 100, 1200),
(2, 80, 1000),
(3, 60, 800);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nave`
--

CREATE TABLE `nave` (
  `id` int(11) NOT NULL,
  `idnotri` int(11) NOT NULL DEFAULT 0,
  `idtri` int(11) NOT NULL DEFAULT 0,
  `idlanza` int(11) NOT NULL DEFAULT 0,
  `nave` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `combustible` double NOT NULL,
  `peso` double NOT NULL,
  `empuje` double NOT NULL,
  `pais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nave`
--

INSERT INTO `nave` (`id`, `idnotri`, `idtri`, `idlanza`, `nave`, `nombre`, `combustible`, `peso`, `empuje`, `pais`) VALUES
(1, 0, 0, 1, 1, 'Saturn V', 1, 3400, 2800, 1),
(2, 0, 0, 2, 1, 'Soyuz', 5, 3200, 2200, 2),
(3, 0, 0, 3, 1, 'Larga Marga 3B', 5, 2500, 2000, 5),
(4, 4, 0, 0, 2, 'Soho', 2, 40, 0.6, 1),
(5, 5, 0, 0, 2, 'Luna I', 6, 35, 0.8, 2),
(6, 6, 0, 0, 2, 'ATV***', 2, 30, 0.89, 3),
(7, 0, 7, 0, 3, 'EEI', 1, 30000, 20, 3),
(8, 0, 8, 0, 3, 'Soyuz', 6, 20000, 15000, 2),
(9, 0, 9, 0, 3, 'Shenzou', 7, 20000, 12000, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notripuladas`
--

CREATE TABLE `notripuladas` (
  `idnotri` int(11) NOT NULL,
  `precisa` int(11) NOT NULL,
  `mision` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `notripuladas`
--

INSERT INTO `notripuladas` (`idnotri`, `precisa`, `mision`) VALUES
(4, 1, 3),
(5, 2, 4),
(6, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tripuladas`
--

CREATE TABLE `tripuladas` (
  `idtri` int(11) NOT NULL,
  `mision` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `orbita` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tripuladas`
--

INSERT INTO `tripuladas` (`idtri`, `mision`, `capacidad`, `orbita`) VALUES
(7, 1, 4, 3800),
(8, 2, 3, 3700),
(9, 3, 4, 4000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `lanzadera`
--
ALTER TABLE `lanzadera`
  ADD PRIMARY KEY (`idlanza`);

--
-- Indices de la tabla `nave`
--
ALTER TABLE `nave`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `notripuladas`
--
ALTER TABLE `notripuladas`
  ADD PRIMARY KEY (`idnotri`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
