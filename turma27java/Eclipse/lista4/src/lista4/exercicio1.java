package  lista4 ;


public  class  exercicio1 {

	public  static  void  main ( String [] args ) {
		
		int notas [] =  novo  int [ 5 ];
		int maior =  0 ;
		
		for ( int i =  0 ; i < notas . comprimento; i ++ ) {
			notas [i] = ( int ) matemática . rodada ( matemática . aleatório () * 10 );
			System.out.println (notas [i]);
				if (notas [i] > maior) {
					maior = notas [i];
				}
		}
		
		System.out.println ( " O valor maior é " + maior);
		

	}

}
