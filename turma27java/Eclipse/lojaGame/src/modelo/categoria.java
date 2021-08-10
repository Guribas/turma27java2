package  com.freitasdev.games.model ;

import  java.util.List ;

import  javax.persistence.CascadeType ;
import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.OneToMany ;
import  javax.persistence.Table ;
import  javax.validation.constraints.NotBlank ;
import  javax.validation.constraints.NotNull ;
import  javax.validation.constraints.Size ;

import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;

@Entidade
@Table ( name  =  " tb_categoria " )
public  class  Categoria {
	
	
	@Identidade
	@GeneratedValue ( estratégia  =  GenerationType . IDENTITY )
	 id longo privado ;
	
	@NotBlank
	@Size ( min  =  2 , max  =  20 )
	private  String tipo;
	
	@NotBlank
	@Size ( min  =  2 , max  =  20 )
	privada  String descricao;
	
	@OneToMany ( mappedBy  =  " categoria " , cascade  =  CascadeType . REMOVE ) // MappedBy faz referência a tabela que tem uma chave de força dele.
	@JsonIgnoreProperties ( " categoria " )	 // ignora a mesma coisa que está mapeando // Usar Remover
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
	
	

}
