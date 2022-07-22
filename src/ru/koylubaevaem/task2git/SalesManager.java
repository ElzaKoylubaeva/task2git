package ru.koylubaevaem.task2git;

public class SalesManager {

    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double average() {
        int min = sales[0];
        int max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            int sale = sales[i];
            if (sale < min) {
                min = sale;
            }
            if (sale > max) {
                max = sale;
            }
        }
        int sum = 0;
        int count = 0;
        for (int sale : sales) {
            if (sale != min && sale != max) {
                sum += sale;
                count++;
            }
        }
        return count == 0 ? 0.0 : 1.0 * sum / count;
    }
}
