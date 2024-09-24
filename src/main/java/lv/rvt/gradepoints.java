package lv.rvt;
import java.util.Scanner;

public class gradepoints {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int number = Integer.valueOf(scanner.nextLine());
        
        
        if (number > 0 && number<49){
            System.out.println("Grade: failed");
        }else if(number > 49 && number <59){
            System.out.println("Grade: 1");
        }else if(number > 59 && number <69){
            System.out.println("Grade: 2");
        }else if(number > 69 && number <79){
            System.out.println("Grade: 3");
        }else if(number > 79 && number <89){
            System.out.println("Grade: 4");
        }else if(number > 89 && number <=100){
            System.out.println("Grade: 5");
        }else if(number > 100){
            System.out.println("Grade: incredible!");

        }else{
            System.out.println("Grade: impossible!");
    

       
    }

}} 