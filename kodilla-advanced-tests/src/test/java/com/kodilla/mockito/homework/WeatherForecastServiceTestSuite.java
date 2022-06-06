package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherForecastServiceTestSuite {
    WeatherForecastService weatherForecastService;
    Person personA;
    Person personB;
    Location locationA;
    Location locationB;
    Notification notification;
    WeatherAlert weatherAlert;

    @BeforeEach
    public void setUp() {
        this.weatherForecastService = new WeatherForecastService();
        personA = Mockito.mock(Person.class);
        personB = Mockito.mock(Person.class);
        locationA = Mockito.mock(Location.class);
        locationB = Mockito.mock(Location.class);
        this.notification = Mockito.mock(Notification.class);
        this.weatherAlert = Mockito.mock(WeatherAlert.class);

    }

    @Test
    public void savedPersonToParticularLocationShouldReceiveAlert() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.addPersonToParticularLocation(locationB, personA);
        weatherForecastService.addPersonToParticularLocation(locationB, personB);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationB, weatherAlert);

        Mockito.verify(personA, Mockito.times(1)).receive(weatherAlert);
    }

    @Test
    public void subscriberShouldReceiveNotification() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.addPersonToParticularLocation(locationB, personA);
        weatherForecastService.sendNotificationToAllUsers(notification);
        Mockito.verify(personA, Mockito.atLeastOnce()).receive(notification);
    }

    @Test
    public void personShouldNotReceiveAlertAfterUnsubscribeParticularLocation() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.addPersonToParticularLocation(locationA, personB);
        weatherForecastService.removePersonFromParticularLocation(personB, locationA);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationA, weatherAlert);

        Mockito.verify(personB, Mockito.never()).receive(weatherAlert);
        Mockito.verify(personA, Mockito.times(1)).receive(weatherAlert);
    }

    @Test
    public void personShouldNotReceiveNotificationAfterUnsubscribeAllLocations() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.addPersonToParticularLocation(locationB, personA);
        weatherForecastService.removePersonFromAllLocation(personA);
        weatherForecastService.sendNotificationToAllUsers(notification);
        Mockito.verify(personA, Mockito.never()).receive(notification);

    }

    @Test
    public void alertsForPersonInParticularLocationShouldBeGivenOnlyToPersonFromThatLocation() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.addPersonToParticularLocation(locationB, personB);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationA, weatherAlert);
        Mockito.verify(personB, Mockito.times(0)).receive(weatherAlert);
        Mockito.verify(personA, Mockito.times(1)).receive(weatherAlert);
    }


    @Test
    public void itIsPossibleToSendNotificationToAll() {
        weatherForecastService.addPersonToParticularLocation(locationA, personB);
        weatherForecastService.addPersonToParticularLocation(locationB, personA);
        weatherForecastService.sendNotificationToAllUsers(notification);
        Mockito.verify(personB, Mockito.times(1)).receive(notification);
        Mockito.verify(personA, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldNotSendAlertForDeletedLocation() {
        weatherForecastService.addPersonToParticularLocation(locationA, personA);
        weatherForecastService.removeParticularLocation(locationA);
        weatherForecastService.sendWeatherAlertToParticularLocation(locationA, weatherAlert);
        Mockito.verify(personA, Mockito.never()).receive(weatherAlert);
    }
}