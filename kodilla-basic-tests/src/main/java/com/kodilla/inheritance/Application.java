package com.kodilla.inheritance;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;

public class Application {
    public static void main(String[] args) {
        CashMachine cashMachine1=new CashMachine();

        CashMachine cashMachine2= new CashMachine();
        cashMachine2.add(200);

        CashMachine[] cashMachines={cashMachine1,cashMachine2};

        Bank bank = new Bank(cashMachines);
        System.out.println(bank.balance());
        System.out.println(bank.avgOfNegativeTransactions());

        //Car car = new Car(4,5) ;
        //car.turnOnLights();

       // Convertible convertible=new Convertible(4,2);
       // convertible.displayNumberOfSeats();
       }
    }

