package entities;

public class Product {
	
	//Declarando os atributos da classe Product
	public String name;
	public double price;
	public int quantity;
	
	//Disponibilizando construtor padrão
	public Product() {
		
	}
	
	//Criando construtor 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga do construtor
	public Product(String name, double price) {
		this.name= name;
		this.price = price;
		
	}
	
	public double totalValueInStock() {
		double value = price * quantity;
		return value;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name +
				", R$" +
				String.format("%.2f", price) +
				", " + quantity +
				" units, Total: R$" +
				String.format("%.2f", totalValueInStock());
	}


}
