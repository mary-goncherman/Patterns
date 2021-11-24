package main.java.patterns.fabric;

public abstract class PizzaStore {
    //SimplePizzaFactory factory;

   // public PizzaStore(SimplePizzaFactory factory) {
   //     this.factory = factory;
   // }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);//factory.createPizza(type);
        System.out.println(pizza.prepare());
        System.out.println(pizza.bake());
        System.out.println(pizza.cut());
        System.out.println(pizza.box());
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
