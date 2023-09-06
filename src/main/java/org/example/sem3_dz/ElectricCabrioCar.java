package org.example.sem3_dz;

public class ElectricCabrioCar extends Car implements Washing {
    private CarWashing carWashing;

    public ElectricCabrioCar(String mark, String model, Color color) {
        super(mark, model, color);
        type = CarType.CABRIO;
        fuelType = null;
        gearboxType = GearboxType.AT;
        engineCapacity = 0;
    }

    public void setCarWashing(CarWashing carWashingStation) {
        this.carWashing = carWashingStation;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void wash() {
        System.out.println("Специализированая ручная мойка кузова");
        carWashing.wipMirrors();
        carWashing.wipWindshield();
        carWashing.wipHeadlights();
    }
}
