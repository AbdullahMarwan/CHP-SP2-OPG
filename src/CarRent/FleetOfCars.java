package CarRent;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar (Car car){
        fleet.add(car);
    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFee = 0;

        for (Car f : fleet) {
            totalRegistrationFee += f.getRegistrationFee();
        }

        //System.out.println("Total Registration Fee for the whole fleet: " + totalRegistrationFee);
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleetOfCars=" + fleet +
                '}';
    }
}
