package entities;

public class Product {
	
	//Declarando os atributos da classe Product
	private String name;
	private double price;
	private int quantity;
	
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
	
	//Por convenção, os metodos Getters e Setters são adicionados logo após os construtores
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price =price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//A quantidade de produtos somente será alterada em estoque quando houver uma entrada ou saída no estpque
	//O metodo getQuantity é uma regra de negócio que protege a integridade do objeto Produto
	public int getQuantity() {
		return quantity;
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
