package java_programming_elements;

import java.util.*;
public class DistanceConverter02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km2 = sc.nextDouble();
        double miles2 = km2 / 1.6;
        System.out.println("The total miles is " + miles2 + " mile for the given " + km2 + " km");
        
        sc.close();

	}

}
