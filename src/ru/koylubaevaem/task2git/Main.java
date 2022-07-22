package ru.koylubaevaem.task2git;

public class Main {
    public static final int SIZE = 30;

    public static void main(String[] args) {

        long[] sales = new long[SIZE];
        for (int i = 0; i < SIZE; i++) {
            sales[i] = (long) (Math.random() * 100);
        }

        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println("The highest monthly sales " + max);
    }
}

