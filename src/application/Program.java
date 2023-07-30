package application;

import java.util.Scanner;

import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declarando variavel composta
		Product product = new Product();
				
		// Recebendo os inputs do usuário

		System.out.printf("Enter product information:%n==================%n");

		System.out.println("Product's name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price of the product: R$");
		product.price = sc.nextDouble();

		System.out.println("Amount: ");
		product.quantity = sc.nextInt();
				

		// Retornando os dados do estoque após input
		System.out.printf("The quantity of %s in stock is %d and the price is R$%.2f%n==========%n", product.name,
				product.quantity, product.totalValueInStock());
		
		//Chamando os metodos da classe Product para calcular o valor total do estoque
		double totalValueStock = product.totalValueInStock();
		
		// Input para adicionar itens ao estoque
		System.out.println("Enter the number of products to be added in stock: ");
		int totalItensAdd = sc.nextInt();
		product.addProducts(totalItensAdd);
		totalValueStock = product.totalValueInStock();

		// Retornando os dados do estoque após adição de itens
		System.out.printf("Updated data: %nThe quantity of %s in stock is %d and the price is R$%.2f%n==========%n",
				product.name, product.quantity, totalValueStock);

		// Input para remover itens do estoque
		System.out.println("Enter the number of products to be removed in stock: ");
		int totalItensRemove = sc.nextInt();
		product.removeProducts(totalItensRemove);
		totalValueStock = product.totalValueInStock();

		// Retornando os dados do estoque após remoção de itens
		System.out.printf("Updated data: %nThe quantity of %s in stock is %d and the price is R$%.2f%n",
				product.name, product.quantity, totalValueStock);

		sc.close();

	}

}
