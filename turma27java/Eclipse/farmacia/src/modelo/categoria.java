package  com.generation.farmacia.model ;

import  java.util.List ;

import  javax.persistence.CascadeType ;
import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.OneToMany ;
import  javax.persistence.Table ;
import  javax.validation.constraints.NotBlank ;
import  javax.validation.constraints.Size ;

import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;


@Entidade
@Table ( name  =  " tb_categoria " )
public  class  Categoria {
	@Identidade
	@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
	 id longo privado ;
	
	@NotBlank
	@Size ( min  =  5 , max  =  20 )
	private  String tipo;
	
	@NotBlank
	@Size ( min  =  5 , max  =  100 )
	privada  String descricao;
	
	@OneToMany ( mappedBy  =  " categoria " , cascade  =  CascadeType . REMOVER )
	@JsonIgnoreProperties ( " categoria " )
	 Lista privada < Produto > produtos;


	public  long  getId () {
		return id;
	}

	public  void  setId ( long  id ) {
		isso . id = id;
	}

	public  String  getTipo () {
		return tipo;
	}

	public  void  setTipo ( String  tipo ) {
		isso . tipo = tipo;
	}

	public  String  getDescricao () {
		return descricao;
	}

	public  void  setDescricao ( String  descricao ) {
		isso . descricao = descricao;
	}
	
	public  List < Produto >  getProdutos () {
		retornar produtos;
	}

	public  void  setProdutos ( Lista < Produto >  produtos ) {
		isso . produtos = produtos;
	}


}
