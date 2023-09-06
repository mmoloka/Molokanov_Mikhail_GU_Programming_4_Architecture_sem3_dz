package org.example.sem3_dz;

public class DieselMotorCar extends Car implements Fueling, Washing {
    private Refueling refueling;
    private CarWashing carWashing;

    public DieselMotorCar(String mark, String model, Color color) {

        super(mark, model, color);
        fuelType = FuelType.DIESEL;
    }

    public void setRefueling(Refueling refuelingStation) {
        this.refueling = refuelingStation;
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
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wash() {
        if (carWashing != null) {
            carWashing.washBody();
            carWashing.wipMirrors();
            carWashing.wipWindshield();
            carWashing.wipHeadlights();
        }
    }
}
