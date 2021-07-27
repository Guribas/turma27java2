empacotar  Entidades ;

 classe  pública ContaPoupanca  estende  ContaGeral {
	private  int diaNiver;
	privado  int respostaDia;
	 saldo1 duplo protegido ;
	
	public  ContaPoupanca ( String  tipo , int  numero , int  diaNiver ) {
		super (tipo, numero);
		isso . diaNiver = diaNiver;
	}

	public  int  getDiaNiver () {
		return diaNiver;
	}

	public  void  setDiaNiver ( int  diaNiver ) {
		isso . diaNiver = diaNiver;
	}

	public  int  getRespostaDia () {
		return respostaDia;
	}

	public  void  setRespostaDia ( int  respostaDia ) {
		isso . respostaDia = respostaDia;
	}
	
	
	public  double  getSaldo1 () {
		return saldo1;
	}

	public  void  setSaldo1 ( double  saldo1 ) {
		isso . saldo1 = saldo1;
	}
	
	@Sobrepor
	public  void  mostraHeader () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " Conta: " + this . getNumero () + " - BANCO NOVE9 " );
		Sistema . para fora . println ( this . getTipo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo1 ());
	}

	@Sobrepor
	public  void  creditar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else {
			isso . setSaldo1 (getSaldo1 () + valor);
			Sistema . para fora . println ( " Crédito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else  if (valor >  this . getSaldo1 ()) {
			Sistema . para fora . println ( " Valor indisponível. " );
		} else  if ( this . getSaldo1 () ==  0 ) {
			Sistema . para fora . println ( " Valor indisponível " );
		} else {
			isso . setSaldo1 (getSaldo1 () - valor);
			Sistema . para fora . println ( " Débito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo1 ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Deseja repetir uma operação? S / N: " );
	}
	
	public  void  questionDia () {
		Sistema . para fora . println ( " Informe a data de hoje (DD): " );
	}
	
	
	public  void  ajustarPoupanca () {
		if ( this . getDiaNiver () ==  this . getRespostaDia ()) {
			isso . setSaldo1 ( this . getSaldo1 () + (( this . getSaldo1 () * 0.05 ) / 100 ));
			Sistema . para fora . println ( " Reajuste de saldo + 0,05% " );
		}
	}
	
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
	
	
}
