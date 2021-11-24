package main.java.patterns.decoratorr;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
