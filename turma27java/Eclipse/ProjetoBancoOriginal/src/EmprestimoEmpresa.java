empacotar  Entidades ;

 classe  pública EmprestimoEmpresa  estende  ContaGeral {
	 saldo4 duplo protegido ;
	 emprestimoEmpresa duplo privado =  10000 ;
	public  EmprestimoEmpresa ( String  tipo , int  numero ) {
		super (tipo, numero);
	}
	public  double  getSaldo4 () {
		return saldo4;
	}
	public  void  setSaldo4 ( double  saldo4 ) {
		isso . saldo4 = saldo4;
	}
	public  double  getEmprestimoEmpresa () {
		return emprestimoEmpresa;
	}
	public  void  setEmprestimoEmpresa ( double  emprestimoEmpresa ) {
		isso . emprestimoEmpresa = emprestimoEmpresa;
	}
	
	@Sobrepor
	public  void  mostraHeader () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " Conta: " + this . getNumero () + " - BANCO NOVE9 " );
		Sistema . para fora . println ( this . getTipo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo4 ());
		Sistema . para fora . println ( " EMPRÉSTIMO DISPONÍVEL: R $ " + isto . getEmprestimoEmpresa ());
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
			isso . setSaldo4 (getSaldo4 () + valor);
			Sistema . para fora . println ( " Crédito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else  if (valor >  this . getSaldo4 ()) {
			Sistema . para fora . println ( " Valor indisponível. " );
		} else  if ( this . getSaldo4 () ==  0 ) {
			Sistema . para fora . println ( " Valor indisponível " );
		} else {
			isso . setSaldo4 (getSaldo4 () - valor);
			Sistema . para fora . println ( " Débito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	@Sobrepor
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo4 ());
		Sistema . para fora . println ( " EMPRÉSTIMO DISPONÍVEL: R $ " + isto . getEmprestimoEmpresa ());
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
		}	 else  if (valor <=  this . getEmprestimoEmpresa ()) {
			isso . setEmprestimoEmpresa ( this . getEmprestimoEmpresa () - valor);
			isso . setSaldo4 ( isto . getSaldo4 () + valor);
		} else {
			Sistema . para fora . println ( " Valor indisponível. " );
		}
	}
	
	
}