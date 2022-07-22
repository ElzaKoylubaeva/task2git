package ru.koylubaevaem.task2git;

public class Main {
    public static final int SIZE = 30;

    public static void main(String[] args) {

        int[] sales = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            sales[i] = (int) (Math.random() * 100);
        }

        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println("The highest monthly sales " + max);

        double avg = salesManager.average();
        System.out.println("Truncated average meaning " + avg);
    }
}

