package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.count += 1;  
        this.sum += number;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        return 1.0 * this.sum / this.count;
    }
}
