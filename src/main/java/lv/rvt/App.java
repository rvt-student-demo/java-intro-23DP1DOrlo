package lv.rvt;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Ievadi komandu (show, add, help, exit): ");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "show":
                    try {
                        ArrayList<Person> persons = PersonManager.getPersonList();
                        System.out.println("Personu saraksts:");
                        for (Person person : persons) {
                            System.out.println(person);
                        }
                    } catch (IOException e) {
                        System.out.println("Kļūda lasot CSV failu: " + e.getMessage());
                    }
                    break;

                case "add":
                    try {
                        System.out.print("Ievadi personas vārdu: ");
                        String name = scanner.nextLine();
                        System.out.print("Ievadi personas vecumu: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ievadi augumu (cm): ");
                        int height = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ievadi svaru (kg): ");
                        int weight = Integer.parseInt(scanner.nextLine());

                        // Pievieno datus CSV failam
                        BufferedWriter writer = new BufferedWriter(new FileWriter("persons.csv", true));
                        writer.write(name + ", " + age + ", " + height + ", " + weight);
                        writer.newLine();
                        writer.close();
                        System.out.println("Persona pievienota veiksmīgi!");
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Kļūda pievienojot personu: " + e.getMessage());
                    }
                    break;

                case "help":
                    System.out.println("Pieejamās komandas:");
                    System.out.println("show - parāda visas personas no CSV faila");
                    System.out.println("add - pievieno jaunu personu CSV failam");
                    System.out.println("help - parāda šo palīdzības ziņu");
                    System.out.println("exit - aptur programmas darbību");
                    break;

                case "exit":
                    System.out.println("Thanks, bye bye!");
                    running = false;
                    break;

                default:
                    System.out.println("Nezināma komanda. Ievadi 'help', lai redzētu pieejamās komandas.");
            }
        }

        scanner.close();
    }
}