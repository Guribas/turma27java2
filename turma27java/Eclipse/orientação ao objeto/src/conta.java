package  ObjetosLista5

public class conta {


	public  class  Conta {
		
		private  int numero;
		private int saldo  ;
		private int limite  ;
		

		
		
		 Conta pública ( int  numero , saldo , imite ) { 
			
			this.numero = numero;
			this.saldo = saldo;
			this.limite = limite;
		}

		
		

		public  int  getNumero () {
			return numero;
		} 


		public  void  setNumero ( int  numero ) {
			this. numero = numero;
		} 




		public  double  getSaldo () {
			this.saldo ;
		}




		public  void  setSaldo ( saldo duplo  ) {
			this. saldo = saldo;
		}




		public  double  getLimite () {
			this.limite  ;
		}




		public  void  setLimite ( limite duplo  ) {
			this.limite = limite;
		}



		

		public  void  sacar ( double  valorSaque ) {
			if (valorSaque > saldo) {
				System.out.println ( " Saldo inválido " );
			} else  if (valorSaque <=  0 ) {
				System.out.println ( " Valor digitado inválido. " );
			} else {
				saldo -= valorSaque;
				System.out.println ( " Saque realizado. " );
			}
			
		}
		
		public  void  depositar ( double  valorDeposito ) {
			saldo += valorDeposito;
		}
		
		public  void  imprimeExtrato () {
			System.out.println ( " Conta " + this . numero + " - Saldo Atual: R $ " + this . saldo);
		}
		
	}
}
