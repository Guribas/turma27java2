package  com.freitasdev.games.repository ;

import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.freitasdev.games.model.Categoria ;

@Reposit�rio
 interface  p�blica CategoriaRepository  estende  JpaRepository < Categoria , Long > {

	Lista p�blica < Categoria > findAllByTipoContainingIgnoreCase ( String  tipo );
}
