package  br.org.generation.blogpessoal.security ;

import  java.util.Collection ;
import  java.util.List ;

import  org.springframework.security.core.GrantedAuthority ;
import  org.springframework.security.core.userdetails.UserDetails ;

import  br.org.generation.blogpessoal.model.Usuario ;

public  class  UserDetailsImpl  implementa  UserDetails {
	
	privado  estático  final  longo serialVersionUID =  1L ;

	private  String userName;
	 senha String privada ;
	 Autoridades da lista privada < GrantedAuthority > ;

	public  UserDetailsImpl ( Usuario  usuario ) {
		isso . userName = usuario . getUsuario ();
		isso . senha = usuario . getSenha ();		
	}

	public  UserDetailsImpl () {}

	@Sobrepor
	 Coleção  pública <? extends GrantedAuthority > getAuthorities () {
		autoridades de retorno ;
	}

	@Sobrepor
	public  String  getPassword () {
		senha de retorno ;
	}

	@Sobrepor
	public  String  getUsername () {

		return userName;
	}

	@Sobrepor
	public  boolean  isAccountNonExpired () {
		return  true ;
	}

	@Sobrepor
	public  boolean  isAccountNonLocked () {
		return  true ;
	}

	@Sobrepor
	public  boolean  isCredentialsNonExpired () {
		return  true ;
	}

	@Sobrepor
	public  boolean  isEnabled () {
		return  true ;
	}
} 
