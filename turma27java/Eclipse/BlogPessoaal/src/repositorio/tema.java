package  org.generation.blogPessoal.repository ;

import  java.util.List ;

import  org.generation.blogPessoal.model.Tema ;
import  org.springframework.data.jpa.repository.JpaRepository ;

 interface  p�blica TemaRepository  estende  JpaRepository < Tema , Long > {
	 Lista  p�blica < Tema > findAllByDescricaoContainingIgnoreCase ( String  descricao );

}
