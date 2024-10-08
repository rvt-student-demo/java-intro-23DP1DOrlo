package lv.rvt;

public class starsign {
    public static void main(String[] agrs){
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        printSquare(3);
        System.out.println("");
        printRectangle(5, 2);
        System.out.println("");
        printTriangle(4);
    }

    public static void printStars(int number){
        for(int i = 1; i <= number;i++){
            System.out.print('*');
        }
        System.out.println("");
    }
    public static void printSquare(int squareSize){
        for(int i = 0; i < squareSize; i++){
            for(int a = 0; a < squareSize; a++)
            System.out.print("*");
            System.out.println("");
        }
    }
    public static void printRectangle(int width, int height){
        for(int i = 1; i <= height; i++){
            for(int b = 1; b < width; b++){
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
    public static void printTriangle(int triangleSize){
        for(int i = 0; i <= triangleSize; i++){
            printStars(i);
                }
    }
    

}
