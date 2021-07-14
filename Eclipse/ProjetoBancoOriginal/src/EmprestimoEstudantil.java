empacotar  Entidades ;

 classe  pública EmprestimoEstudantil  estende  ContaGeral {
	 saldo5 duplo protegido ;
	 emprestimoEstudante duplo privado =  5000 ;
	public  EmprestimoEstudantil ( String  tipo , int  numero ) {
		super (tipo, numero);
	}
	
	
	public  double  getSaldo5 () {
		return saldo5;
	}


	public  void  setSaldo5 ( double  saldo5 ) {
		isso . saldo5 = saldo5;
	}


	public  double  getEmprestimoEstudante () {
		return emprestimoEstudante;
	}


	public  void  setEmprestimoEstudante ( double  emprestimoEstudante ) {
		isso . emprestimoEstudante = emprestimoEstudante;
	}




	@Sobrepor
	public  void  mostraHeader () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " Conta: " + this . getNumero () + " - BANCO NOVE9 " );
		Sistema . para fora . println ( this . getTipo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo5 ());
		Sistema . para fora . println ( " EMPRÉSTIMO DISPONÍVEL: R $ " + isto . getEmprestimoEstudante ());
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
			isso . setSaldo5 (getSaldo5 () + valor);
			Sistema . para fora . println ( " Crédito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else  if (valor >  this . getSaldo5 ()) {
			Sistema . para fora . println ( " Valor indisponível. " );
		} else  if ( this . getSaldo5 () ==  0 ) {
			Sistema . para fora . println ( " Valor indisponível " );
		} else {
			isso . setSaldo5 (getSaldo5 () - valor);
			Sistema . para fora . println ( " Débito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo5 ());
		Sistema . para fora . println ( " EMPRÉSTIMO DISPONÍVEL: R $ " + isto . getEmprestimoEstudante ());
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
	
	public  void  emprestimo ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Valor inválido. " );
		}	 else  if (valor <=  this . getEmprestimoEstudante ()) {
			isso . setEmprestimoEstudante ( this . getEmprestimoEstudante () - valor);
			isso . setSaldo5 ( isto . getSaldo5 () + valor);
		} else {
			Sistema . para fora . println ( " Valor indisponível. " );
		}
	}
}