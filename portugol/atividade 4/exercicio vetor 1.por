programa
{
	
	funcao inicio ()
	{
		inteiro pontuacao1 [5], Pontuacao2 = 0

		para (inteiro i = 0; i <5; i ++) {
			escreva ("\n Insira a " + (i + 1) + " pontuação:")
			leia (pontuacao1 [i])

			se (pontuacao1 [i]> Pontuacao2) {
				Pontuacao2 = pontuacao1 [i]
			}
		}

		
		
		para (inteiro i = 0; i <5; i ++) {
			escreva ("\n " + (i + 1) + "a. pontuação:" + pontuacao1 [i])
		}

		escreva ("\n A maior pontuação foi:" + Pontuacao2)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */