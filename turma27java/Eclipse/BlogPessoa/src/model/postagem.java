package  br.org.generation.blogpessoal.model ;

import  java.util.Date ;

import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.ManyToOne ;
import  javax.persistence.Table ;
import  javax.persistence.Temporal ;
import  javax.persistence.TemporalType ;
import  javax.validation.constraints.NotNull ;
import  javax.validation.constraints.Size ;

import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;

@Entidade
@Table ( name  =  " tb_postagens " )
public  class  Postagem {

	@Identidade
	@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
	 id longo privado ;

	@NotNull ( message  =  " O atributo título é obrigatório " )
	@Size ( min  =  5 , max  =  100 , message  =  " O atributo deve conter no mínimo 05 e no máximo 100 caracteres " )
	particular  String titulo;

	@NotNull ( message  =  " O atributo texto é obrigatório " )
	@Size ( min  =  10 , max  =  500 , message  =  " O atributo texto deve conter no mínimo 10 e no máximo 500 caracteres " )
	private  String texto;

	@Temporal ( TemporalType . TIMESTAMP )
	 Dados de data privados =  novo  java.sql . Data ( System . CurrentTimeMillis ());
	
	@ManyToOne
	@JsonIgnoreProperties ( " postagem " )
	privada  Tema tema;
		
	@ManyToOne
	@JsonIgnoreProperties ( " postagem " )
	 Usuario usuario privado ;
	
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

	public  Date  getData () {
		dados de retorno ;
	}

	public  void  setData ( dados de data  ) {
		isso . dados = dados;
	}
	
	public  Tema  getTema () {
		tema de retorno ;
	}

	public  void  setTema ( Tema  tema ) {
		isso . tema = tema;
	}

	public  Usuario  getUsuario () {
		return usuario;
	}

	public  void  setUsuario ( Usuario  usuario ) {
		isso . usuario = usuario;
	}
	
}
