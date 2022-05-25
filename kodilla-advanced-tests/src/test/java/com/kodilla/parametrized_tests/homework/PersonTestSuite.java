package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = {"com.kodilla.parametrized_tests.homework.InformationToBMISource#provideNumbersForTestingBMIResult"})
    public void getCorrectBMIInformation(double height, double weight, double expectedBMIIndex, String expectedBMIInformation) {
        Person person = new Person(height, weight);
        assertEquals(expectedBMIInformation, person.getBMI());
    }
}