package  org.generation.blogPessoal.model ;

import  java.util.Date ;

import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.Table ;
import  javax.persistence.Temporal ;
import  javax.persistence.TemporalType ;
import  javax.validation.constraints.NotNull ;
import  javax.validation.constraints.Size ;

@Entidade

@Table ( name  =  " postagem " )

public  class  Postagem {
	
	@Identidade
	@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
	 id longo privado ;
	
	@Não nulo
	@Size ( min  =  5 , max  =  100 )
	particular  String titulo;
	
	@Não nulo
	@Size ( min  =  10 , max  =  500 )
	private  String texto;
	
	@Temporal ( TemporalType . TIMESTAMP )
	 data privada data =  novo  java.sql . Data ( System . CurrentTimeMillis ());
	public  long  getId () {
		return id;
	}
	public  void  setId ( long  id ) {
		isso . id = id;
	}
	public  String  getTitulo () {
		return titulo;
	}
	public  void  setTitulo ( String  titulo ) {
		isso . titulo = titulo;
	}
	public  String  getTexto () {
		return texto;
	}
	public  void  setTexto ( String  texto ) {
		isso . texto = texto;
	}
	public  Date  getDate () {
		data de retorno ;
	}
	public  void  setDate ( data  data ) {
		isso . data = data;
	}
	
	

}
