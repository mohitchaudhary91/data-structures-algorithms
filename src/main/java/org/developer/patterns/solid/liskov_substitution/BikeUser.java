package org.developer.patterns.solid.liskov_substitution;

public class BikeUser {

    Bike bike;

    public BikeUser(Bike bike) {
        this.bike = bike;
    }

    public void rideBike() {
        bike.turnOnEngine();;
        bike.accelerate();

        /*
        Here if you see liskov substitution principle is breaking as two instance cannot be substituted
        with each other or cannot be replaced as bicycle is restricting the capability of parent class
        instead of extend it.
        So above logic will fail motorcycle instance is replaced by bicycle instance.
         */
    }
}
