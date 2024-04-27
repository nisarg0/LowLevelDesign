package DesignPatterns.observer;

import java.util.*;


// Observer Interface
interface Observer {
    void update();
}

// Observable Interface
// Here adding additional methods like getWeather and setWeather helped us get the detail from Observer
interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    void setWeather(String weather);
    String getWeather();
}

// Concrete Observable Class
class WeatherStation implements Observable {
    private List<Observer> observers;
    private String weather;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Logic here can be changed to notify only if there is a change in state...

    @Override
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    @Override
    public String getWeather() {
        return weather;
    }
}

// Concrete Observer Class
class PhoneDisplay implements Observer {
    private final Observable weatherStation;

    public PhoneDisplay(Observable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Phone Display: " + weatherStation.getWeather());
    }
}

// Concrete Observer Class
class ComputerDisplay implements Observer {
    private final Observable weatherStation;

    public ComputerDisplay(Observable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Computer Display: " + weatherStation.getWeather());
    }
}

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay(weatherStation);
        Observer computerDisplay = new ComputerDisplay(weatherStation);

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(computerDisplay);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Cloudy");
        weatherStation.setWeather("Rainy");

    }
}
