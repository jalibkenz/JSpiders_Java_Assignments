public class Car {
    int carCost;
    String carModelName;
    String carType; // petrol/diesel

    Car(int carCost, String carModelName, String carType) {
        this.carCost = carCost;
        this.carModelName = carModelName;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car [cost=" + carCost + ", model=" + carModelName + ", type=" + carType + "]";
    }

    public static void main(String[] args) {
        Car c1 = new Car(800000, "Honda City", "Petrol");
        Car c2 = new Car(1200000, "Hyundai Creta", "Diesel");

        System.out.println(c1);
        System.out.println(c2);
    }
}