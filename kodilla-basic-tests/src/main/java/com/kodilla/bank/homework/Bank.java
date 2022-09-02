package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;

    }

    public int avgOfNegativeTransactions() {
        int avgOfNegative = 0;
        int numberNegative = 0;
        for (CashMachine cashMachine : cashMachines) {
            avgOfNegative = avgOfNegative + cashMachine.sumOfNegativeTransaction();
            numberNegative = numberNegative + cashMachine.numberOfNegativeTransactions();

        }
        if (numberNegative == 0) {
            return avgOfNegative;
        }

        return (avgOfNegative / numberNegative);
    }

   public int avgOfPositiveTransaction() {
       int avgOfPositive = 0;
       int numberPositive = 0;
       for (CashMachine cashMachine : cashMachines) {
           avgOfPositive = avgOfPositive + cashMachine.sumOfPositiveTransactions();
           numberPositive = numberPositive + cashMachine.numberOfNegativeTransactions();

       }
       if (numberPositive == 0) {
           return avgOfPositive;
       }

       return (avgOfPositive / numberPositive);
   }

    public int sumOfNegativeTransaction() {
        int sumNegative = 0;
        for (CashMachine cashMachine : cashMachines) {
            sumNegative = sumNegative + cashMachine.sumOfNegativeTransaction();
        }
        return sumNegative;
    }

    public int balance() {
        int balance = 0;
        for (CashMachine cashMachine : cashMachines) {
            balance = balance + cashMachine.balance();

        }
        return balance;
    }
}


