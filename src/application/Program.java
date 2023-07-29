package application;

import java.util.Scanner;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Enter product information:%n==================%n");
		
		System.out.println("Product's name: ");
		String productName = sc.nextLine();
		
		System.out.println("Price of the product: R$");
		double productPrice = sc.nextDouble();
		
		System.out.println("Amount: ");
		int productAmount = sc.nextInt();
		
		
		sc.close();

	}

}
