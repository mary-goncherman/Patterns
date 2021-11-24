package main.java.patterns.adapters;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();

        duck.quack();
        duck.fly();

        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
