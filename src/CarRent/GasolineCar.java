package CarRent;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNr, String make, String model, int amountOfDoors, int kmPrLitre) {
        super(registrationNr, make, model, amountOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;

        if (kmPrLitre >= 21) {
            registrationFee = 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            registrationFee = 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            registrationFee = 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                ", kmPrLitre=" + kmPrLitre +
                '}';
    }
}
