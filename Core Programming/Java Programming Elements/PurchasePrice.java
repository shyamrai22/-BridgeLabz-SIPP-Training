package java_programming_elements;

import java.util.*;
public class PurchasePrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);

        sc.close();

	}

}
