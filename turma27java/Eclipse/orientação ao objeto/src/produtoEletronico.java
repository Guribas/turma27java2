package  ObjetosLista5 ;

public class produtoEletronico {

	public  class  ProdutoEletronico {
		public  String nomeDoProduto;
		public  String geracao;
		public  String marca;
		public  int bateria =  25 ;
		 booleano público ligado;
		public  boolean carregarNaTomada;
		public  boolean tirarFoto;
		public  boolean ouvirMusica;
		
		public  boolean  ligar () {
			if (bateria >  10 ) {
				Ligado =  verdadeiro ;
			} else {
				Ligado =  falso ;
			}
			
			voltar Ligado;
		}

		public  boolean  desligar () {
			if (bateria <  10 ) {
				Ligado =  falso ;
			} else {
				Ligado =  verdadeiro ;
			}
			
			voltar Ligado;
		}
		
		public  int  recarregar () {
			carregarNaTomada =  true ;
			if (bateria <  100 ) {
				bateria ++ ;
			}
			return bateria;
		}
		
		
		public  boolean  fotografar () {
			enquanto (ligado =  verdadeiro ) {
				tirarFoto =  true ;
				bateria - ;
			}
			return tirarFoto;
		}
		
		public  boolean  musica () {
			enquanto (ligado =  verdadeiro ) {
				ouvirMusica =  verdadeiro ;
				bateria - ;
			}
			return ouvirMusica;
		}
	}
}
