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
        long min = sales[0];
        long max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            long sale = sales[i];
            if (sale < min) {
                min = sale;
            }
            if (sale > max) {
                max = sale;
            }
        }
        int sum = 0;
        int count = 0;
        for (long sale : sales) {
            if (sale != min && sale != max) {
                sum += sale;
                count++;
            }
        }
        return count == 0 ? 0.0 : 1.0 * sum / count;
    }
}
