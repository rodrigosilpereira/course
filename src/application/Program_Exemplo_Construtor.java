package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Product_Construtor;

public class Program_Exemplo_Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		// Sobrecarga - para testar deixarcomentado.
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		//sem sobrecarga
		Product_Construtor product = new Product_Construtor(name, price, quantity);
		//com sobrecarga
		//Product_Construtor product = new Product_Construtor(name, price);
		
		//encapsulamento
		product.setName("Computer");
		System.out.println("Updated Name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		//sobrecarga
		//int quantity = sc.nextInt();		
		//sem sobrecarga
		 quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}

}
