package lv.rvt;
import java.util.Scanner;


public class repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int sumnum = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give a numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
        if (number == -1){
            break;
        }if (number != -1){
            sumnum++;
            summa += number;
        }if(number % 2 == 0) {
            even++;
        }if(number % 2 == 1){
            odd++;
        }
    }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + summa);
        System.out.println("Numbers: " + sumnum);
        System.out.println("Average: " + ((double)summa / sumnum));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    }
}