empacotar  Entidades ;

public  class  ContaCorrente  extends  ContaGeral {
	 saldo2 duplo protegido ;
	 verifica��o interna privada =  3 ;
	
	public  ContaCorrente ( String  tipo , int  numero ) {
		super (tipo, numero);
	}

	public  double  getSaldo2 () {
		return saldo2;
	}

	public  void  setSaldo2 ( double  saldo2 ) {
		isso . saldo2 = saldo2;
	}

	public  int  getCheque () {
		cheque de retorno ;
	}

	public  void  setCheque ( int  check ) {
		isso . verificar = verificar;
	}
	
	@Sobrepor
	public  void  mostraHeader () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " Conta: " + this . getNumero () + " - BANCO NOVE9 " );
		Sistema . para fora . println ( this . getTipo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo2 ());
	}
	
	@Sobrepor
	public  void  mostraCredDeb () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " 1 - Cr�dito " );
		Sistema . para fora . println ( " 2 - D�bito " );
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Digite a op��o desejada: " );
	}
	
	@Sobrepor
	public  void  creditar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor v�lido. " );
		} else {
			isso . setSaldo2 (getSaldo2 () + valor);
			Sistema . para fora . println ( " Cr�dito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor v�lido. " );
		} else  if (valor >  this . getSaldo2 ()) {
			Sistema . para fora . println ( " Valor indispon�vel. " );
		} else  if ( this . getSaldo2 () ==  0 ) {
			Sistema . para fora . println ( " Valor indispon�vel " );
		} else {
			isso . setSaldo2 (getSaldo2 () - valor);
			Sistema . para fora . println ( " D�bito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo2 ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Deseja repetir uma opera��o? S / N: " );
	}
	
	@Sobrepor
	public  void  mostraMenu () {
		Sistema . para fora . println ( " -------- BANCO NOVE9 ------ " );
		Sistema . para fora . println ( " --- ATRIBUINDO EXPOENTE ---- " );
		Sistema . para fora . println ( " ----- AO SEU PATRIM�NIO ---- " );
		Sistema . para fora . println ( " ----------- MENU ----------- " );
		Sistema . para fora . println ( " 1 - Conta Poupan�a " );
		Sistema . para fora . println ( " 2 - Conta Corrente " );
		Sistema . para fora . println ( " 3 - Conta Especial " );
		Sistema . para fora . println ( " 4 - Conta Empresa " );
		Sistema . para fora . println ( " 5 - Conta Estudantil " );
		Sistema . para fora . println ( " 6 - Sair " );
		Sistema . para fora . println ( " --------------------------- " );
		Sistema . para fora . println ( " Digite a op��o desejada: " );
	}
	
	public  void  mostraCheque () {
		isso . setCheque ( this . getCheque () - 1 );
		isso . setSaldo2 ( isto . getSaldo2 () - 30,00 );
		Sistema . para fora . println ( " Seu tal�o foi solicitado com sucesso " );
		Sistema . para fora . println ( " Total de verifica��es dispon�veis: " + this . getCheque ());
		// break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
