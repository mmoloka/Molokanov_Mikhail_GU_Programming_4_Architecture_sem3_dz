package org.example.sem3_dz;

public class CeramicCoveredCar extends Car implements Fueling {
    private Refueling refueling;

    public CeramicCoveredCar(String mark, String model, Color color) {
        super(mark, model, color);
    }

    public void setRefueling(Refueling refuelingStation) {
        this.refueling = refuelingStation;
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
}
