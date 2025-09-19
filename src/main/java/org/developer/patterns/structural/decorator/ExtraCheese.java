package org.developer.patterns.structural.decorator;

public class ExtraCheese extends PizzaDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 10;
    }
}
