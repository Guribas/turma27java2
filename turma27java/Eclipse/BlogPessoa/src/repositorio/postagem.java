package  br.org.generation.blogpessoal.repository ;

import  java.util.List ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.data.jpa.repository.Query ;
import  org.springframework.data.repository.query.Param ;
import  org.springframework.stereotype.Repository ;
import  org.springframework.transaction.annotation.Transactional ;

import  br.org.generation.blogpessoal.model.Postagem ;

@Repositório
@Transactional ( readOnly  =  verdadeiro )
public  interface  PostagemRepository  extends  JpaRepository < Postagem , Long > {

	 Lista pública < Postagem > findAllByTituloContainingIgnoreCase ( String  titulo );
	
	@Query ( value  =  " selecione a contagem (tema_id) de tb_postagens onde tema_id =: id " , nativeQuery  =  true )
	public  int  countPosts2 ( @Param ( " id " ) id longo  );

}
