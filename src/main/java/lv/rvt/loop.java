package lv.rvt;
import java.util.Scanner;

public class loop {
          
            public static void main(String[] args) {               
    
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Insert positive integers");
                int number = Integer.valueOf(scanner.nextLine());
            
                if (number <= 0) {
                    System.out.println("Unfit number! Try again.");
                    continue;
                }
            
                System.out.println("Your input was " + number);
            }       
}}