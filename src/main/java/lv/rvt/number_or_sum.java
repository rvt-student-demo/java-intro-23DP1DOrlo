package lv.rvt;
import java.util.Scanner;


public class number_or_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int number_summa = 0;
        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            number++;
            number_summa += input;
            
    }
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: "+ number_summa);
}
}
