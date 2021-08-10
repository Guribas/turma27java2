package  br.org.generation.blogpessoal.repository ;

import  java.util.List ;
import  java.util.Optional ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  br.org.generation.blogpessoal.model.Usuario ;

@Reposit�rio
 interface  p�blica UsuarioRepository  extends  JpaRepository < Usuario , Long > {
	
	public  Opcional < Usuario > findByUsuario ( String  usuario );
	
	 Lista p�blica < Usuario > findAllByNomeContainingIgnoreCase ( String  nome );
	
	public  Usuario  findByNome ( String  nome );
	
}
