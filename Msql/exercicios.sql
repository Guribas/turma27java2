use db_escola;



create table tb_aluno (
id bigint (5) auto_increment,
nome varchar (20),
idade bigint (5),
turma bigint (5),
nota decimal (10,2),
aitvo boolean,

 primary key (id)


);

insert into tb_aluno (nome, idade, turma, nota, aitvo) values ("Deise", 31, 10, 8.5, true);
insert into tb_aluno (nome, idade, turma, nota, aitvo) values ("Luciano", 21,2,6.5, true);
insert into tb_aluno (nome, idade, turma, nota, aitvo) values ("Gustavo", 41,3, 9,3, true);
insert into tb_aluno (nome, idade, turma, nota, aitvo) values ("Aline", 37, 1, 8.1, true);
insert into tb_aluno (nome, idade, turma, nota, aitvo) values ("Nath", 28, 1, 6.5, true);
