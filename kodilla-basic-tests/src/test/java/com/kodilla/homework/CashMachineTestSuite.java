package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransaction();
        assertEquals(0, transaction.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        cashMachine.add(2);

        int[] transaction = cashMachine.getTransaction();
        assertEquals(2, transaction.length);
        assertEquals(400, transaction[0]);
        assertEquals(2, transaction[1]);
    }
}
   // @Test
    //public void shouldCalculateAverage(){
      //  Grades grades=new Grades();
       // grades.add(4);
       // grades.add(2);
      //  grades.add(5);
       // assertEquals(3.66,grades.getAvarage(),0.01);
   // }
   // @Test
   // public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
   /// //    Grades grades = new Grades();
    //    assertEquals(0,grades.getAvarage(),0.0001);
    //}
//}
