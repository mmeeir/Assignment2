public abstract class Vehicle {
    protected int id;
    protected static int idGen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    protected Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public abstract double calculateInsuranceFee();

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Wrong model");
        }
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2100) {
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Wrong price");
        }
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Model=" + model +
                ", Year=" + year +
                ", BasePrice=" + basePrice;
    }
}
