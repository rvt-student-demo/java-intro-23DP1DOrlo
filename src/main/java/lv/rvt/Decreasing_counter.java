package lv.rvt;

public class Decreasing_counter {
    private int value; 

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue(){
        System.out.println("valxue: " + this.value);
    }

    public void decrement() {
        this.value -= 1;
    }
}
