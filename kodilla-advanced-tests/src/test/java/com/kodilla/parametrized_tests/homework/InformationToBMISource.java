package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class InformationToBMISource {
    static Stream<Arguments> provideNumbersForTestingBMIResult() {
        return Stream.of(
                Arguments.of(1.75, 45.6, 14.89, "Very severely underweight"),
                Arguments.of(1.7, 45.7, 15.81, "Severely underweight"),
                Arguments.of(1.66, 50.8, 18.44, "Underweight"),
                Arguments.of(1.78, 78.8, 24.87, "Normal (healthy weight)"),
                Arguments.of(1.78, 79.2, 25, "Overweight"),
                Arguments.of(1.7, 100, 34.6, "Obese Class I (Moderately obese)"),
                Arguments.of(1.69, 100, 35.01, "Obese Class II (Severely obese)"),
                Arguments.of(1.75, 137.5, 44.9, "Obese Class III (Very severely obese)"),
                Arguments.of(1.75, 138.1, 45.09, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.61, 155.5, 59.99, "Obese Class V (Super Obese)"),
                Arguments.of(1.9, 240.89, 66.73, "Obese Class VI (Hyper Obese)")
        );
    }
}