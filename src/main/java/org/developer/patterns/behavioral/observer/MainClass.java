package org.developer.patterns.behavioral.observer;

public class MainClass {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(1);
        MilitaryRadar militaryRadar = new MilitaryRadar(weatherStation);
        CivilianRadar civilianRadar = new CivilianRadar(weatherStation);

        weatherStation.setTemp(7);
        
        civilianRadar.exit();

        weatherStation.setTemp(9);
    }
}
