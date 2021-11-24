package main.java.patterns.fabric;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        pizza = chicagoStore.orderPizza("pepperoni");
    }
}
