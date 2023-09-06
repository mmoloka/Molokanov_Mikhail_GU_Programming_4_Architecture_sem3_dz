package org.example.sem3_dz;

public class Program {
    public static void main(String[] args) {
        DieselMotorCar car1 = new DieselMotorCar("Mercedes", "E200d", Color.METALLIC);
        GasolineMotorCar car2 = new GasolineMotorCar("Scoda", "Octavia TFSI", Color.BLACK);
        ElectricCar car3 = new ElectricCar("Hongqi", "E-HS9", Color.BLUE);
        CeramicCoveredCar car4 = new CeramicCoveredCar("BMW", "X6", Color.WHITE);
        ElectricCabrioCar car5 = new ElectricCabrioCar("smart", "E cabrio", Color.GREEN);

        Refueling refueling1 = new RefuelingStation1();
        Refueling refueling2 = new RefuelingStation2();

        CarWashing carWashing1 = new CarWashingStation1();
        CarWashing carWashing2 = new CarWashingStation2();

        car1.setRefueling(refueling1);
        car1.setCarWashing(carWashing1);
        car2.setRefueling(refueling2);
        car2.setCarWashing(carWashing2);
        car3.setCarWashing(carWashing1);
        car4.setRefueling(refueling1);
        car4.fuelType = FuelType.GASOLINE;
        car5.setCarWashing(carWashing2);

        System.out.println(car1 + ":");
        car1.fuel();
        car1.wash();
        System.out.println();
        System.out.println(car2 + ":");
        car2.fuel();
        car2.wash();
        System.out.println();
        System.out.println(car3 + ":");
        car3.wash();
        System.out.println();
        System.out.println(car4 + ":");
        car4.fuel();
        System.out.println();
        System.out.println(car5 + ":");
        car5.wash();
    }
}
