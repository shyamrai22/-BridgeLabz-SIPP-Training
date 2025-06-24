package Built_In_Methods;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase to check for palindrome: ");
        return sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
