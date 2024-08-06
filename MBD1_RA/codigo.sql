CREATE DATABASE ANDRE;

CREATE TABLE `cenas` (
 `id_Cenas` Int(11) NOT NULL,
 `titulo` Varchar(300) DEFAULT NULL,
 `descricao` Varchar(300) DEFAULT NULL,
 `objetos` Varchar(100) DEFAULT NULL,
 PRIMARY KEY (`id_Cenas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

CREATE TABLE `objetos` (
 `id_Objetos` Int(11) NOT NULL,
 `obj_Nome` Varchar(100) DEFAULT NULL,
 `obj_Descricao` Varchar(300) DEFAULT NULL,
 `res_Negativo` Varchar(300) DEFAULT NULL,
 `res_Positiva` Varchar(300) DEFAULT NULL,
 `possivel_Leva` Tinyint(1) DEFAULT NULL,
 `comand_Positivo` Varchar(300) DEFAULT NULL,
 `pegar` Tinyint(1) DEFAULT NULL,
 `id_Cenas` Int(11) DEFAULT NULL,
 PRIMARY KEY (`id_Objetos`),
 KEY `id_Cenas` (`id_Cenas`),
 CONSTRAINT `objetos_ibfk_1` FOREIGN KEY (`id_Cenas`) REFERENCES `cenas` (`id_Cenas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci