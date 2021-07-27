criar banco de dados db_farmacia_do_bem

use db_farmacia_do_bem


criar tabela tb_categoria (
   id bigint auto_increment,
  tipo varchar (15),
  marca varchar (15),
  ativo booleano,
   
   chave primária (id)
   
);

inserir em tb_categoria (tipo, marca, ativo) valores ("remedio", "neo-quimica", true);
inserir em tb_categoria (tipo, marca, ativo) valores ("cosmetico", "lux-color", true); 
inserir nos valores tb_categoria (tipo, marca, ativo) ("higiene", "colgate", verdadeiro);
inserir em tb_categoria (tipo, marca, ativo) valores ("perfumaria", "Dove", true);
inserir em tb_categoria (tipo, marca, ativo) valores ("saude-fisica", "nestle", true);

criar tabela tb_produto (
  id bigint auto_increment,
  nome varchar (15),
  valor decimal (10,2),
  desconto booleano,
  receita boolean,
  disponivel boolean,
  
  categoria_id bigint,
  
  chave primária (id),
  referências de chave estrangeira (categoria_id) tb_categoria (id)
  
);

inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("dipirona", 8.50, falso, falso, verdadeiro, 1);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("tinta-cabelo", 15.50, verdadeiro, falso, verdadeiro, 2);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("creme-dental", 4,83, falso, falso, verdadeiro, 3);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("desodorante", 9,89, falso, falso, verdadeiro, 4);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("fibra-alim", 28,90, falso, falso, verdadeiro, 5);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("enxaguante-B", 15.90, falso, falso, verdadeiro, 3);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("clear-men", 18.90, false, false, true, 3);
inserir em tb_produto (nome, valor, desconto, receita, disponivel, categoria_id) valores ("bala-vita-c", 9,90, falso, falso, verdadeiro, 5);

selecione * de tb_produto onde valor> 50
selecione * de tb_produto onde valor> 3 e valor <60
selecione * de tb_produto onde nome como "% b%"

select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id onde tb_categoria.id = 2
