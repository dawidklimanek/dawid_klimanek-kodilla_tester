package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {
    private Set<Integer> convert(String input) {
        String[] strings = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : strings) {
            numbers.add(Integer.parseInt(number));

        }
        return numbers;

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/goodNumbers.csv")

    public void shouldCheckWinsWorks(String value)
            throws InvalidNumbersException {
        Set<Integer> numbers = convert(value);
        GamblingMachine gamblingMachine = new GamblingMachine();
        int result = gamblingMachine.howManyWins(numbers);
        Assertions.assertTrue(result >= 0 & result <= 6);


    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongNumbers.csv")
    public void shouldErrorIfAddOneGoodValue(String value) {
        Set<Integer> numbers = convert(value);
        GamblingMachine gamblingMachine = new GamblingMachine();


        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }
}

