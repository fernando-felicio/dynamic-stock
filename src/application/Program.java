package application;

import java.util.Scanner;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//Recebendo os inputs do usuário
		
		System.out.printf("Enter product information:%n==================%n");
		
		System.out.println("Product's name: ");
		String productName = sc.nextLine();
		
		System.out.println("Price of the product: R$");
		double productPrice = sc.nextDouble();
		
		System.out.println("Amount: ");
		int productAmount = sc.nextInt();
		
		//Retornando os dados do estoque após input
		System.out.printf("The quantity of %s in stock is %d and the price is R$%.2f", productName, productAmount, productPrice);
		
		
		
		sc.close();

	}

}
