package main.java.patterns.strategyy;

// Паттерн Стратегия
// определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
// он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.

// Используется для реализации разных вариантов поведения.



public class main {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();
        knight.setWeapon(new KnifeBehavior());
        knight.fight();
        Character troll = new Troll();
        troll.setWeapon(new KnifeBehavior());
        troll.fight();
    }
}
