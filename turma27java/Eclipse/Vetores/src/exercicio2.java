package  Vetores ;

import  java.util.Scanner ;

public  class  exercicio2 {

	public  static  void  main ( String [] args ) {
		int [] valorDado =  novo  int [ 10 ];
		int maiorValor = 0 , quantMaiorValor = 0 , somatorio = 0 ;
		double mediaValor;
		
		Scanner leia =  novo  Scanner ( Sistema . In );
		
		para ( int i = 0 ; i < 10 ; i ++ ) {
			Sistema . para fora . println ( " Digite o valor do lançamento " + (i + 1 ) + " : " );
			valorDado [i] = leia . nextInt ();
			somatorio + = valorDado [i];
			if (valorDado [i] > maiorValor) {
				maiorValor = valorDado [i];
			}
		}
		para ( int i = 0 ; i < 10 ; i ++ ) {
			if (valorDado [i] == maiorValor) {
				quantMaiorValor ++ ;
			}
		}
		mediaValor = somatorio / 10 ;
		
		Sistema . para fora . println ( " A média dos lançamentos: " + mediaValor);
		Sistema . para fora . println ( " A maior pontuação: " + maiorValor);
		Sistema . para fora . println ( " A quanitdade de vezes que a pontuação apareceu: " + quantMaiorValor);

	}

}
