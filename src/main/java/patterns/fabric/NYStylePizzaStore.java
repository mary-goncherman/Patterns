package main.java.patterns.fabric;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
