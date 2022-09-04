package com.kodilla.bank.homework;

public class Bank {
    private int[] bank;
    private int size;
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {

    }

    public Bank() {
        this.bank = new int[0];
        this.size = 0;

    }

    public void add(int cashMachine) {// metody, która umożliwi dodanie elementów do tablicy z bankomatami
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(bank, 0, newTab, 0, bank.length);
        newTab[this.size - 1] = cashMachine;
        this.bank = newTab;
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

    public int sumOfNegativeTransaction() {//- metody liczącej liczbę transakcji związanych z wypłatą
        int sumNegative = 0;
        for (CashMachine cashMachine : cashMachines) {
            sumNegative = sumNegative + cashMachine.sumOfNegativeTransaction();
        }
        return sumNegative;
    }
    public int sumOfPositiveTransaction() {//- metoda licząca liczbę transakcji związaną z wpłatą pieniędzy
        int sumPositive = 0;
        for (CashMachine cashMachine : cashMachines) {
            sumPositive = sumPositive + cashMachine.sumOfNegativeTransaction();
        }
        return sumPositive;

}

    public int bilans() {// metody liczącej bilans banku
        int bilans = 0;
        for (CashMachine cashMachine : cashMachines) {
            bilans = bilans + cashMachine.balance();

        }
        return bilans;
    }
}


