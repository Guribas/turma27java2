package  com.freitasdev.games.controller ;

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

import  com.freitasdev.games.model.Categoria ;
import  com.freitasdev.games.repository.CategoriaRepository ;

@RestController
@RequestMapping ( " / categoria " )
@CrossOrigin ( " * " )
public  class  CotegoriaController {
	
	@Autowired
	privado  CategoriaRepository repositorio;
	
	@GetMapping ( " / all " )
	pública  ResponseEntity < List < Categoria > >  getAll () {
		retornar  ResponseEntity . ok (repositório . findAll ());
	}
	
	@GetMapping ( " / {id} " )
	public  ResponseEntity < Categoria >  getById ( @PathVariable  long  id ) {
		return repositorio . findById (id) . map (resposta - >  ResponseEntity . ok (resposta)) . orElse ( ResponseEntity . status ( HttpStatus . NOT_FOUND ) . build ());
	}

	@GetMapping ( " / tipo / {tipo} " )
	pública  ResponseEntity < List < Categoria > >  getByTipo ( @PathVariable  Cordas  tipo ) {
		retornar  ResponseEntity . ok (repositorio . findAllByTipoContainingIgnoreCase (tipo));
	}
	
	@PostMapping ( " / cadastro " )
	public  ResponseEntity < Categoria >  postCategoria ( @RequestBody  Categoria  categoria ) {
		retornar  ResponseEntity . status ( HttpStatus . CREATED ) . corpo (repositorio . salvar (categoria));
	}
	
	@PutMapping ( " / editar " )
	public  ResponseEntity < Categoria >  putCategoria ( @RequestBody  Categoria  categoria ) {
		retornar  ResponseEntity . status ( HttpStatus . OK ) . corpo (repositorio . salvar (categoria));
	}
	
	@DeleteMapping ( " / remove / {id} " )
	public  String  delete ( @PathVariable  long  id ) {
		repositorio . deleteById (id);
		retornar  " Deletado com sucesso " ;
	}
}
