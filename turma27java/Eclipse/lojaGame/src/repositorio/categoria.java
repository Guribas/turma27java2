package  com.freitasdev.games.repository ;

import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  com.freitasdev.games.model.Categoria ;

@Repositório
 interface  pública CategoriaRepository  estende  JpaRepository < Categoria , Long > {

	Lista pública < Categoria > findAllByTipoContainingIgnoreCase ( String  tipo );
}
