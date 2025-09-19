package org.developer.patterns.behavioral.observer;

public class MilitaryRadar implements ObserverInterface {

    private final WeatherStation weatherStation;

    public MilitaryRadar(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println("Military radar --> Temp changed " + weatherStation.getTemp());
    }
}
