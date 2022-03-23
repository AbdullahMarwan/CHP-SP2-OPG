package CarRent;

public abstract class ACar implements Car {
    String registrationNr;
    final String make;
    final String model;
    final int amountOfDoors;

    public ACar(String registrationNr, String make, String model, int amountOfDoors) {
        this.registrationNr = registrationNr;
        this.make = make;
        this.model = model;
        this.amountOfDoors = amountOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNr;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return amountOfDoors;
    }

}
