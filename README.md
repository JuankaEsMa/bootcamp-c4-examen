# bootcamp-c4-examen

## Crear docker container

docker run -d -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=root --mount src=mysql-db-data,dst=/var/lib/mysql mysql

##Entrar a workbench

Entrar al workbench y crear una conexión con el puerto 3306 el nombre que tu quieras y la contraseña y usuarios cómo "root"(sin commillas)

## crear base de datos sql con éstos comandos:

use examenC4;

drop table if exists mensaje;
drop table if exists usuario;
drop table if exists partida;
drop table if exists videojuego;



create table videojuego(
	id int auto_increment primary key,
    nombre varchar(200),
    img varchar(1000)
);
create table partida(
	id int auto_increment primary key,
    nombre varchar(200) unique,
    videojuego int,
    foreign key(videojuego) references videojuego(id)
);

create table usuario(
	id int auto_increment primary key,
    nombre varchar(200),
    apellido varchar(200),
    email varchar(200) unique,
    usuario_steam varchar(200),
    password varchar(200),
    partida int default null,
    foreign key(partida) references partida(id)
);

create table mensaje(
	id int auto_increment primary key,
	texto varchar(200),
    autor int,
    partida int default null,
    foreign key (autor) references usuario(id),
    foreign key (partida) references partida(id)
);

INSERT INTO videojuego (nombre, img) VALUES
('The Legend of Zelda: Breath of the Wild', 'zelda_image.jpg'),
('Red Dead Redemption 2', 'red_dead_image.jpg'),
('Fortnite', 'fortnite_image.jpg');

-- Inserting data into the partida table
INSERT INTO partida (nombre, videojuego) VALUES
('First Adventure', 1),
('Wild West Journey', 2),
('Battle Royale 1', 3);

-- Inserting data into the usuario table
INSERT INTO usuario (nombre, apellido, email, usuario_steam, password, partida) VALUES
('John', 'Doe', 'john.doe@email.com', 'john_steam', 'password123', 1),
('Alice', 'Smith', 'alice.smith@email.com', 'alice_steam', 'securepass', 3),
('Bob', 'Johnson', 'bob.johnson@email.com', 'bob_steam', 'bobspassword', NULL);

-- Inserting data into the mensaje table
INSERT INTO mensaje (texto, autor, partida) VALUES
('Hello, adventurers!', 1, 1),
('Anyone up for a duel?', 2, 2),
('Let the battle begin!', 3, 3);

