package OIMUNDO;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperatura
		String name = "Ed"; 
		
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura em C° para conversao:));"
		System.out.prinln("Em kelvin: "+ (temperatura+273.15));
		temperatura = (temperatura*1.8)+32;
	    System.out.println("Em Fahrenheit: "+temperatura+"F°");

	}

}
