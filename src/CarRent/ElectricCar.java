package CarRent;

public abstract class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNr, String make, String model, int amountOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNr, make, model, amountOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() // returns the battery capacity in kilowatt hours
    {
        return batteryCapacity;
    }

    public int getMaxRangeKm() // returns the maximum range in kilometres.
    {
        return maxRange;
    }

    public int getWhPrKm() // returns the power consumption in watt hours per driven kilometre.
    {
        return batteryCapacity / maxRange;
    }

    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int kmPrWh = 100 / (getWhPrKm() / 91);

        if (kmPrWh >= 21) {
            registrationFee = 330;
        } else if (kmPrWh >= 15 && kmPrWh <= 20) {
            registrationFee = 1050;
        } else if (kmPrWh >= 10 && kmPrWh <= 14) {
            registrationFee = 2340;
        } else if (kmPrWh >= 5 && kmPrWh <= 9) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }

        return registrationFee;
    }
}

