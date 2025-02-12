package lv.rvt;

public class App {
    public static void main(String[] args) {

        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);


        ProductWarehouseWithHistory juiceWithHistory = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juiceWithHistory.takeFromWarehouse(11.3);
        System.out.println(juiceWithHistory.getName());
        System.out.println(juiceWithHistory);
        System.out.println(juiceWithHistory.history());
        juiceWithHistory.addToWarehouse(1.0);
        System.out.println(juiceWithHistory.history());


        juiceWithHistory.printAnalysis();
    }
}