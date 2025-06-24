package Built_In_Methods;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        char type = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        sc.close();

        if (type == 'C') {
            double fahrenheit = celsiusToFahrenheit(temp);
            displayResult(temp, fahrenheit, 'F');
        } else if (type == 'F') {
            double celsius = fahrenheitToCelsius(temp);
            displayResult(temp, celsius, 'C');
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void displayResult(double original, double converted, char targetUnit) {
        System.out.printf("Converted temperature: %.2f %c\n", converted, targetUnit);
    }
}
