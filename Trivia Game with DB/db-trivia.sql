-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-07-2023 a las 05:35:55
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db-trivia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE `category` (
  `category_id` bigint(20) NOT NULL,
  `description` text DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`category_id`, `description`, `name`) VALUES
(1, 'Preguntas relacionadas con programación, desarrollo de software y lenguajes de programación.', 'Programación'),
(2, 'Preguntas relacionadas con la música rock, bandas, artistas, álbumes y su historia.', 'Música Rock'),
(3, 'Preguntas relacionadas con videojuegos, curiosidades sobre estos, personajes y la industria de los videojuegos en general.', 'Videojuegos'),
(4, 'Preguntas relacionadas con países, capitales, continentes y características geográficas.', 'Geografía'),
(5, 'Preguntas relacionadas con el estudio de los seres vivos, sistemas biológicos y ecosistemas.', 'Biología'),
(6, 'Preguntas relacionadas con teoría de números, álgebra, geometría, cálculo y otras ramas de las matemáticas.', 'Matemáticas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `options`
--

CREATE TABLE `options` (
  `option_id` bigint(20) NOT NULL,
  `is_correct` tinyint(4) DEFAULT NULL,
  `option_text` varchar(255) DEFAULT NULL,
  `question_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `options`
--

INSERT INTO `options` (`option_id`, `is_correct`, `option_text`, `question_id`) VALUES
(1, 0, 'Nilo', 1),
(2, 0, 'Misisipi', 1),
(3, 1, 'Amazonas', 1),
(4, 0, 'Yangtsé', 1),
(5, 1, 'Queen', 2),
(6, 0, 'The Rolling Stones', 2),
(7, 0, 'AC/DC', 2),
(8, 0, 'Nirvana', 2),
(9, 0, 'Monte Kilimanjaro', 3),
(10, 0, 'Monte Aconcagua', 3),
(11, 1, 'Monte Everest', 3),
(12, 0, 'Monte Denali', 3),
(13, 1, 'Mitosis', 4),
(14, 0, 'Meiosis', 4),
(15, 0, 'Fotosíntesis', 4),
(16, 0, 'Reproducción asexual', 4),
(17, 1, 'Teorema de Pitágoras', 5),
(18, 0, 'Teorema de Euclides', 5),
(19, 0, 'Teorema de Fermat', 5),
(20, 0, 'Teorema de Arquímedes', 5),
(21, 1, 'Un concepto que permite que un objeto pueda presentarse en diferentes formas y comportarse de manera diferente según el contexto', 6),
(22, 0, 'U framework de Javascript para hacer páginas web más fácilmente', 6),
(23, 0, 'Un lenguaje de programación orientado a objetos', 6),
(24, 0, 'Un patrón de diseño utilizado en el desarrollo de interfaces gráficas', 6),
(25, 1, 'Un concepto que permite que una función se llame a sí misma', 7),
(26, 0, 'Una técnica para medir la eficiencia de un algoritmo', 7),
(27, 0, 'Un lenguaje de programación específico para algoritmos recursivos', 7),
(28, 0, 'Un patrón de diseño utilizado en el desarrollo de aplicaciones web', 7),
(29, 1, 'Fortnite', 8),
(30, 0, 'GTA V', 8),
(31, 0, 'FIFA 19', 8),
(32, 0, 'Call of Duty: Warzone', 8),
(33, 1, 'Fotosíntesis', 9),
(34, 0, 'Respiración', 9),
(35, 0, 'Digestión', 9),
(36, 0, 'Circulación', 9),
(37, 0, 'Europa', 10),
(38, 0, 'América', 10),
(39, 0, 'Asia', 10),
(40, 1, 'África', 10),
(41, 1, 'Super Mario Bros.', 11),
(42, 0, 'The Legend of Zelda: Breath of the Wild', 11),
(43, 0, 'Fortnite', 11),
(44, 0, 'Minecraft', 11),
(45, 1, 'Triángulo equilátero', 12),
(46, 0, 'Triángulo isósceles', 12),
(47, 0, 'Triángulo escaleno', 12),
(48, 0, 'Triángulo rectángulo', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `question`
--

CREATE TABLE `question` (
  `question_id` bigint(20) NOT NULL,
  `explanation` text DEFAULT NULL,
  `question_text` text DEFAULT NULL,
  `category_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `question`
--

INSERT INTO `question` (`question_id`, `explanation`, `question_text`, `category_id`) VALUES
(1, 'El río Amazonas es el río más largo y caudaloso del mundo. Ubicado en América del Sur, atraviesa varios países como Brasil, Perú y Colombia. Su biodiversidad única y su importancia para la región lo convierten en un hito geográfico destacado.', '¿Cuál es el río más largo y caudaloso del mundo?', 4),
(2, 'La banda británica Queen es conocida por su amplia influencia en el género del rock. Su vocalista, Freddie Mercury, fue un icono de la música y sus canciones, como \"Bohemian Rhapsody\" y \"We Will Rock You\", se han convertido en clásicos del rock.', '¿Cuál es la banda de rock conocida por su vocalista Freddie Mercury y canciones icónicas como \"Bohemian Rhapsody\"?', 2),
(3, 'El Everest es la montaña más alta del mundo y se encuentra en la cordillera del Himalaya, en la frontera entre Nepal y China (Tíbet).', '¿Cuál es la montaña más alta del mundo?', 4),
(4, 'La mitosis es el proceso de división celular en el cual una célula madre se divide en dos células hijas genéticamente idénticas. Es un proceso fundamental para el crecimiento, la reparación y la reproducción de los organismos.', '¿Qué proceso se refiere a la división celular en la cual una célula madre se divide en dos células hijas genéticamente idénticas?', 5),
(5, 'El teorema de Pitágoras establece que en un triángulo rectángulo, el cuadrado de la hipotenusa es igual a la suma de los cuadrados de los catetos', '¿Cuál es el nombre del teorema que establece la relación entre los lados de un triángulo rectángulo?', 6),
(6, 'El concepto de \"polimorfismo\" es fundamental en la programación orientada a objetos y permite que un objeto pueda presentarse en diferentes formas.', '¿Qué es el polimorfismo en programación orientada a objetos?', 1),
(7, 'La recursión es un concepto importante en programación que permite que una función se llame a sí misma. Se utiliza para resolver problemas que se pueden dividir en subproblemas más pequeños y se aplica en algoritmos como la búsqueda binaria y los algoritmos de ordenamiento.', '¿Qué es la recursión en programación?', 1),
(8, 'El género de los \"Battle Royale\" se ha vuelto muy popular en los últimos años. \"Fortnite\" es uno de los juegos más conocidos dentro de este género y ha alcanzado un gran éxito y una enorme base de jugadores.', '¿Cuál es uno de los juegos más populares del género \"Battle Royale\" conocido por su estilo de juego, gráficos coloridos y disponibilidad multiplataforma?', 3),
(9, 'Las plantas realizan la fotosíntesis para obtener energía. Durante este proceso, utilizan la luz del sol, dióxido de carbono y agua para producir glucosa y liberar oxígeno al ambiente.', '¿Qué proceso realizan las plantas para obtener energía?', 5),
(10, 'El continente africano es conocido por su rica diversidad cultural y su gran cantidad de animales salvajes', '¿Qué continente es conocido por su diversidad cultural y su gran cantidad de animales salvajes como el león y la jirafa?', 4),
(11, 'El juego \"Super Mario Bros.\" es un clásico de los videojuegos lanzado por primera vez en 1985. Fue desarrollado por Nintendo y se ha convertido en uno de los juegos más influyentes y exitosos de todos los tiempos.', '¿Cuál es uno de los juegos más influyentes y exitosos de todos los tiempos lanzado por Nintendo en 1985?', 3),
(12, 'Un triángulo equilátero es un tipo de triángulo en el cual todos los lados tienen la misma longitud', '¿Cómo se llama un triángulo en el cual todos los lados tienen la misma longitud?', 6);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Indices de la tabla `options`
--
ALTER TABLE `options`
  ADD PRIMARY KEY (`option_id`),
  ADD KEY `FKk821m563xwucpkx6ju8r3rkm4` (`question_id`);

--
-- Indices de la tabla `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`question_id`),
  ADD KEY `FK7jaqbm9p4prg7n91dd1uabrvj` (`category_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
  MODIFY `category_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `options`
--
ALTER TABLE `options`
  MODIFY `option_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de la tabla `question`
--
ALTER TABLE `question`
  MODIFY `question_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `options`
--
ALTER TABLE `options`
  ADD CONSTRAINT `FKk821m563xwucpkx6ju8r3rkm4` FOREIGN KEY (`question_id`) REFERENCES `question` (`question_id`);

--
-- Filtros para la tabla `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `FK7jaqbm9p4prg7n91dd1uabrvj` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
