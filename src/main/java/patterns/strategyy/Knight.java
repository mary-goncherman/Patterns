package main.java.patterns.strategyy;

public class Knight extends Character {
    @Override
    void fight() {
        this.weapon.useWeapon();
    }
}
