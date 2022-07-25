package ru.koylubaevaem.task2git;

public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double average() {
        if (sales.length <= 2) return 0.0;
        long min = sales[0];
        long max = sales[0];
        long sum = 0;
        for (int i = 1; i < sales.length; i++) {
            long sale = sales[i];
            if (sale < min) {
                min = sale;
            }
            if (sale > max) {
                max = sale;
            }
            sum += sale;
        }
        return 1.0 * (sum - min - max) / (sales.length - 2);
    }
}
