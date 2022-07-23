package com.kodilla.exception;

public class Examples {
    public static void main(String[] args) {

        //second example
        int numberOfRounds = UserDialogs.getNumberOfRounds();
        System.out.println("Number of rounds: "+ numberOfRounds);

        //third example
        AirportRepository airportRepository = new AirportRepository();

        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException exception) {
            System.out.println("Sorry, this airport cannot be served by our airlines.");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
        //first example
        String username = "John";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}