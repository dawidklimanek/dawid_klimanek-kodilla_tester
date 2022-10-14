package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestsuite {


    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.76, 85),"Overweight"),
                Arguments.of(new Person(1.54, 120),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.65, 57),"Normal (healthy weight)"),
                Arguments.of(new Person(1.57, 52), "Normal (healthy weight)"),
                Arguments.of(new Person(1.93, 48), "Very severely underweight"),
                Arguments.of(new Person(1.78, 150), "Obese Class IV (Morbidly Obese)")
            );

    }

    @ParameterizedTest
    @MethodSource(value = "provideDataForTestingBMI")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person, String text) {
        System.out.println(person.getBMI());
        assertEquals(text, person.getBMI());
    }

}