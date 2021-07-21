use db_ecomerce;

create table tb_produtos(
id bigint (5) auto_increment,
    nome varchar (20),
    preco decimal (10,2),
    ativo boolean,
    categoria varchar (20),
    marca varchar (20),
	
    primary key (id)
);




insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("Celular", 1550,00, true, "Smartphone", "iphone");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("TV", 550,00, true, "Eletronico", "Panasonic");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("Celular", 2550,00, true, "Smartphone", "Motorola");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("Instrumento", 300,00, true, "Eletronico", "Comteporenea");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("cadeira GAMER", 1250,00, true, "Moveis", "XT racer");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("Microondas", 950,00, true, "Eletrodomestico", "Eletrolux");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("TV 5K", 3550,00, true, "Eletronico", "AOC");
insert into tb_produtos (nome, preco, ativo, categoria, marca) values ("Secador", 250,00, true, "Eletrodomestico", "TAIFF");

select * from tb_produtos

select * from tb_produtos where preco <500


 UPDATE `db_ecomerce`` tb_produtos` SET `preco` = '1990.00' ONDE (` id` = '1')




