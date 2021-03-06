package  org.generation.blogPessoal.controller ;

import  java.util.List ;

import  org.generation.blogPessoal.model.Postagem ;
import  org.generation.blogPessoal.repository.PostagemRepository ;
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

@RestController
@RequestMapping ( " / postagens " )
@CrossOrigin ( " * " )
public  class  PostagemController {

	@Autowired
	 repositório PostagemRepository privado ;
	
	@GetMapping
	pública  ResponseEntity < List < Postagem > >  GetAll () {
		retornar  ResponseEntity . ok (repositório . findAll ());
	}
	
	@GetMapping ( " / {id} " )
	public  ResponseEntity < Postagem >  GetById ( @PathVariable  long  id ) {
		repositório de retorno . findById (id) . map (resp - >  ResponseEntity . ok (resp)) . orElse ( ResponseEntity . notFound () . build ());
	}
	
	@GetMapping ( " / titulo / {titulo} " )
	pública  ResponseEntity < List < Postagem > >  GetByTitulo ( @PathVariable  Cordas  titulo ) {
		retornar  ResponseEntity . ok (repositório . findAllByTituloContainingIgnoreCase (titulo));
	}
	
	@PostMapping 
	public  ResponseEntity < Postagem >  post ( @RequestBody  Postagem  postagem ) {
		retornar  ResponseEntity . status ( HttpStatus . CREATED ) . corpo (repositório . salvar (postagem));
	}
	
	@PutMapping
	public  ResponseEntity < Postagem >  put ( @RequestBody  Postagem  postagem ) {
		retornar  ResponseEntity . status ( HttpStatus . OK ) . corpo (repositório . salvar (postagem));
	}
	
	@DeleteMapping ( " / {id} " )
	public  void  delete ( @PathVariable  long  id ) {
		repositório . deleteById (id);
	}
}
