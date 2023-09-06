package org.example.sem3_dz;

public class CarWashingStation1 implements CarWashing {
    @Override
    public void washBody() {
        System.out.println("Мойка кузова");
    }

    @Override
    public void wipMirrors() {
        System.out.println("Протирка зеркал");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Протирка лобового стекла");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протирка передних фар");
    }
}
