package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_V3;

public class Problema_Exemplo_V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator_V3.circumference(radius);
		double v = Calculator_V3.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator_V3.PI);
		
	}

}
