package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecastService {
    private Person person;
    private Location location;
    private Map<Location, Person> locationsOfPersons = new HashMap<>();


    public void addPersonToParticularLocation(Person person, Location location) {
        this.locationsOfPersons.put(location, person);

    }

    public void sendWeatherAlertToParticularLocation(Location location, WeatherAlert weatherAlert) {
        for (Map.Entry<Location, Person> personInLocationAtRisk : this.locationsOfPersons.entrySet()) {
            if (personInLocationAtRisk.getKey().equals(location)) {
                personInLocationAtRisk.getValue().receive(weatherAlert);
            }
        }
    }

    public void sendNotificationToAllUsers(Notification notification) {
        for (Map.Entry<Location, Person> personInLocation : this.locationsOfPersons.entrySet()) {
                personInLocation.getValue().receive(notification);
        }
    }

    public void removePersonFromParticularLocation(Location location) {
        this.locationsOfPersons.remove(this.person, location);
    }
    public void removePersonFromAllLocation(Person person){
            this.locationsOfPersons.remove(person, this.location);

    }

}
