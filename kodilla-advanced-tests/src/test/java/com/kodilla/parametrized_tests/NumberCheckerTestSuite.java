package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestSuite {

    private NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {0,3,6,-3,-12,15})
    public void shouldReturnTrueIfNumberEqualsThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
   }
    //@Test
    //public void shouldReturnTrueIfNumberIsAMultipleOfThree() {
      //  boolean result = numberChecker.isDivisibleByThree(12);
        //assertTrue(result);
    //}
    //@Test
    //public void shouldReturnTrueIfNumberIsEqualsZero() {
      //  boolean result = numberChecker.isDivisibleByThree(0);
        //assertTrue(result);
    //}
    //@Test
    //public void shouldReturnTrueIfNumberIsANegativeMultipleOfThree(){
      //  boolean result = numberChecker.isDivisibleByThree(-6);
        //assertTrue(result);
    //}
        @ParameterizedTest
        @ValueSource(ints ={-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}
