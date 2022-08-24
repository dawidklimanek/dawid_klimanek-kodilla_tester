package com.kodilla.basic_assertion;
public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.asertEquals(13, sumResult);
        int subResult = calculator.sub(a, b);
        boolean subCorrect = ResultChecker.asertEquals(-3, subResult);
        double powResult= calculator.pow(a);
        System.out.println(powResult);
        //  if (correct) {
        // System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        //  }else{
        //  System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        //if (subCorrect) {
          //  System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        //} else {
         ///   System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }


