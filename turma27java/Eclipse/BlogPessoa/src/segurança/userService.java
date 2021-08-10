package  br.org.generation.blogpessoal.security ;

import  java.util.Optional ;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.security.core.userdetails.UserDetails ;
import  org.springframework.security.core.userdetails.UserDetailsService ;
import  org.springframework.security.core.userdetails.UsernameNotFoundException ;
import  org.springframework.stereotype.Service ;

import  br.org.generation.blogpessoal.model.Usuario ;
import  br.org.generation.blogpessoal.repository.UsuarioRepository ;


@Serviço
public  class  UserDetailsServiceImpl  implementa  UserDetailsService {

	@Autowired
	private  UsuarioRepository userRepository;

	@Sobrepor
	public  UserDetails  loadUserByUsername ( String  userName ) throws  UsernameNotFoundException {

		Opcional < Usuario > usuario = userRepository . findByUsuario (userName);
		usuario . orElseThrow (() - >  novo  UsernameNotFoundException (userName +  " não encontrado. " ));

		voltar usuario . map ( UserDetailsImpl :: new ) . obter();
	}
}
