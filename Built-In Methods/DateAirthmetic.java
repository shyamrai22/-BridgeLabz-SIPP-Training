package Built_In_Methods;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAirthmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate updated = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + updated);
        
        scanner.close();
    }
}
