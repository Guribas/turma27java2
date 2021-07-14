package  lista4 ;

public  class  exercicio4 {

	public  static  void  main ( String [] args ) {
		int soma =  0 ;
		int  M1 [] [] =  novo  int [ 3 ] [ 3 ];
		
		para ( int l =  0 ; l <  3 ; l ++ ) {
			para ( int c =  0 ; c <  3 ; c ++ ) {
				M1 [l] [c] = ( int ) Matemática . rodada ( matemática . aleatório () * 10 );
				
				if (l == c) {
					soma + = M1 [l] [c];
				}
			}
			
		}
		
		
		System.out.println ( " Matriz " );
		para ( int l =  0 ; l <  3 ; l ++ ) {
			para ( int c =  0 ; c <  3 ; c ++ ) {
				System.out.println ( M1 [c] [l] +  " \ t " );
			}
			System.out.println ();
			}
		
		System.out.println ( " Diagonal parcial: " + soma);
			
		}
		
		

	}


