package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // Account matthewsAccount = new Account("Matthews's account", 1000.00);
        // Account mySwissAccount = new Account("My account", 0);

        // System.out.println("Initial state");
        // System.out.println(matthewsAccount);
        // System.out.println(mySwissAccount);

        // matthewsAccount.withdraw(100);
        // System.out.println("The balance of Matthews's account is now: " + matthewsAccount.balance());
        // mySwissAccount.deposit(100);
        // System.out.println("The balance of my account is now: " + mySwissAccount.balance());

        // System.out.println("End state");
        // System.out.println(matthewsAccount);
        // System.out.println(mySwissAccount);
        // ------------------------------
            // Student matt = new Student();
            // matt.play();
            // --------------------------
        // Product product = new Product("Banana", 1.1,13);
        // Product product2 = new Product("Maize", 1.6,10);
        // product.printProduct();
        // product2.printProduct();
        // ------------------------------
            // Person ada = new Person("Ada");
            // Person antti = new Person("Antti");
            // Person martin = new Person("Martin");
    
            // ada.printPerson();
            // antti.printPerson();
            // martin.printPerson();
        // ------------------------------
        // Door alexander = new Door();
        
        // alexander.knock();
        // alexander.knock();
        // ------------------------------
        // Debt mortgage = new Debt(120000.0, 1.01);
        // mortgage.printBalance();

        // mortgage.waitOneYear();
        // mortgage.printBalance();

        // int years = 0;

        // while (years < 20) {
        //     mortgage.waitOneYear();
        //     years = years + 1;
        // }

        // mortgage.printBalance();
        // ------------------------------
        // Teacher first = new Teacher();
        // Teacher second = new Teacher();
        // Teacher third = new Teacher();

        // double average = (first.grade() + second.grade() + third.grade()) / 3.0;

        // System.out.println("Grading average " + average);
        // ------------------------------
        // Song garden = new Song("In The Garden", 10910);
        // System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
        // ------------------------------
        // Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        // Scanner reader = new Scanner(System.in);

        // System.out.println("How old are you?");
        // int age = Integer.valueOf(reader.nextLine());

        // System.out.println();
        // if (age >= chipmunks.ageRating()) {
        //     System.out.println("You may watch the film " + chipmunks.name());
        // } else {
        //     System.out.println("You may not watch the film " + chipmunks.name());
        // }
        // ----------------------------------
        // Animal animal1 = new Animal("Cat");
        // Animal animal2 = new Animal("Dog");

        // System.out.println(animal1);
        // System.out.println(animal2);
        // String animalAsString = animal1.toString();
        // ----------------------------
        Agent bond = new Agent("James", "Bond");
        System.out.println(bond);        
    }
}