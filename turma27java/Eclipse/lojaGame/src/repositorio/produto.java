package  com.freitasdev.games.repository ;

import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.freitasdev.games.model.Produto ;


@Reposit�rio
 interface  p�blica ProdutoRepository  estende  JpaRepository < Produto , Long > {
	
	// Lista p�blica <Produto> findAllPrecoContainingIgnoreCase (double preco);
}