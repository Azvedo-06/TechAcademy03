create database game;

create table game.cenas (
	id_cena int not null primary key,
	descricao varchar(260)
);

create table game.itens (
	id_item int not null primary key,
	nome varchar(260),
	desricao_positiva varchar(250),
	desricao_negativa varchar(250),
	comndo_correto varchar(255),
	id_cena_atual int,
	id_cena_destino int,
	foreign key (id_cena_atual) references cenas(id_cena)
);