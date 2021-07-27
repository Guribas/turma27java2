criar banco de dados db_pizzaria_legal

use db_pizzaria_legal

criar tabela tb_categoria (
	id bigint auto_increment,
    tipo varchar (15),
    tamanho varchar (15),
    disponivel boolean,
    
    chave primária (id)
    


inserir em tb_categoria (tipo, tamanho, disponivel) valores ("vegetariana", "medio", verdadeiro);
inserir em tb_categoria (tipo, tamanho, disponivel) valores ("doce", "medio", true);
inserir em tb_categoria (tipo, tamanho, disponivel) valores ("salgado", "medio", true);
inserir em tb_categoria (tipo, tamanho, disponivel) valores ("mista", "medio", true);



criar tabela tb_pizza (
   id bigint auto_increment,
   nome varchar (15),
   valor int,
   borda boolean,
   sabor varchar (15),
   comRefri boolean,
   categoria_id bigint,
   chave primária (id),
   
   referências de chave estrangeira (categoria_id) tb_categoria (id) 
   
   
   );

inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("frango", 23, verdadeiro, "catupiry", verdadeiro, 2);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("especial", 29, verdadeiro, "tudo", verdadeiro, 2);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("mussarela", 30, true, "mix de queijo", true, 3);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("chocolate", 29, verdadeiro, "morango", verdadeiro, 1);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("marguerita", 33, verdadeiro, "queijo vegano", verdadeiro, 4);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("calabresa", 28, verdadeiro, "calab-cebola", verdadeiro, 2);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("atum", 49, true, "atum solido", true, 2);
inserir em tb_pizza (nome, valor, borda, sabor, comRefri, categoria_id) valores ("muss-bufala", 55, verdadeiro, "tomate seco", verdadeiro, 5);

selecione * de tb_pizza onde valor> 45
selecione * de tb_pizza onde valor> 29 e valor <62
selecione * de tb_pizza onde nome como "% c%"
select * from tb_categoria inner join tb_pizza em tb_categoria.id = tb_pizza.categoria_id onde tb_categoria.id 
select * from tb_categoria inner join tb_pizza em tb_categoria.id = tb_pizza.categoria_id onde tb_categoria.id = 2
