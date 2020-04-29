package entities;

public class Product_Construtor {
	//public String name;
	//public double price;
	//Encapsulamento das variaveis acima name e price
	private String name;
	private double price;
	private int quantity;
	
	public Product_Construtor() {
	
	}
	
	public Product_Construtor(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga
	
	public Product_Construtor(String name, double price) {
		this.name = name;
		this.price = price;
	}
		
	//encapsulamento
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}


