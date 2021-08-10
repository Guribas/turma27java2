package  br.org.generation.blogpessoal.controller ;

import  java.util.List ;
import  java.util.Optional ;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.http.HttpStatus ;
import  org.springframework.http.ResponseEntity ;
import  org.springframework.web.bind.annotation.CrossOrigin ;
import  org.springframework.web.bind.annotation.GetMapping ;
import  org.springframework.web.bind.annotation.PathVariable ;
import  org.springframework.web.bind.annotation.PostMapping ;
import  org.springframework.web.bind.annotation.PutMapping ;
import  org.springframework.web.bind.annotation.RequestBody ;
import  org.springframework.web.bind.annotation.RequestMapping ;
import  org.springframework.web.bind.annotation.RestController ;

import  br.org.generation.blogpessoal.model.Usuario ;
import  br.org.generation.blogpessoal.model.UsuarioLogin ;
import  br.org.generation.blogpessoal.repository.UsuarioRepository ;
import  br.org.generation.blogpessoal.service.UsuarioService ;

@RestController
@RequestMapping ( " / usuarios " )
@CrossOrigin ( origins  =  " * " , allowedHeaders  =  " * " )
public  class  UsuarioController {

	@Autowired
	private  UsuarioRepository usuarioRepository;
	
	@Autowired
	private  UsuarioService usuarioService;

	@GetMapping ( " / all " )
	pública  ResponseEntity < List < Usuario > >  GetAll () {
		retornar  ResponseEntity . ok (usuarioRepository . findAll ());
	}

	@GetMapping ( " / {id} " )
	public  ResponseEntity < Usuario >  GetById ( @PathVariable  long  id ) {
		retornar usuarioRepository . findById (id) . map (resp - >  ResponseEntity . ok (resp))
				.orElse ( ResponseEntity . notFound () . build ());				
	}
	
	@PostMapping ( " / logar " )
	public  ResponseEntity < UsuarioLogin >  Autenticação ( @RequestBody  Opcional < UsuarioLogin >  usuarioLogin ) {
		
		retornar  usuarioService . Logar (usuarioLogin) . map (resp - >  ResponseEntity . ok (resp))
				.orElse ( ResponseEntity . status ( HttpStatus . UNAUTHORIZED ) . build ());
	
	}
	
	@PostMapping ( " / cadastrar " )
	pública  ResponseEntity < Opcional < Usuario > >  Publicar ( @RequestBody  Usuario  usuario ) {
		
		Opcional < Usuario > usuarioResp = usuarioService . cadastrarUsuario (usuario);
		tente {
			retornar  ResponseEntity . status ( HttpStatus . CREATED ) . corpo (usuarioResp);
		} catch ( Exceção e) {
			retornar  ResponseEntity . badRequest () . Construir();
		}
	}
		
	@PutMapping ( " / alterar " )
	public  ResponseEntity < Usuario >  Put ( @RequestBody  Usuario  usuario ) {
		Opcional < Usuario > usuarioUpdate = usuarioService . atualizarUsuario (usuario);
		tente {
			retornar  ResponseEntity . ok (usuarioUpdate . get ());
		} catch ( Exceção e) {
			retornar  ResponseEntity . badRequest () . Construir();
		}
	}

}
