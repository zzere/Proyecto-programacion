-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 30-04-2023 a las 18:33:06
-- Versión del servidor: 8.0.32-0ubuntu0.22.04.2
-- Versión de PHP: 8.1.2-1ubuntu2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_appRobos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaAdministrador`
--

CREATE TABLE `tablaAdministrador` (
  `id_administrador` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tablaAdministrador`
--

INSERT INTO `tablaAdministrador` (`id_administrador`, `nombre`, `apellido`, `correo`, `contraseña`) VALUES
(5, 'Juan', 'Barbosa', 'juan@hotmail.com', '1233');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaInformante`
--

CREATE TABLE `tablaInformante` (
  `id_informante` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `genero` bit(1) NOT NULL,
  `edad` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaRobos`
--

CREATE TABLE `tablaRobos` (
  `id_robo` int NOT NULL,
  `arma_utilizada` varchar(100) NOT NULL,
  `cantidad_involucrados` varchar(100) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `vehiculo` varchar(100) NOT NULL,
  `fecha_hora` datetime(6) NOT NULL,
  `lugar` varchar(200) NOT NULL,
  `modus_operandi` varchar(200) NOT NULL,
  `objetos_robados` varchar(300) NOT NULL,
  `id_informante` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tablaAdministrador`
--
ALTER TABLE `tablaAdministrador`
  ADD PRIMARY KEY (`id_administrador`);

--
-- Indices de la tabla `tablaInformante`
--
ALTER TABLE `tablaInformante`
  ADD PRIMARY KEY (`id_informante`);

--
-- Indices de la tabla `tablaRobos`
--
ALTER TABLE `tablaRobos`
  ADD PRIMARY KEY (`id_robo`),
  ADD KEY `id_informante` (`id_informante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tablaAdministrador`
--
ALTER TABLE `tablaAdministrador`
  MODIFY `id_administrador` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tablaInformante`
--
ALTER TABLE `tablaInformante`
  MODIFY `id_informante` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tablaRobos`
--
ALTER TABLE `tablaRobos`
  MODIFY `id_robo` int NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tablaRobos`
--
ALTER TABLE `tablaRobos`
  ADD CONSTRAINT `tablaRobos_ibfk_1` FOREIGN KEY (`id_informante`) REFERENCES `tablaInformante` (`id_informante`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
