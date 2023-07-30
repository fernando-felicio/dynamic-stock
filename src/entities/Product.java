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
	
	public void addProducts(int quantityToAdd) {
		quantity += quantityToAdd;		
	}
	
	public void removeProducts(int quantityToRemove) {
		quantity -= quantityToRemove;
	}

}
