package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Problema_Exemplo_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa para ler um valor num�rico qualquer, e da� mostrar
			quanto seria o valor de uma circunfer�ncia e do volume de uma esfera
			para um raio daquele valor. Informar tamb�m o valor de PI com duas
			casas decimais.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		sc.close();
	}


}
