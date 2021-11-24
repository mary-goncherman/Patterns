package main.java.patterns.fabric;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList();

    public Pizza() {
    }

    public String prepare() {
        StringBuilder sb = new StringBuilder();

        sb.append("Preparing " + name + "\n");
        sb.append("Tossing " + dough + "\n");
        sb.append("Adding " + sauce + "\n");
        sb.append("Adding toppings:" + "\n");

        for (String topping : toppings) {
            sb.append("\t" + topping + "\n");
        }

        return sb.toString();
    }

    public String bake() {
        return "Bake for 25 minutes at 350 \n";
    }

    public String cut() {
        return "Cutting the pizza into diagonal slices \n";
    }

    public String box() {
        return "Place pizza in official PizzaStore box \n";
    }

    public String getName() {
        return name;
    }

}


