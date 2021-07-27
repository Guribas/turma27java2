empacotar  Entidades ;

public  class  ContaCorrente  extends  ContaGeral {
	 saldo2 duplo protegido ;
	 verificação interna privada =  3 ;
	
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
		Sistema . para fora . println ( " 1 - Crédito " );
		Sistema . para fora . println ( " 2 - Débito " );
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Digite a opção desejada: " );
	}
	
	@Sobrepor
	public  void  creditar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else {
			isso . setSaldo2 (getSaldo2 () + valor);
			Sistema . para fora . println ( " Crédito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else  if (valor >  this . getSaldo2 ()) {
			Sistema . para fora . println ( " Valor indisponível. " );
		} else  if ( this . getSaldo2 () ==  0 ) {
			Sistema . para fora . println ( " Valor indisponível " );
		} else {
			isso . setSaldo2 (getSaldo2 () - valor);
			Sistema . para fora . println ( " Débito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo2 ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Deseja repetir uma operação? S / N: " );
	}
	
	@Sobrepor
	public  void  mostraMenu () {
		Sistema . para fora . println ( " -------- BANCO NOVE9 ------ " );
		Sistema . para fora . println ( " --- ATRIBUINDO EXPOENTE ---- " );
		Sistema . para fora . println ( " ----- AO SEU PATRIMÔNIO ---- " );
		Sistema . para fora . println ( " ----------- MENU ----------- " );
		Sistema . para fora . println ( " 1 - Conta Poupança " );
		Sistema . para fora . println ( " 2 - Conta Corrente " );
		Sistema . para fora . println ( " 3 - Conta Especial " );
		Sistema . para fora . println ( " 4 - Conta Empresa " );
		Sistema . para fora . println ( " 5 - Conta Estudantil " );
		Sistema . para fora . println ( " 6 - Sair " );
		Sistema . para fora . println ( " --------------------------- " );
		Sistema . para fora . println ( " Digite a opção desejada: " );
	}
	
	public  void  mostraCheque () {
		isso . setCheque ( this . getCheque () - 1 );
		isso . setSaldo2 ( isto . getSaldo2 () - 30,00 );
		Sistema . para fora . println ( " Seu talão foi solicitado com sucesso " );
		Sistema . para fora . println ( " Total de verificações disponíveis: " + this . getCheque ());
		// break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
