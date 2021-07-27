package  Vetores ;

import  java.util.Scanner ;

public  class  exercicio1 {

	public  static  void  main ( String [] args ) {
		
		int [] notas =  new  int [ 5 ];
		int maiorNota = 0 ;
		
		Scanner leia =  novo  Scanner ( Sistema . In );
		
		para ( int i = 0 ; i < 5 ; i ++ ) {
			Sistema . para fora . println ( " Digite uma nota: " );
			notas [i] = leia . nextInt ();
			}
		
		para ( int i = 0 ; i < 5 ; i ++ ) {
			Sistema . para fora . println ( " Nota " + (i + 1 ) + " = " + notas [i]);
			if (notas [i] > maiorNota) {
				maiorNota = notas [i];
			}

		}
		Sistema . para fora . println ( " A maior nota foi: " + maiorNota);
	}

}
