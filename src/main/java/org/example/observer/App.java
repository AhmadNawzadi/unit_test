package org.example.observer;

public class App {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);
        station.setHumidity(150);
    }
}
