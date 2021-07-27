package  lista1 ;

import java.util.Scanner ;
 

public  class  atividade4 {

	public  static  void  main ( String [] args ) {
		Scanner texto = new Scanner(System.in);
		String str;
		
		double  a, b, c, r, s, d;
		
		
		System.out.println ( " Inclua o valor de A: " );
		a = texto.nextInt ();
		
		System.out.println ( " Inclua o valor B: " );
		b = texto.nextInt ();
		
		System.out.println ( " Inclua o valor C: " );
		c = texto.nextInt ();
		
		r =  Math.pow ((a + b), 2);
		s =  Math.pow ((b + c), 2 );
		
		d = ((r + s) / 2 );
		
		System.out.println ( " Resultado: "  + d);
		
	}

}
