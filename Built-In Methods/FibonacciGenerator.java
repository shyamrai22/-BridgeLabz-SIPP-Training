package Built_In_Methods;

import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        int n = getInput();
        generateFibonacci(n);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        return sc.nextInt();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
