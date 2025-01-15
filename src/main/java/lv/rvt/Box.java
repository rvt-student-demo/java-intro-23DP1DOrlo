package lv.rvt;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }


    public Box(double side){
        this.height = side;
        this.length = side;
        this.width = side;
    }

    public double volume() {
        return height * width * length;
    }

    public double area() {
        return 2 * topArea() + 2 * faceArea() + 2 * sideArea();
    }

    public double faceArea(){
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double width(){
        return width;
    }

    public double height(){
        return height;
    }

    public double length(){
        return length;
    }

    public boolean nests(Box outsideBox){
        if(this.width < outsideBox.width &&
        this.height < outsideBox.height &&
        this.length < outsideBox.length){
            return true;
        }return false;
    }
}

