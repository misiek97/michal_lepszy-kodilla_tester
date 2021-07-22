package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines = new CashMachine[20];
    private int count = 0;

    public Bank(CashMachine... cashMachineTable) {
        for (CashMachine cashMachine : cashMachineTable) {
        cashMachines[count] = cashMachine;
        count++;
        }
    }

    double getSaldo() {
        double result = 0;
        for (int n = 0; n < count; n++) {
            result += cashMachines[n].getSaldo();
        }
        return result;
    }

    int getCountIn() {
        int result = 0;
        for (int n = 0; n < count; n++) {
            result += cashMachines[n].getCountIn();
        }
        return result;
    }

    int getCountOut() {
        int result = 0;
        for (int n = 0; n < count; n++) {
            result += cashMachines[n].getCountOut();
        }
        return result;
    }

    public double getAvgIn() {
        double sum = 0;
        int howMany = 0;
        for (int n = 0; n < count; n++) {
            sum += cashMachines[n].getSaldoIn();
            howMany += cashMachines[n].getCountIn();
        }
        return (howMany > 0) ? sum / howMany : 0;
    }

    public double getAvgOut() {
        double sum = 0;
        int howMany = 0;
        for (int n = 0; n < count; n++) {
            sum += cashMachines[n].getSaldoOut();
            howMany += cashMachines[n].getCountOut();
        }
        return (howMany > 0) ? sum / howMany : 0;
    }
}
