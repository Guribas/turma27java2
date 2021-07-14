package lista3;

import  java.util.Scanner ;

public class exercicio6 {



       private static Object mídia;
       private static Object soma;
       private static Object media;

	public  static  void  main ( String [] args ) {
    	   Scanner texto = new Scanner(System.in);
		
		int num, Soma =  0 , c =  - 1 , Comunicação;
		
		for {
			System.out.println ( " Coloque um número: " );
			num = texto.nextInt ();
			
			if (num % 3 == 0 ) {
				soma += num;
				c ++ ;
				System.out.println ( " A soma é multiplo de 3 " );
			}
						
		} else if (num !=  0 );
		
		mídia = soma / c;
		System.out.println ( " Geral números multiplos de 3: " + c);
		System.out.println ( " A somatória de todos os múltiplos de 3: " + soma);
		System.out.println ( " A média da soma dos números multiplos de 3: " + media);
		
       }
       
}