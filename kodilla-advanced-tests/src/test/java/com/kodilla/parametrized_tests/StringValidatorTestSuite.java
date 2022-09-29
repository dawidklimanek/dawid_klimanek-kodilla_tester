package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator() ;
        @Test
        public void shouldReturnFalseIfStringIsNotEmpty() {
            assertFalse(validator.isBlank("test"));
        }
        @ParameterizedTest
        @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text){
            assertFalse(validator.isBlank(text));
        }
        @Test
        public void shouldReturnTrueIfStringHasOnlySpaces(){
           assertTrue(validator.isBlank("   "));
        }
        @ParameterizedTest
        @NullSource
        public void shouldReturnTrueIfStringIsNull(String text){
            assertTrue(validator.isBlank(text));
        }
    }