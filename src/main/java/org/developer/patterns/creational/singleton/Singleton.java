package org.developer.patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // no instance can be created directly by calling constructor
    }

    public synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /*

    Here we have a singleton class pattern which says that only instance can be created for that class.
    Constructor is marked private.
    Instance is marked private.
    getInstance() is exposed to fetch the instance of this class.

    This class is thread safe as synchronized is added. If you remove it, it will become thread unsafe.
     */
}
