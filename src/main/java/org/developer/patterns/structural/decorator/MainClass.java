package org.developer.patterns.structural.decorator;

public class MainClass {

    public static void main(String[] args) {
        BasePizza pizza = new FarmhousePizza();
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraMushroom(pizza);

        System.out.println("Total cost:" + pizza.cost());
    }
}
