package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(){
        cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(12345, 54321, 1000.0, 1200.0);
        cashMachines[1] = new CashMachine(98765, 56789, 200.0, 200.0);

}
    private CashMachine numberOfNegativeTransactions;
    private CashMachine numberOfPositiveTransactions;
    private CashMachine sumOfPositiveTransactions;
    private  CashMachine sumOfNegativeTransaction;
    private CashMachine balance;

    public Bank (String name){

        this.numberOfNegativeTransactions=new CashMachine();
        this.numberOfPositiveTransactions=new CashMachine();
        this.sumOfPositiveTransactions= new CashMachine();
        this.sumOfNegativeTransaction= new CashMachine();
        this.balance=new CashMachine();
    }

}
