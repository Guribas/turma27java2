package lista3;

import  java.util.Scanner ;

public class exercicio6 {



       private static Object m�dia;
       private static Object soma;
       private static Object media;

	public  static  void  main ( String [] args ) {
    	   Scanner texto = new Scanner(System.in);
		
		int num, Soma =  0 , c =  - 1 , Comunica��o;
		
		for {
			System.out.println ( " Coloque um n�mero: " );
			num = texto.nextInt ();
			
			if (num % 3 == 0 ) {
				soma += num;
				c ++ ;
				System.out.println ( " A soma � multiplo de 3 " );
			}
						
		} else if (num !=  0 );
		
		m�dia = soma / c;
		System.out.println ( " Geral n�meros multiplos de 3: " + c);
		System.out.println ( " A somat�ria de todos os m�ltiplos de 3: " + soma);
		System.out.println ( " A m�dia da soma dos n�meros multiplos de 3: " + media);
		
       }
       
}