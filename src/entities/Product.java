package entities;

public class Product {
	
	//Declarando os atributos da calsse Product
	public String name;
	public double price;
	public int quantity;
	
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
