package CarRent;

public abstract class AFuelCar extends ACar {
    int kmPrLitre;

    public AFuelCar(String registrationNr, String make, String model, int amountOfDoors, int kmPrLitre) {
        super(registrationNr, make, model, amountOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    // should return “Gasoline” or “Diesel”
    abstract String getFuelType();

    int kmPrLitre() {
        return 0; // should return how many kilometres the car can drive on 1 litre of fuel
    }

}
