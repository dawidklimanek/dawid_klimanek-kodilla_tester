package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings ={"PaL5-gtA_*", "Okno_na^swiat", "sT-0_p*A"})
    public void shouldValidateUsername(String username){
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource (strings ={"nicniewychodzi@mi.tu", "koduj_dalej@kod.pl", "Parametry.dane@one.de"} )
    public void shouldValidateEmail(String email){
        assertTrue(validator.validateEmail(email));
    }

}