package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in); // Izveidojam skaneri vienu reizi, un pielietojam visā programm
           
        System.out.println("Ievadiet 1. skaitli: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2. skaitli: ");
        int number2 = Integer.valueOf(scanner.nextLine());

        if (number1 > number2) {
            System.out.println("Lielākais skaitlis ir: " + number1);
        } 
        else if (number2 > number1) {
            System.out.println("Lielākais skaitlis ir: " + number2);
        }
    }

}