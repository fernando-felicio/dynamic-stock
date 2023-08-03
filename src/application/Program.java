package application;

import java.util.Scanner;

import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		// Recebendo os inputs do usuário

		System.out.printf("Enter product information:%n==================%n");

		System.out.println("Product's name: ");
		String name = sc.nextLine();
		
		System.out.println("Price of the product: R$");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");	
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated prrice: " + product.getPrice());

		// Retornando os dados do estoque após input
		System.out.println("Product data: " + product);
		
		//Chamando os metodos da classe Product para calcular o valor total do estoque
		double totalValueStock = product.totalValueInStock();
		
		// Input para adicionar itens ao estoque
		System.out.println("Enter the number of products to be added in stock: ");
		int totalItensAdd = sc.nextInt();
		product.addProducts(totalItensAdd);
		
		// Retornando os dados do estoque após adição de itens
		System.out.println("Product data: " + product);

		// Input para remover itens do estoque
		System.out.println("Enter the number of products to be removed in stock: ");
		int totalItensRemove = sc.nextInt();
		product.removeProducts(totalItensRemove);
		
		// Retornando os dados do estoque após remoção de itens
		System.out.println("Product data: " + product);
		System.out.println();

		sc.close();

	}

}
