package CarRent;

public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        DieselCar dieselCar1 = new DieselCar("AI42069", "Audi", "R8", 4, 100, false);
        ElectricCar electricCar1 = new ElectricCar("LA42069", "Lamboghitti", "R9", 4, 5, 4);
        GasolineCar gasolineCar1 = new GasolineCar("VO42069", "Volvo", "V10", 4, 20);

        fleetOfCars.addCar(dieselCar1);
        fleetOfCars.addCar(electricCar1);
        fleetOfCars.addCar(gasolineCar1);

        for (Car f : fleetOfCars.getFleet()) {
            System.out.println(f);
        }

        System.out.println("Total cost of fleet: " + fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}

