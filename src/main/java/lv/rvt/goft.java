package lv.rvt;
import java.util.Scanner;

public class goft {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number < 5000) {
            System.out.println("No tax!");
        } else if (number > 4999 && number < 25001) {
            System.out.println("Tax: " + (100+(number-5000)*0.08));
        } else if (number > 24999 && number < 55001) {
            System.out.println("Tex: " + (1700+(number-25000)*0.10));
        } else if (number > 54999 && number < 200001) {
            System.out.println("Tex: " + (4700+(number-55000)*0.12));
        } else if (number > 199999 && number < 1000001) {
            System.out.println("Tex: " + (22100+(number-200000)*0.15));
        } else if (number > 100000) {
            System.out.println("Tex: " + (142100+(number-1000000)*0.17));
        } 
}} 