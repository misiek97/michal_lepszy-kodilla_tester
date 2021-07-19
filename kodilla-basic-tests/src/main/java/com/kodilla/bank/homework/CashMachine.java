package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions = new double[100];
    private int count = 0;

    void addTransaction(int value) {
        transactions[count] = value;
        count++;
    }

    public double getSaldo() {
        double sum = 0;
        for (int n = 0; n < count; n++) {
            sum += transactions[n];
        }
        return sum;
    }

    int getCountIn() {
        int sum = 0;
        for (int n = 0; n < count; n++) {
            if (transactions[n] > 0)
                sum++;
        }
        return sum;
    }

    int getCountOut() {
        int sum = 0;
        for (int n = 0; n < count; n++) {
            if (transactions[n] < 0)
                sum++;
        }
        return sum;
    }

    double getSaldoIn() {
        int sum = 0;
        for (int n = 0; n < count; n++) {
            if (transactions[n] > 0)
                sum += transactions[n];
        }
        return sum;
    }

    public double getSaldoOut() {
        int sum = 0;
        for (int n = 0; n < count; n++) {
            if (transactions[n] < 0)
                sum += transactions[n];
        }
        return sum;
    }
}
