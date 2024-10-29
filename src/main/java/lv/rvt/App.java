package lv.rvt;

public class App {
    public static void main(String[] args) {
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
        // product.printProduct();
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
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
        }
    }
    

