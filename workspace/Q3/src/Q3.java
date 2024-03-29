import java.util.Scanner;

// Q3 Assignment
// Author: Ian Arcuri
// Date: Sep 16, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com
public class Q3 {

	public static void main(String[] args) {
		
		// Declare variables
		String restaurantName;
		String serverName;
		double subtotal;
		double tax;
		double total;
		double taxRate = 0.06;
		double tipRate1 = 0.10;
		double tipRate2 = 0.15;
		double tipRate3 = 0.20;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Name of Restaurant: ");
		restaurantName = keyboard.nextLine();
		
		
		System.out.print("Name of Server: ");
		serverName = keyboard.nextLine();
		
		System.out.print("Cost of Bill: ");
		subtotal = keyboard.nextDouble();
		
		System.out.printf("=====================================\n");
		
		System.out.println(restaurantName);
		System.out.println("Your server was: " + serverName.toUpperCase());
		System.out.println("Subtotal: $" + subtotal);
		
		tax = taxRate * subtotal;
		System.out.printf("Tax: $%.2f", tax);
		
		System.out.printf("\n=====================================\n");
		
		total = tax + subtotal;
		System.out.printf("Total: $%.2f\n\n", total);
		
		System.out.println("Suggested tips: ");
		
		System.out.print("10%: ");
		System.out.printf("$%.2f\n", (tipRate1*total));
		
		System.out.print("15%: ");
		System.out.printf("$%.2f\n", (tipRate2*total));
		
		System.out.print("20%: ");
		System.out.printf("$%.2f\n", (tipRate3*total));
		
		System.out.printf("\nThank you!\n");
		System.out.printf("=====================================");
		
		keyboard.close();

	}

}
