package lv.rvt;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundredsek;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredsek = new ClockHand(100);
    }

    public void advance() {
        this.hundredsek.advance();
        if(this.hundredsek.value() == 0){
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredsek;
    }
}
