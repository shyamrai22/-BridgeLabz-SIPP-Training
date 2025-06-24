package Built_In_Methods;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        int number = getInput();
        boolean result = isPrime(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        sc.close();
        return n;
        
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void displayResult(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
