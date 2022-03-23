package CarRent;

public class DieselCar extends AFuelCar {
    boolean particleFilter;

    public DieselCar(String registrationNr, String make, String model, int amountOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNr, make, model, amountOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int particleCost = 1000;

        if (kmPrLitre >= 21) {
            registrationFee = 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            registrationFee = 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            registrationFee = 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            registrationFee = 2770;
        } else {
            registrationFee = 15260;
        }

        if (!particleFilter) {
            registrationFee += particleCost;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "registrationNr='" + registrationNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", amountOfDoors=" + amountOfDoors +
                ", kmPrLitre=" + kmPrLitre +
                ", particleFilter=" + particleFilter +
                '}';
    }
}
