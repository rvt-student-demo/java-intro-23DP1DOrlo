package lv.rvt;
import java.util.Scanner;


public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        for(int i = input; i < 101; i++) {
            System.out.println(i);
        }
    }
}

