package main.java.patterns.strategyy;

public class Troll extends Character {
    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
