package com.training.turkcell.behavior.strategy;

public class GameRun {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(new SharpShooter());
        for(int i = 0 ;i<10;i++) {
            System.out.println("*---------------------*");
            soldier.shoot();
            soldier.duck();
            soldier.duckAndShoot();
        }
    }
}
