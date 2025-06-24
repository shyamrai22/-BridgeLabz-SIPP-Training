package Built_In_Methods;

import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {
        int[] numbers = getInput();
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);
        displayResult(numbers[0], numbers[1], gcd, lcm);
    }

    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();
        sc.close();
        return nums;
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0)
            return a;
        return calculateGCD(b, a % b);
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
