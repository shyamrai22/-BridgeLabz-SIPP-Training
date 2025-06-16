package ArraysProblems;

import java.util.*;

public class MultiplicationTableFull {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        int[] table = new int[10]; 

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + table[i]);
        }
        
        sc.close();
    }
}
