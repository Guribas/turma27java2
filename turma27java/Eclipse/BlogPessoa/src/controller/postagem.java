package  br.org.generation.blogpessoal.controller ;

import  java.util.List ;

import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.http.HttpStatus ;
import  org.springframework.http.ResponseEntity ;
import  org.springframework.web.bind.annotation.CrossOrigin ;
import  org.springframework.web.bind.annotation.DeleteMapping ;
import  org.springframework.web.bind.annotation.GetMapping ;
import  org.springframework.web.bind.annotation.PathVariable ;
import  org.springframework.web.bind.annotation.PostMapping ;
import  org.springframework.web.bind.annotation.PutMapping ;
import  org.springframework.web.bind.annotation.RequestBody ;
import  org.springframework.web.bind.annotation.RequestMapping ;
import  org.springframework.web.bind.annotation.RestController ;

import  br.org.generation.blogpessoal.model.Postagem ;
import  br.org.generation.blogpessoal.repository.PostagemRepository ;

@RestController
@RequestMapping ( " / postagens " )
@CrossOrigin ( origins  =  " * " , allowedHeaders  =  " * " )
public  class  PostagemController {

	@Autowired
	 PostagemRepository postagemRepository privada ;

	@GetMapping
	pública  ResponseEntity < List < Postagem > >  GetAll () {
		retornar  ResponseEntity . ok (postagemRepository . findAll ());
	}

	@GetMapping ( " / {id} " )
	public  ResponseEntity < Postagem >  GetById ( @PathVariable  long  id ) {
		return postagemRepository . findById (id)
			.map (resp - >  ResponseEntity . ok (resp))
			.orElse ( ResponseEntity . notFound () . build ());
	}
	
	@GetMapping ( " / titulo / {titulo} " )
	pública  ResponseEntity < List < Postagem > >  getByTitulo ( @PathVariable  Cordas  titulo ) {
		retornar  ResponseEntity . ok (postagemRepository . findAllByTituloContainingIgnoreCase (titulo));
	}

	@PostMapping
	public  ResponseEntity < Postagem >  postPostagempostPostagem ( @RequestBody  Postagem  postagem ) {
		retornar  ResponseEntity . status ( HttpStatus . CREATED ) . body (postagemRepositório . salvar (postagem));
	}
	
	@PutMapping
	public  ResponseEntity < Postagem >  putPostagem ( @RequestBody  Postagem  postagem ) {
		retornar  ResponseEntity . status ( HttpStatus . OK ) . body (postagemRepositório . salvar (postagem));
	}
			
	@DeleteMapping ( " / {id} " )
	public  void  deletePostagem ( @PathVariable  long  id ) {
		postagemRepository . deleteById (id);

	}	
	
}
