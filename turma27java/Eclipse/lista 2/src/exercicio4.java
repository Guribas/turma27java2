package lista 2 ;

import  java.util.Scanner ;

public  class  exercicio4 {

	public  static  void  main ( String [] args ) {
		Scanner texto = new Scanner(System.in);
		
		int numero;
		
		System.out.println ( " Digite um numero: " );
			numero = texto.nextInt ();
			
			if (numero %  2  ==  0 ) {
				System.out.println ( Math . sqrt (numero));
						
			}
			else {
				System.out.println ( Math . pow (numero, 2 ));
			}
		
		
	}

}
