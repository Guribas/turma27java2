 br.org.generation.blogpessoal.controller ;

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

import  br.org.generation.blogpessoal.model.Tema ;
import  br.org.generation.blogpessoal.repository.TemaRepository ;

@RestController
@RequestMapping ( " / temas " )
@CrossOrigin ( origins  =  " * " , allowedHeaders  =  " * " )
public  class  TemaController {
    
    @Autowired
	privado  TemaRepository temaRepository;

	@GetMapping
	p�blica  ResponseEntity < List < Tema > >  getAll () {
		retornar  ResponseEntity . ok (temaRepository . findAll ());
	
	}

	@GetMapping ( " / {id} " )
	public  ResponseEntity < Tema >  getById ( @PathVariable  long  id ) {
		retornar temaRepository . findById (id)
				.map (resp - >  ResponseEntity . ok (resp))
				.orElse ( ResponseEntity . notFound () . build ());
	}
	
	@GetMapping ( " / descricao / {descricao} " )
	p�blica  ResponseEntity < List < Tema > >  GetByDescricao ( @PathVariable  Cordas  descricao ) {
		retornar  ResponseEntity . ok (temaRepository . findAllByDescricaoContainingIgnoreCase (descricao));
	}
	
	@PostMapping
	p�blica  ResponseEntity < Tema >  p�s ( @RequestBody  Tema  tema ) {
		retornar  ResponseEntity . status ( HttpStatus . CREATED )
				.body (temaRepository . save (tema));
	}

	@PutMapping
	public  ResponseEntity < Tema >  put ( @RequestBody  Tema  tema ) {
		retornar  ResponseEntity . ok (temaRepository . salvar (tema));				
	}
	
	@DeleteMapping ( " / {id} " )
	public  void  delete ( @PathVariable  long  id ) {
		temaRepository . deleteById (id);
	}
	
}
