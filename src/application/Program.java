package application;

import java.util.Scanner;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Recebendo os inputs do usuário

		System.out.printf("Enter product information:%n==================%n");

		System.out.println("Product's name: ");
		String productName = sc.nextLine();

		System.out.println("Price of the product: R$");
		double productPrice = sc.nextDouble();

		System.out.println("Amount: ");
		int productAmount = sc.nextInt();

		// Retornando os dados do estoque após input
		System.out.printf("The quantity of %s in stock is %d and the price is R$%.2f%n==========%n", productName,
				productAmount, productPrice);

		// Input para adicionar itens ao estoque
		System.out.println("Enter the number of products to be added in stock: ");
		int productAdd = sc.nextInt();

		// Retornando os dados do estoque após adição de itens
		System.out.printf("Updated data: %nThe quantity of %s in stock is %d and the price is R$%.2f%n==========%n",
				productName, productAmount, productPrice);

		// Input para remover itens do estoque
		System.out.println("Enter the number of products to be removed in stock: ");
		int productRemove = sc.nextInt();

		// Retornando os dados do estoque após remoção de itens
		System.out.printf("Updated data: %nThe quantity of %s in stock is %d and the price is R$%.2f%n",
				productName, productAmount, productPrice);

		sc.close();

	}

}
