package  br.org.generation.blogpessoal.repository ;

import  java.util.List ;
import  java.util.Optional ;

import  org.springframework.data.jpa.repository.JpaRepository ;
import  org.springframework.stereotype.Repository ;

import  br.org.generation.blogpessoal.model.Usuario ;

@Repositório
 interface  pública UsuarioRepository  extends  JpaRepository < Usuario , Long > {
	
	public  Opcional < Usuario > findByUsuario ( String  usuario );
	
	 Lista pública < Usuario > findAllByNomeContainingIgnoreCase ( String  nome );
	
	public  Usuario  findByNome ( String  nome );
	
}
