package lv.rvt;
import java.util.Scanner;


public class sayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i < (times+1);i++){
            printText();
        }
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}