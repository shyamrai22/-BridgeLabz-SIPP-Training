package java_programming_elements;

import java.util.*;

public class YardsAndMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double feetDistance = sc.nextDouble();
        double yards = feetDistance / 3;
        double miles3 = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles3);
        
        sc.close();
	}

}
