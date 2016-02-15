DROP DATABASE IF EXISTS origen ;
create database origen;
use origen;


create table persona
(
codigo_persona int not null primary key auto_increment,
nombre_persona varchar(100),
apellidos_persona varchar(100),
documento_persona varchar(11),
telefono_persona varchar(20),
celular_persona varchar(20),
direccion_persona varchar(100),
nacimiento_persona date
);
create table usuario 
(
codigo_usuario int not null primary key auto_increment,
usuario varchar(20),
password varchar(20),
codigo_persona int,
codigo_rol int
);
create table rol(
codigo_rol int not null primary key auto_increment,
descripcion varchar(100)
);
alter table usuario add foreign key (codigo_persona) references persona(codigo_persona);
alter table usuario add foreign key (codigo_rol) references rol(codigo_rol);


create table opcion
(codigo_opcion int not null primary key auto_increment,
 descripcion varchar(100),
 ruta varchar(100),
 codigo_rol int
 );

alter table opcion add foreign key (codigo_rol) references rol (codigo_rol);

create table cliente
(codigo_cliente int not null primary key auto_increment,
 razon_social varchar(200),
 nro_documento varchar(11),
 web varchar(100),
 direccion varchar(200),
 telefono varchar(12));

create table producto
(codigo_producto int not null primary key,
 descripcion varchar(100),
 precio decimal,
 stock int);