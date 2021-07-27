programa
{
	
inclua biblioteca Matematica -> mat
	funcao inicio ()
	{
		// LISTA 02
		// QUESTÃO 03
		/ * Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for> = 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados. * /
		real primeiroNumero, quadradoPrimeiroNumero, segundoNumero, quadradoSegundoNumero, terceiroNumero, quadradoTerceiroNumero, quartoNumero, quadradoQuartoNumero
		
		escreva ("Digite quatro números! \ n")
		escreva ("Primeiro número:")
		leia (primeiroNumero)
		escreva ("Segundo número:")
		leia (segundoNumero)
		escreva ("Terceiro número:")
		leia (terceiroNumero)
		escreva ("Quarto número:")
		leia (quartoNumero)
		()

		quadradoPrimeiroNumero = mat.potencia (primeiroNumero, 2)
		quadradoSegundoNumero = mat.potencia (segundoNumero, 2)
		quadradoTerceiroNumero = mat.potencia (terceiroNumero, 2)
		quadradoQuartoNumero = mat.potencia (quartoNumero, 2)
		
		se (quadradoTerceiroNumero> = 1000) {
			escreva ("O quadrado do terceiro número digitado é", quadradoTerceiroNumero, ". \ n")
			
		} senao {
			escreva ("O primeiro número digitado é", primeiroNumero, ". \ n")
			escreva ("O segundo número digitado é", segundoNumero, ". \ n")
			escreva ("O terceiro número digitado é", terceiroNumero, ". \ n")
			escreva ("O quarto número digitado é", quartoNumero, ". \ n \ n")

			escreva ("O quadrado do primeiro número digitado é", quadradoPrimeiroNumero, ". \ n")
			escreva ("O quadrado do segundo número digitado é", quadradoSegundoNumero, ". \ n")
			escreva ("O quadrado do terceiro número digitado é", quadradoTerceiroNumero, ". \ n")
			escreva ("O quadrado do quarto número digitado é", quadradoQuartoNumero, ". \ n")
			 
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */