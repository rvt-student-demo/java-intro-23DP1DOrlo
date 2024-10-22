package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class pashol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){ 
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }   
            numbers.add(number);
        }
        
        System.out.print("From where? ");
        int start = scanner.nextInt();
        System.out.print("To where? ");
        int fin = scanner.nextInt();

        if (start < 0 || fin >= numbers.size() || start > fin) {
            System.out.println("Index is not correct!!!");
        } 
        else {
            for(int i = start; i <= fin; i++){
                System.out.println(numbers.get(i));
            }
        scanner.close();
    }
    }
}
