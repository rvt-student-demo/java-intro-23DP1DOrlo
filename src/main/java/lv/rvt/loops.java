package lv.rvt;
import java.util.Scanner;


public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        System.out.println("Write a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i < (input+1);i++) {
            summa = summa + i;
        }
        System.out.println(summa);
    }
}

