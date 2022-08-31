package com.kodilla.bank.homework;

//na zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia, jeśli użytkownik wpłacił
// pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
// Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.
public class CashMachine {

    private int[] cashMachine;
    private int size;


    public CashMachine() {
        this.cashMachine = new int[0];
        this.size = 0;

    }

    public CashMachine(int i, int i1, double v, double v1) {
    }

    public void add(int money) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashMachine, 0, newTab, 0, cashMachine.length);
        newTab[this.size - 1] = money;
        this.cashMachine = newTab;

    }

    public int balance() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + cashMachine[i];
        }
        return sum;
    }

    public int numberOfTransaction() {
        return size;
    }
    public int numberOfNegativeTransactions(){
        int negativeTransactions=0;
        for (int i=0;i<size;i++){
            if (this.cashMachine[i]<0){
                negativeTransactions++;
            }
        }
return negativeTransactions;
    }
    public int numberOfPositiveTransactions() {
        int positiveTransactions = 0;
        for (int i = 0; i < size; i++) {
            if (this.cashMachine[i] > 0) {
                positiveTransactions++;
            }
        }
        return positiveTransactions;
    }
    public int sumOfPositiveTransactions() {
        int sumOfPositiveTransactions = 0;
        for (int i = 0; i < size; i++) {
            if (this.cashMachine[i] > 0) {
                sumOfPositiveTransactions = sumOfPositiveTransactions + this.cashMachine[i];
            }
        }
        return sumOfPositiveTransactions;
    }
    public int sumOfNegativeTransaction() {
        int sumOfNegativeTransactions = 0;
        for (int i = 0; i < size; i++) {
            if (this.cashMachine[i] < 0) {
                sumOfNegativeTransactions = sumOfNegativeTransactions + this.cashMachine[i];
            }
        }
        return sumOfNegativeTransactions;
    }
}
