package org.developer.patterns.structural.decorator;

public class ExtraMushroom extends PizzaDecorator {

    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 15;
    }
}
