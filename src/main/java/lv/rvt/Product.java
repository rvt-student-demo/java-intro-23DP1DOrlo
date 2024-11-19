package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quant;
    private String location;
    private int weight;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quant = initialQuantity;
    }
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quant + "pcs");
    }

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }
}
