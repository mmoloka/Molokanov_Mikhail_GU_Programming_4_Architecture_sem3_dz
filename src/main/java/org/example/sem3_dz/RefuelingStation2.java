package org.example.sem3_dz;

public class RefuelingStation2 implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case DIESEL -> System.out.println("Заправка дизельным топливом");
            case GASOLINE -> System.out.println("Заправка бензином");
        }
    }
}
