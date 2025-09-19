package org.developer.patterns.behavioral.observer;

public class CivilianRadar implements ObserverInterface {

    private final WeatherStation weatherStation;

    public CivilianRadar(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println("Civilian radar --> Temp changed " + weatherStation.getTemp());
    }

    public void exit() {
        this.weatherStation.remove(this);
    }
}
