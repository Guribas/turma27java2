use db_rh_empresa;

create table tb_Funcionarios (
id bigint (5) auto_increment,
     idade bigint (5),
     salario decimal (10.2),
	 ativo boolean,
     nome varchar (20),
     cargo varchar (20),
     
     primary key (id)
);
insert into tb_Funcionarios (idade, salario, ativo, nome, cargo) values (22.4500,00, true, "Aline", "gerente");
insert into tb_Funcionarios (idade, salario, ativo, nome, cargo) values (22.2500,00, true, "Deise", "ajudante");
insert into tb_Funcionarios (idade, salario, ativo, nome, cargo) values (22.2500,00, true, "Luciano", "auxiliar");
insert into tb_Funcionarios (idade, salário, ativo, nome, carga) values (22.3500,00, true, "Nath", "conferente");
insert into tb_Funcionarios (idade, salário, ativo, nome, carga) values (22.5500,00, true, "Gustavo", "CEO");

select entre funcionarios where salário> 2.000;
select entre funcionarios where salário <2.000;

UPDATE `rh_empresa``funcionaries` SET` salario` = '4700' WHERE (`id` = '1');
