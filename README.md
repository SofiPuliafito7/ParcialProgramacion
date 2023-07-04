CREATE TABLE parcial.cliente (id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(30) NOT NULL , apellido VARCHAR(30) NOT NULL , edad INT(4) NOT NULL , usuario VARCHAR(25) NOT NULL , password VARCHAR(25) NOT NULL , telefono VARCHAR(25) NOT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;

INSERT INTO cliente (id, nombre, apellido, edad, usuario, password, telefono) VALUES (null,"Sofia","Puliafito",23,"spuliafito","aaab135","261773390");

INSERT INTO cliente (id, nombre, apellido, telefono, email, password, telefono) VALUES (null,"Maria","Gomez",30,"mgomez","cccb246","261598643");


CREATE TABLE parcial.usuario (id BIGINT NOT NULL AUTO_INCREMENT , nombre VARCHAR(30) NOT NULL , apellido VARCHAR(30) NOT NULL , email VARCHAR(40) NOT NULL , password VARCHAR(25) NOT NULL , telefono VARCHAR(25) NOT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;

INSERT INTO usuario (id, nombre, apellido, telefono, email, password) VALUES (null,"Carlos","Perez","261348966","cp@gmail.com","cp1599");

INSERT INTO usuario (id, nombre, apellido, telefono, email, password) VALUES (null,"Mario","Gutierrez","261753488","mg@gmail.com","mg2103");