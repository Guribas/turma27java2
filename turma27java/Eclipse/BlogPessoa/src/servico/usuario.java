package  br.org.generation.blogpessoal.service ;

import  java.nio.charset.Charset ;
import  java.time.LocalDate ;
import  java.time.Period ;
import  java.util.Optional ;

import  org.apache.commons.codec.binary.Base64 ;
import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.http.HttpStatus ;
import  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder ;
import  org.springframework.stereotype.Service ;
import  org.springframework.web.server.ResponseStatusException ;

import  br.org.generation.blogpessoal.model.Usuario ;
import  br.org.generation.blogpessoal.model.UsuarioLogin ;
import  br.org.generation.blogpessoal.repository.UsuarioRepository ;

@Serviço
public  class  UsuarioService {

	@Autowired
	private  UsuarioRepository usuarioRepository;

	public  Opcional < Usuario > cadastrarUsuario ( Usuario  usuario ) {
		
		if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ())
			lance  novo  ResponseStatusException (
					HttpStatus . BAD_REQUEST , " Usuário Já Existe! " , Nulo );

		int idade =  Período . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
			
		se (idade <  18 )
			lance  novo  ResponseStatusException (
					HttpStatus . BAD_REQUEST , " Usuário menor de 18 anos " , nulo );
				
		Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();

		String senhaEncoder = codificador . encode (usuario . getSenha ());
		usuario . setSenha (senhaEncoder);

		return  Opcional . de (usuarioRepository . save (usuario));
	}

	public  Opcional < Usuario >  atualizarUsuario ( Usuario  usuario ) {
	
		if (usuarioRepository . findById (usuario . getId ()) . isPresent ()) {
		
			Opcional < Usuario > buscaUsuario = usuarioRepository . findByUsuario (usuario . getUsuario ());
			
			if (buscaUsuario . isPresent ()) {

				if (buscaUsuario . get () . getId () ! = usuario . getId ())
					lance  novo  ResponseStatusException (
						HttpStatus . BAD_REQUEST , " Usuário Já Existe! " , Nulo );
			}

			int idade =  Período . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
			
			se (idade <  18 )
				lance  novo  ResponseStatusException (
						HttpStatus . BAD_REQUEST , " Usuário menor de 18 anos " , nulo );
			
			Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
			
			String senhaEncoder = codificador . encode (usuario . getSenha ());
			usuario . setSenha (senhaEncoder);
			
			return  Opcional . de (usuarioRepository . save (usuario));
		
		} else {
			
			lance  novo  ResponseStatusException (
					HttpStatus . NOT_FOUND , " Usuário não encontrado! " , Null );
			
		}
		
	}
	
	public  Opcional < UsuarioLogin >  Logar ( Opcional < UsuarioLogin >  usuarioLogin ) {

		Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
		Opcional < Usuario > usuario = usuarioRepository . findByUsuario (usuarioLogin . get () . getUsuario ());

		if (usuario . isPresent ()) {
			
			if (codificador . corresponde (usuarioLogin . get () . getSenha (), usuario . get () . getSenha ())) {

				String auth = usuarioLogin . get () . getUsuario () +  " : "  + usuarioLogin . get () . getSenha ();
				byte [] encodedAuth =  Base64 . encodeBase64 (auth . getBytes ( Charset . forName ( " US-ASCII " )));
				String authHeader =  " Básico "  +  nova  String (encodedAuth);

				usuarioLogin . get () . setId (usuario . get () . getId ());
				usuarioLogin . get () . setNome (usuario . get () . getNome ());
				usuarioLogin . get () . setSenha (usuario . get () . getSenha ());
				usuarioLogin . get () . setToken (authHeader);
				return usuarioLogin;

			}
		}
		
		lance  novo  ResponseStatusException (
				HttpStatus . NÃO AUTORIZADO , " Usuário ou senha inválidos! " , Nulo );
		
	}

}
