package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherForecastServiceTestSuite {

    @Test
    public void savedPersonToParticularLocationShouldReceiveAlert() {
        WeatherForecastService weatherForecastService = new WeatherForecastService();
        WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
        Person personA = Mockito.mock(Person.class);
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);

        weatherForecastService.addPersonToParticularLocation(personA, locationA);
        weatherForecastService.addPersonToParticularLocation(personA, locationB);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationA, weatherAlert);

        Mockito.verify(personA, Mockito.times(1)).receive(weatherAlert);
    }
    @Test
    public void subscriberShouldReceiveNotification(){
        WeatherForecastService weatherForecastService = new WeatherForecastService();
        Notification notification = Mockito.mock(Notification.class);
        Person personA = Mockito.mock(Person.class);
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);

        weatherForecastService.addPersonToParticularLocation(personA, locationA);
        weatherForecastService.addPersonToParticularLocation(personA, locationB);
//        Mockito.when(personA.receivedNotification()).thenReturn(true);
        weatherForecastService.sendNotificationToAllUsers(notification);
        Mockito.verify(personA, Mockito.atLeastOnce()).receive(notification);
    }
    @Test
    public void personShouldNotReceiveAlertAfterUnsubscribeParticularLocation() {
        WeatherForecastService weatherForecastService = new WeatherForecastService();
        WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
        Person personA = Mockito.mock(Person.class);
        Location locationA = Mockito.mock(Location.class);

        weatherForecastService.addPersonToParticularLocation(personA, locationA);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationA,weatherAlert);
        weatherForecastService.removePersonFromParticularLocation(locationA);
        Mockito.verify(personA, Mockito.times(0)).receive(weatherAlert);
    }

    @Test
    public void personShouldNotReceiveNotificationAfterUnsubscribeAllLocations() {
        WeatherForecastService weatherForecastService = new WeatherForecastService();
        Notification notification = Mockito.mock(Notification.class);
        Person personA = Mockito.mock(Person.class);
        Location locationA = Mockito.mock(Location.class);
        Location locationB = Mockito.mock(Location.class);
        Location locationC = Mockito.mock(Location.class);

        weatherForecastService.addPersonToParticularLocation(personA, locationA);
        weatherForecastService.addPersonToParticularLocation(personA, locationB);
        weatherForecastService.addPersonToParticularLocation(personA, locationC);
        weatherForecastService.removePersonFromAllLocation(personA);
        weatherForecastService.sendNotificationToAllUsers(notification);
        Mockito.verify(personA, Mockito.times(0)).receive(notification);

    }

    @Test
    public void notificationForPersonInParticularLocationShouldBeGivenOnlyToPersonFromThatLocation() {

    }

    @Test
    public void itIsPossibleToSendNotificationToAll() {

    }

    @Test
    public void shouldDeletingLocation() {

    }
}