package  org.generation.blogPessoal.controller ;

import  java.util.List ;

import  org.generation.blogPessoal.model.Tema ;
import  org.generation.blogPessoal.repository.TemaRepository ;
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
@CrossOrigin ( origins  =  " * " , allowedHeaders  =  " * " )
@RequestMapping ( " / tema " )
public  class  TemaController {
	
	@Autowired
	 reposit�rio TemaRepository privado ;
	
	@GetMapping
	p�blica  ResponseEntity < List < Tema > >  getAll () {
		retornar  ResponseEntity . ok (reposit�rio . findAll ());
	}
	@GetMapping ( " / {id} " )
	public  ResponseEntity < Tema >  getById ( @PathVariable  long  id ) {
		reposit�rio de retorno . findById (id) . map (resp - >  ResponseEntity . ok (resp)) . orElse ( ResponseEntity . notFound () . build ());
	}
	
	@GetMapping ( " / nome / {nome} " )
	p�blica  ResponseEntity < List < Tema > >  getByName ( @PathVariable  Cordas  nomo ) {
		retornar  ResponseEntity . ok (reposit�rio . findAllByDescricaoContainingIgnoreCase (nome));
	}
	
	@PostMapping
	p�blica  ResponseEntity < Tema >  p�s ( @RequestBody  Tema  tema ) {
		retornar  ResponseEntity . status ( HttpStatus . CREATED ) . corpo (reposit�rio . salvar (tema));
	}
	
	@PutMapping
	public  ResponseEntity < Tema >  put ( @RequestBody  Tema  tema ) {
		retornar  ResponseEntity . ok (reposit�rio . salvar (tema));
	}
	
	@DeleteMapping ( " / {id} " )
	public  void  delete ( @PathVariable  long  id ) {
		reposit�rio . deleteById (id);
	}
}
