empacotar  Entidades ;

public  abstract  class  ContaGeral {
	 saldo duplo protegido ;
	 crédito duplo privado ;
	 duplo debito privado ;
	private  int escolhaCredDeb;
	private  String respostaRepeteSN;
	private  String tipo;
	private  int numero;
		
	pública  ContaGeral ( double  saldo , double  credito , dupla  debito , int  escolhaCredDeb ,
			String  respostaRepeteSN , String  tipo , int  numero ) {
		super ();
		isso . saldo = saldo;
		isso . credito = credito;
		isso . debito = debito;
		isso . escolhaCredDeb = escolhaCredDeb;
		isso . respostaRepeteSN = respostaRepeteSN;
		isso . tipo = tipo;
		isso . numero = numero;
	}
	
	public  ContaGeral ( String  tipo , int  numero ) {
		super ();
		isso . tipo = tipo;
		isso . numero = numero;
	}

	public  double  getSaldo () {
		return saldo;
	}
	
	public  void  setSaldo ( saldo duplo  ) {
		isso . saldo = saldo;
	}
	
	public  double  getCredito () {
		return credito;
	}
	
	pública  vazio  setCredito ( double  credito ) {
		isso . credito = credito;
	}
	
	public  double  getDebito () {
		return debito;
	}
	
	public  void  setDebito ( double  debito ) {
		isso . debito = debito;
	}
	
	public  int  getEscolhaCredDeb () {
		return escolhaCredDeb;
	}
	
	public  void  setEscolhaCredDeb ( int  escolhaCredDeb ) {
		isso . escolhaCredDeb = escolhaCredDeb;
	}

	public  String  getRespostaRepeteSN () {
		return respostaRepeteSN;
	}
	
	public  void  setRespostaRepeteSN ( String  respostaRepeteSN ) {
		isso . respostaRepeteSN = respostaRepeteSN;
	}
	
	public  String  getTipo () {
		return tipo;
	}
	
	public  void  setTipo ( String  tipo ) {
		isso . tipo = tipo;
	}
	
	public  int  getNumero () {
		return numero;
	}

	public  void  setNumero ( int  numero ) {
		isso . numero = numero;
	}

	public  void  mostraHeader () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " Conta: " + this . getNumero () + " - BANCO NOVE9 " );
		Sistema . para fora . println ( this . getTipo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo ());
	}
	
	public  void  mostraCredDeb () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " 1 - Crédito " );
		Sistema . para fora . println ( " 2 - Débito " );
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Digite a opção desejada: " );
		
	}
	
	public  void  creditar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else {
			isso . setSaldo (getSaldo () + valor);
			Sistema . para fora . println ( " Crédito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
	public  void  debitar ( valor duplo  ) {
		if (valor <=  0 ) {
			Sistema . para fora . println ( " Insira um valor válido. " );
		} else  if (valor >  this . getSaldo ()) {
			Sistema . para fora . println ( " Valor indisponível. " );
		} else  if ( this . getSaldo () ==  0 ) {
			Sistema . para fora . println ( " Valor indisponível " );
		} else {
			isso . setSaldo (getSaldo () - valor);
			Sistema . para fora . println ( " Débito no valor R $ " + valor + " feito com sucesso. " );
		}
	}
	
		
	public  void  repeteOp () {
		Sistema . para fora . println ( "  " );
		Sistema . para fora . println ( " SALDO: R $ " + this . getSaldo ());
		Sistema . para fora . println ( " ----------------------- " );
		Sistema . para fora . println ( " Deseja repetir uma operação? S / N: " );
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
	
	public  void  voltaMenu () {
		if ( this . getRespostaRepeteSN () . toLowerCase () . equals ( " n " )) {
			para ( int i =  1 ; i <  2 ; i ++ ) {
				pausa ;
			}
		}
	}
}
