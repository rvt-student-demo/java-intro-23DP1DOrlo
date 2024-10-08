package lv.rvt;

public class starsign {
    public static void main(String[] agrs){
        // Star Sign
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        printSquare(3);
        System.out.println("");
        printRectangle(5, 2);
        System.out.println("");
        printTriangle(4);

        // Advanced astrology
        printSpaces(4);
        System.out.println("");
        printTriangle2(4);
        System.out.println("");
        christmasTree(5);
    }

    public static void printStars(int number){
        for(int i = 0; i < number;i++){
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
    public static void printSpaces(int number_for_spaces) {
        for(int i = 0; i < number_for_spaces;i++){
            System.out.print(" ");
        }
        System.out.print("");
    }
    public static void printTriangle2(int triangeSize2){
        for(int i = 0; i <= triangeSize2; i++){
            printSpaces(triangeSize2 - i);
            printStars(i);
        }
    }
    public static void christmasTree(int heightTree) {
        for(int i = 0; i <= heightTree; i++){
            printSpaces(heightTree - i);
            printStars(2*i-1);
        }
        for(int i = 1; i < 3; i++){
            printSpaces(heightTree-2);
            printStars(3);
        }
    }

    

}
