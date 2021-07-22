package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine cashmachine1 = new CashMachine();
    CashMachine cashmachine2 = new CashMachine();
    Bank bank = new Bank(cashmachine1, cashmachine2);

    @Test
    public void shouldHaveZeroOnSaldoWithNoTransaction() {
        double value = bank.getSaldo();
        assertEquals(0, value);
    }

    @Test
    public void shouldHaveZeroOnContInWithNoTransaction() {
        double value = bank.getCountIn();
        assertEquals(0, value);
    }

    @Test
    public void shouldHaveZeroOnContOutWithNoTransaction() {
        double value = bank.getCountOut();
        assertEquals(0, value);
    }

    @Test
    public void shouldHaveZeroOnAverageInWithNoTransaction() {
        double value = bank.getAvgIn();
        assertEquals(0, value);
    }

    @Test
    public void shouldHaveZeroOnAverageOutWithNoTransaction() {
        double value = bank.getAvgOut();
        assertEquals(0, value);
    }

    @Test
    public void shouldHaveZeroSaldoWithFourTransactionsThreeInOneOut() {
        cashmachine1.addTransaction(500);
        cashmachine1.addTransaction(100);
        cashmachine2.addTransaction(-1000);
        cashmachine1.addTransaction(400);

        double saldo = bank.getSaldo();
        double countIn = bank.getCountIn();
        double countOut = bank.getCountOut();

        assertEquals(0, saldo);
        assertEquals(3, countIn);
        assertEquals(1, countOut);
    }

    @Test
    public void shouldHaveZeroTransactionsInWhileTwoOut() {
        cashmachine1.addTransaction(-500);
        cashmachine1.addTransaction(-100);
        cashmachine2.addTransaction(-1000);

        double saldo = bank.getSaldo();
        double countIn = bank.getCountIn();
        double countOut = bank.getCountOut();

        assertEquals(-1600, saldo);
        assertEquals(0, countIn);
        assertEquals(3, countOut);
    }

    @Test
    public void shouldCalculateAvgOnSevenTransactions() {
        cashmachine1.addTransaction(200);
        cashmachine1.addTransaction(800);
        cashmachine2.addTransaction(300);
        cashmachine1.addTransaction(700);
        cashmachine1.addTransaction(-600);
        cashmachine1.addTransaction(-800);
        cashmachine1.addTransaction(-100);

        double saldo = bank.getSaldo();
        double avgIn = bank.getAvgIn();
        double avgOut = bank.getAvgOut();

        assertEquals(500, saldo);
        assertEquals(500, avgIn, 0.001);
        assertEquals(-500, avgOut, 0.001);
    }

}
