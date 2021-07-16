package  Vetores ;

import  java.util.Scanner ;

public  class  exercicio4 {

	public  static  void  main ( String [] args ) {
		
		int [] [] matrizQuad = novo  int [ 3 ] [ 3 ];
		int somatorio = 0 , diagonal = 0 ;
		
		Scanner leia =  novo  Scanner ( Sistema . In );
	
		para ( int linha = 0 ; linha < 3 ; linha ++ ) {
			for ( int coluna = 0 ; coluna < 3 ; coluna ++ ) {
				Sistema . para fora . printf ( " Digite o elemento matrizQuad [% d] [% d]: " , linha + 1 , coluna + 1 );
				matrizQuad [linha] [coluna] = leia . nextInt ();
				somatorio + = matrizQuad [linha] [coluna];
				if (matrizQuad [linha] [linha] == matrizQuad [coluna] [coluna]) {
					diagonal + = matrizQuad [linha] [linha];
				}
			}
		}
		Sistema . para fora . println ( " A soma dos valores da matriz: " + somatorio);
		Sistema . para fora . println ( " A diagonal principal tem valor: " + diagonal);

	}

}
