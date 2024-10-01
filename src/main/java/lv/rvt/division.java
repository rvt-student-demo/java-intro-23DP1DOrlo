package lv.rvt;
import java.util.Scanner;

public class division {

        public static void main(String[] args) {
        divisibleByThreeInRange(2,10);
        }
        public static void divisibleByThreeInRange(int first, int second){
            for(int i = first;i<(second+1);i++){
                if(i % 3 == 0){
                    System.out.println(i);
                }
            }
        }
} 