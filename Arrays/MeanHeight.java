package ArraysProblems;

import java.util.*;

public class MeanHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0.0;

		for (int i = 0; i < heights.length; i++) {
			heights[i] = sc.nextDouble();
			sum += heights[i];
		}
		sc.close();

		double mean = sum / 11;
		System.out.println("Mean height of the football team: " + mean);
	}
}
