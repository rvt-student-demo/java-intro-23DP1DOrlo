package lv.rvt;

public class App {
    public static void main(String[] args) throws Exception {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println("Part 1");
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

        System.out.println("Part 2");
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        System.out.println("Part 3");
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt)); // true
    }
}