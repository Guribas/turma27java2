package Lista2 ;

import  java.util.Scanner ;

public  class  ativ1 {

	public  static  void  main ( String [] args ) {
		Scanner texto = new Scanner(System.in);
		String str;
		
		int numero1, numero2, numero3;
		
		System.out.println ( " Digite um número: " );
			numero1 = texto.nextInt ();
			System.out.println ( " Digite outro número: " );
			numero2 = texto.nextInt ();
			System.out.println ( " Agora digite mais um número: " );
			numero3 = texto.nextInt ();
			
			if (numero1 > numero2 && numero1 > numero3) {
				System.out.println ( " O maior entre os números é: " + numero1);
			}
			else  if (numero2 > numero1 && numero2 > numero3) {
				System.out.println ( " O maior entre os números é: " + numero2);
			}
			else  if (numero3 > numero1 && numero3 > numero2) {
				System.out.println ( " O maior entre os números é: " + numero3);
			}
			else {
				System.out.println ( " Fim " );
			}
	}

}
