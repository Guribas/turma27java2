criar banco de dados db_generation_game_online

use db_generation_game_online

criar tabela tb_classe (
    id bigint auto_increment,
	categoria varchar (20),
    dominio varchar (10),
    ativo booleano,
    

chave primária (id)
);

inserir em tb_classe (categoria, dominio, ativo) valores ("Lutador", "velocidade", verdadeiro);
inserir em tb_classe (categoria, dominio, ativo) valores ("monstro", "forca", verdadeiro);
inserir em tb_classe (categoria, dominio, ativo) valores ("mutante", "magia", true);
inserir em tb_classe (categoria, dominio, ativo) valores ("bailarino", "equilibrio", true);

select * from tb_classe;

criar tabela tb_personagem (
id bigint auto_increment,
nome varchar (15) não nulo,
poder int não nulo,
defesa int not null,
mundo varchar (15),
idade int,
classe_id bigint,
chave primária (id),
CHAVE ESTRANGEIRA (classe_id) REFERÊNCIAS tb_classe (id)
);

inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("homem de ferro", 1000,1400, "guerra civil", 40, 1);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("hulk", 750.800, "amazonas", 25, 2);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("monica", 3000,5000, "turma da monica", 77, 3);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("tarzan", 2100,1000, "floresta", 250, 4);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("frajola", 2000.3500, "desenho", 20, 5);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("robin-hood", 1250,1000, "reino-unido", 17, 2);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("simba", 350.700, "O reino", 30, 3);
inserir em tb_personagem (nome, poder, defesa, mundo, idade, classe_id) valores ("Naruto", 4000.350, "aldeia da folha", 18,5);



select * from tb_personagem where poder> 2000
selecione * de tb_personagem onde defesa> 1000 e defesa <2000
select * from tb_personagem onde nome como "% c%"

select * from tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.classe_id onde tb_classe.id
select * from tb_classe inner join tb_personagem on tb_classe.id = tb_personagem.classe_id onde tb_classe.id = 3package game;



