package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

public class Bank {
    private int[] bankCashMachineTab;
    private int size;


    public Bank() {
        this.bankCashMachineTab = new int[0];
        this.size = 0;

    }

    public void add(int cashMachine) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(bankCashMachineTab, 0, newTab, 0, bankCashMachineTab.length);
        newTab[this.size - 1] = cashMachine;
        this.bankCashMachineTab = newTab;
    }
    public int[]getBankCashMachineTab(){
        return bankCashMachineTab;
}
    private CashMachine numberOfNegativeTransactions;
    private CashMachine numberOfPositiveTransactions;
    private CashMachine sumOfPositiveTransactions;
    private  CashMachine sumOfNegativeTransaction;

    public Bank (String name){

        this.numberOfNegativeTransactions=new CashMachine();
        this.numberOfPositiveTransactions=new CashMachine();
        this.sumOfPositiveTransactions= new CashMachine();
        this.sumOfNegativeTransaction= new CashMachine();
    }

}
