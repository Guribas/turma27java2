package  com.generation.farmacia.model ;

import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.ManyToOne ;
import  javax.persistence.Table ;
import  javax.validation.constraints.Min ;
import  javax.validation.constraints.NotBlank ;
import  javax.validation.constraints.Size ;

import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;


@Entidade
@Table ( name  =  " tb_produto " )
public  class  Produto {
	@Identidade
	@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
	 id longo privado ;
	
	@NotBlank
	@Size ( min  =  5 , max  =  30 )
	private  String nome;
	
	@Min ( 1 )
	 preco duplo privado ;
	
	
	 disponivel booleano privado ;
	
	@ManyToOne
	@JsonIgnoreProperties ( " produtos " )
	 categoria privada categoria;
	
	

	public  long  getId () {
		return id;
	}

	public  void  setId ( long  id ) {
		isso . id = id;
	}

	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  double  getPreco () {
		return preco;
	}

	public  void  setPreco ( double  preco ) {
		isso . preco = preco;
	}

	public  boolean  isDisponivel () {
		return disponivel;
	}

	public  void  setDisponivel ( boolean  disponivel ) {
		isso . disponivel = disponivel;
	}
	
	public  Categoria  getCategoria () {
		voltar categoria;
	}

	public  void  setCategoria ( Categoria  categoria ) {
		isso . categoria = categoria;
	}
	
}
