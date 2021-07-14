package  lista4 ;


public  class  exercicio2 {

	public  static  void  main ( String [] args ) {
				
		int soma = 0 , maiorX = 0 , maior = 0 ;
		int dado [] =  new  int [ 10 ];
		
		para ( int i =  0 ; i < dado . comprimento; i ++ ) {
			dado [i] = ( int ) Matemática . rodada ( matemática . aleatório () * 10 );
			System.out.println ( " Valor: " + dado [i]);
			
			soma + = dado [i];
			
			if (dado [i] > maior) {
				maior = dado [i];
			}
		}
		
		
		para ( int i =  0 ; i < dado . comprimento; i ++ ) {
			if (dado [i] == maior) {
				maiorX ++ ;
			}
		}
		
		System.out.println ( " Média dos dados lançados: " + (soma / dado . comprimento));
		System.out.println ( " O valor maior lançado foi " + maior + " , que ocorreu " + maiorX + " vezes. " );
		
		
		
		
		

	}

}
