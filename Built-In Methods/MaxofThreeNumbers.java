package Built_In_Methods;

import java.util.Scanner;

public class MaxofThreeNumbers {

    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        displayResult(max);
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        sc.close();
        return nums;
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void displayResult(int max) {
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
