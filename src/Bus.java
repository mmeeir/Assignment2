public class Bus extends Vehicle implements Servicable {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08 + passengerCapacity * 50;
    }

    @Override
    public void performService() {
        System.out.println("Bus " + model + " is receiving full safety inspection.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 5000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + passengerCapacity;
    }
}

