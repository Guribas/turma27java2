package  br.org.generation.blogpessoal.repository ;

import  java.util.List ;
import  java.util.Optional ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  br.org.generation.blogpessoal.model.Tema ;

@Reposit�rio
 interface  p�blica TemaRepository  estende  JpaRepository < Tema , Long > {
    
     Lista p�blica < Tema > findAllByDescricaoContainingIgnoreCase ( String  descricao );

    public  Opcional < Tema > findByDescricaoContainingIgnoreCase ( String  descricao );
    
    public  Tema  findByDescricao ( String  descricao );

}
