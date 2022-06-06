package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherForecastService {
    private Map<Location, Set<Person>> locationsOfPersons = new HashMap<>();

    public void addPersonToParticularLocation(Location location, Person person) {
        if (!this.locationsOfPersons.containsKey(location)) {
            this.locationsOfPersons.put(location, new HashSet<>(List.of(person)));
        } else {
            locationsOfPersons.get(location).add(person);
        }
    }

    public void sendWeatherAlertToParticularLocation(Location location, WeatherAlert weatherAlert) {
        if (this.locationsOfPersons.containsKey(location)) {
            locationsOfPersons.get(location).forEach(person -> person.receive(weatherAlert));
        }
    }

    public void sendNotificationToAllUsers(Notification notification) {
    locationsOfPersons.values()
            .stream()
            .flatMap(Collection::stream).distinct()
            .forEach(person->person.receive(notification));
    }

    public void removePersonFromParticularLocation(Person person, Location location) {
        if (locationsOfPersons.containsKey(location)) {
            locationsOfPersons.get(location).remove(person);
        }
    }

    public void removeParticularLocation(Location location){
        if(locationsOfPersons.containsKey(location)){
            locationsOfPersons.remove(location);
        }
    }

    public void removePersonFromAllLocation(Person person) {
        for (Set<Person> people : this.locationsOfPersons.values())  {
           people.remove(person);
            }
        }
    }