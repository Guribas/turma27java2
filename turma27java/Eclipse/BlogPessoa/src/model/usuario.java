package  br.org.generation.blogpessoal.model ;

import  java.time.LocalDate ;
import  java.util.List ;

import  javax.persistence.CascadeType ;
import  javax.persistence.Column ;
import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.OneToMany ;
import  javax.persistence.Table ;
import  javax.validation.constraints.Email ;
import  javax.validation.constraints.NotBlank ;
import  javax.validation.constraints.NotNull ;
import  javax.validation.constraints.Size ;

import  com.fasterxml.jackson.annotation.JsonFormat ;
import  com.fasterxml.jackson.annotation.JsonIgnoreProperties ;

@Entidade
@Table ( name  =  " tb_usuarios " )
public  class  Usuario {

	@Identidade
	@GeneratedValue ( estrat�gia  =  GenerationType . IDENTITY )
	 id longo privado ;
	
	@NotNull ( mensagem  =  " O atributo nome � obrigat�rio " )
	@Size ( min  =  5 , max  =  100 , message  =  " O atributo nome deve conter no m�nimo 05 e no m�ximo 100 caracteres " )
	private  String nome;
	
	@NotNull ( message  =  " O atributo usu�rio � obrigat�rio " )
	@NotBlank ( mensagem  =  " O atributo usu�rio n�o pode ser vazio " )
	@Email ( mensagem  =  " O atributo usu�rio deve ser um email " )
	private  String usuario;
	
	@NotNull ( mensagem  =  " O atributo senha � obrigat�rio " )
	@Size ( min  =  8 , mensagem  =  " O atributo senha deve ter no m�nimo 8 caracteres " )
	private  String senha;
	
	@Column ( name  =  " dt_nascimento " )
	@JsonFormat ( pattern = " aaaa-MM-dd " )
    private  LocalDate dataNascimento;
	
	@OneToMany (mappedBy =  " usuario " , cascade =  CascadeType . REMOVE )
	@JsonIgnoreProperties ( " usuario " )
	 Lista  privada < Postagem > postagem;

	// Primeiro m�todo construtor

	public  Usuario ( long  id , String  nome , String  usuario , String  senha , LocalDate  dataNascimento ) {
		isso . id = id;
		isso . nome = nome;
		isso . usuario = usuario;
		isso . senha = senha;
		isso . dataNascimento = dataNascimento;
	}

	// Segundo m�todo construtor

	 Usuario p�blico () {}


	public  long  getId () {
		devolva  isso . eu ia;
	}

	public  void  setId ( long  id ) {
		isso . id = id;
	}

	public  String  getNome () {
		devolva  isso . nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  String  getUsuario () {
		devolva  isso . usuario;
	}

	public  void  setUsuario ( String  usuario ) {
		isso . usuario = usuario;
	}

	public  String  getSenha () {
		devolva  isso . senha;
	}

	public  void  setSenha ( String  senha ) {
		isso . senha = senha;
	}

	public  LocalDate  getDataNascimento () {
		devolva  isso . dataNascimento;
	}

	public  void  setDataNascimento ( LocalDate  dataNascimento ) {
		isso . dataNascimento = dataNascimento;
	}

	public  List < Postagem >  getPostagem () {
		devolva  isso . postagem;
	}

	public  void  setPostagem ( List < Postagem >  postagem ) {
		isso . postagem = postagem;
	}

}
