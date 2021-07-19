package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cashmachine1 = new CashMachine();
        CashMachine cashmachine2 = new CashMachine();
        Bank bank = new Bank(cashmachine1, cashmachine2);
        cashmachine1.addTransaction(1000);
        cashmachine1.addTransaction(300);
        cashmachine1.addTransaction(-200);
        cashmachine1.addTransaction(500);
        cashmachine1.addTransaction(-100);
        System.out.println(bank.getSaldo());
        System.out.println(bank.getCountIn());
        System.out.println(bank.getCountOut());
        System.out.println(bank.getAvgIn());
        System.out.println(bank.getAvgOut());
    }
}
