programa
{
	funcao inicio ()
	{
		real indiceDePoluicao

		escreva ("Informe o indice de fornece:")
		leia (indiceDePoluicao)

		se (indiceDePoluicao> = 0,5) {
			escreva ("Todos os grupos devem ser notificados.")
		} senao se (indiceDePoluicao> = 0,4) {
			escreva ("as industrias do 1º e 2º grupo devem ser intimadas.")
		} senao se (indiceDePoluicao> = 0,3) {
			escreva ("As indústrias do 1º grupo devem ser intimadas.")
		} senao {
			escrever ("Índice de compatível aceitável.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */