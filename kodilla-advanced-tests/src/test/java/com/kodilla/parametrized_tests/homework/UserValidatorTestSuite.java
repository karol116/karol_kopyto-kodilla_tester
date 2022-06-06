package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator user = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "    ", "   r ", "T", "re", "22", "3e", "@@@", "name@#!!"})
    public void shouldReturnFalseIfUsernameDoesNotContainsThreeLettersOrNumbersAtLeastWithoutSpecialChars(String username) {
        assertFalse(user.validateUserName(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {/*""*/ "  ", ".w...@.w", " nskd@kwq.soc", "asd.ds.@j72.pl", "name@dsads", "33@3.3", "nDa@121.6g7", "nad.sad@csa.gd@i34.pf", "needa#FT.cc", "ew453f.ef3@rew.8ew", "ajgh,bfdf@fee.few"})
    public void shouldReturnFalseIfEmailDoesNotContainsInSequence_LettersOrNumbersOrPeriodsDotsInside_AtSign_LettersOrNumbersOrPeriodsDotsInside_Dot_Letters(String email) {
        assertFalse(user.validateEmail(email));
    }
}