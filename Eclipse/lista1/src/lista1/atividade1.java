package lista1;

import java.util.Scanner;
	

public class atividade1 {

	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
		String str;
		
		int anos, anoHoje, meses, mesHoje, dias, diaHoje, diasPorAno, diasPorMes, diasTotal;
		
		
		System.out.println ( "Há quantos dias você está na Terra? " );
		
		System.out.println ( " Digite o ano atual? " );
		anoHoje = texto.nextInt ();
		
		System.out.println ( " Qual ano do seu nascimento? " );
		anos = texto.nextInt ();
		
		System.out.println ( " Digite o mês atual? " );
		mesHoje = texto.nextInt ();
		
		System.out.println ( " Qual o mês do seu nascimento? " );
		meses = texto.nextInt ();
		
		System.out.println ( " Qual o dia de hoje? " );
		diaHoje = texto.nextInt ();
		
		System.out.println ( " Qual o dia do seu nascimento? " );
		dias = texto.nextInt ();
		
		diasPorAno = ((anoHoje - anos) * 365 );
		diasPorMes = ((mesHoje - meses) * 30 );
		
		diasTotal = (diaHoje - dias) + diasPorAno + diasPorMes;
		
		System.out.println ( " Aqui na terra você está a " + diasTotal + " dias! " );
			

	}

}
