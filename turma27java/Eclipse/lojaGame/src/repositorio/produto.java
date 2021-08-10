package  com.freitasdev.games.repository ;

import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.freitasdev.games.model.Produto ;


@Repositório
 interface  pública ProdutoRepository  estende  JpaRepository < Produto , Long > {
	
	// Lista pública <Produto> findAllPrecoContainingIgnoreCase (double preco);
}