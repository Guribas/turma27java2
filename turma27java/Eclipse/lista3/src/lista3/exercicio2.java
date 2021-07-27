package lista3;

import  java.util.Scanner ;

public  class  exercicio2 {

	public  static  void  main ( String [] args ) {
		
		Scanner texto = new Scanner(System.in);
		
		int numero, contador = 0 , contadorPar = 0 , contadorImpar = 0 ;
		
		for (contador = 1 ; contador <= 10 ; contador ++ ) {
			System.out.println ( " Digite um numero: " );
			numero = texto.nextInt ();
			
			if (numero %  2  ==  0 ) {
				contadorPar ++ ;
			}
			if (numero %  2  == 1 ) {
				contadorImpar ++ ;
			}
		}
		System.out.println ( " Forame importante " + contadorPar + " numeros pares " );
		System.out.println ( " Forame importante " + contadorImpar + " numeros impares " );

	}

}
