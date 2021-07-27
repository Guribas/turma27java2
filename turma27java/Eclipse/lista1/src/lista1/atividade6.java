package  lista1 ;

import  java.util.Scanner ;

public  class  atividade6 {

	public  static  void  main ( String [] args ) {
		Scanner texto = new Scanner(System.in);
		String str;
		
		double d;
		int x1, x2, y1, y2;
		
		System.out.println ( " Coloque o valor de X1: " );
		x1 = texto.nextInt ();

		System.out.println ( " Coloque o valor de X2: " );
		x2 = texto.nextInt ();
		
		System.out.println ( " Coloque o valor de Y1: " );
		y1 = texto.nextInt ();
		
		System.out.println( " Coloque o valor de Y2: " );
		y2 = texto.nextInt ();
		
		d =  Math . sqrt ((( Math . pow ((x2 - x1), 2 )) + ( Math . pow ((x2 - x1), 2 ))));
		
		System.out.printf ( "O valor de d é% .2f " , d);
	}

}
