package main.java.patterns.templateMethod;

public class Maker {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
