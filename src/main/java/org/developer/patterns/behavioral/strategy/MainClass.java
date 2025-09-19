package org.developer.patterns.behavioral.strategy;

public class MainClass {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar();
        sportsCar.drive();

        Car normalCar = new NormalCar();
        normalCar.drive();

        Car offRoadCar = new OffRoadCar();
        offRoadCar.drive();

        /* resolves the code duplicate in child classes if they tend to share similar capabilities
            like in here where off-road and sports car share sport drive capability. So used strategy pattern has a
            relationship with a car
         */
    }
}
