package com.training.turkcell.behavior.strategy;

public class Soldier {
    private Aim aim;
    private Duck duck = new HalfDucking();

    public Soldier(Aim aim, Duck duck) {
        this.aim = aim;
        this.duck = duck;
    }

    public Soldier(Aim aim) {
        this.aim = aim;
    }

    public void shoot() {
        aim.shoot();
    }

    public void duck() {
        this.duck.duck();
       // System.out.println("Egildim");
    }

    public void duckAndShoot() {
        this.duck();
        this.shoot();
    }
}
