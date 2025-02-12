package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) return 0;
        return history.stream().max(Double::compare).get();
    }

    public double minValue() {
        if (history.isEmpty()) return 0;
        return history.stream().min(Double::compare).get();
    }

    public double average() {
        if (history.isEmpty()) return 0;
        return history.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
