package  Vetores ;

import  java.util.Scanner ;


public  class  exercicio3 {

	public  static  void  main ( String [] args ) {
		
		int [] [] matrizN1 =  novo  int   [ 4 ] [ 6 ];
		int [] [] matrizN2 =  novo  int   [ 4 ] [ 6 ];
		int [] [] matrizM1 =  novo  int   [ 4 ] [ 6 ];
		int [] [] matrizM2 =  novo  int   [ 4 ] [ 6 ];
		
		Scanner leia =  novo  Scanner ( Sistema . In );
		
		para ( int linha = 0 ; linha < 4 ; linha ++ ) {
			for ( int coluna = 0 ; coluna < 6 ; coluna ++ ) {
				Sistema . para fora . printf ( " Diigite o N1 [% d] [% d]: \ n " , linha + 1 , coluna + 1 );
				matrizN1 [linha] [coluna] = leia . nextInt ();
				Sistema . para fora . printf ( " Diígito o N2 [% d] [% d]: \ n " , linha + 1 , coluna + 1 );
				matrizN2 [linha] [coluna] = leia . nextInt ();
				matrizM1 [linha] [coluna] = (matrizN1 [linha] [coluna] + matrizN2 [linha] [coluna]);
				matrizM2 [linha] [coluna] = (matrizN1 [linha] [coluna] - matrizN2 [linha] [coluna]);
				
			}
		}
		Sistema . para fora . println ( " Matriz M1: " );
		para ( int linha = 0 ; linha < 4 ; linha ++ ) {
			for ( int coluna = 0 ; coluna < 6 ; coluna ++ ) {
				Sistema . para fora . printf ( " \ t % d \ t " , matrizM1 [linha] [coluna]);
			} Sistema . para fora . println ();
		}
		Sistema . para fora . println ( " \ n Matriz M2: " );
		para ( int linha = 0 ; linha < 4 ; linha ++ ) {
			for ( int coluna = 0 ; coluna < 6 ; coluna ++ ) {
					Sistema . para fora . printf ( " \ t % d \ t " , matrizM2 [linha] [coluna]);
				} Sistema . para fora . println ();
			}
	}
}
