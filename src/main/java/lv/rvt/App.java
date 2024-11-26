package lv.rvt;

import java.io.BufferedReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        BufferedReader reader = Helper.getReader("persons.csv");

        String line;
        reader.readLine();
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}