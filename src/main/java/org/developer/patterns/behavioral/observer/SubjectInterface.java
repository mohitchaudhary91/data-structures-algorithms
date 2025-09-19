package org.developer.patterns.behavioral.observer;

public interface SubjectInterface {

    void add(ObserverInterface o);
    void remove(ObserverInterface o);
    void notifyObserver();
}
