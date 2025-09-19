package org.developer.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements SubjectInterface {

    private int temp;
    private Set<ObserverInterface> observersList = new HashSet<>();

    public WeatherStation(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    @Override
    public void add(ObserverInterface o) {
        this.observersList.add(o);
    }

    @Override
    public void remove(ObserverInterface o) {
        this.observersList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (ObserverInterface o : observersList) {
            o.update();
        }
    }
}
