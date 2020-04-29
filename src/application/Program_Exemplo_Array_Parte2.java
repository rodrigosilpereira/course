package application;

import java.util.Scanner;

import entities.Product_Array;

public class Program_Exemplo_Array_Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   Fazer um programa para ler um número inteiro N e os dados (nome e
		   preço) de N Produtos. Armazene os N produtos em um vetor. Em
           seguida, mostrar o preço médio dos produtos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product_Array[] vect = new Product_Array[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_Array(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();

	}

}
