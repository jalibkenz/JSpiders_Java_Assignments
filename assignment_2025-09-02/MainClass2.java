public class MainClass2 {

    int carCost;
    String carModelName;
    String carType; // petrol/diesel

    MainClass2(int carCost, String carModelName, String carType) {
        this.carCost = carCost;
        this.carModelName = carModelName;
        this.carType = carType;
    }

    public boolean equals(Object obj) {
        MainClass2 c = (MainClass2) obj;
        return this.carCost == c.carCost;
    }

    public static void main(String[] args) {
        MainClass2 c1 = new MainClass2(800000, "Hyundai Creta", "Petrol");
        MainClass2 c2 = new MainClass2(800000, "Kia Seltos", "Diesel");

        if (c1.equals(c2)) {
            System.out.println("Both cars are of same cost");
        } else {
            System.out.println("Both cars are of different cost");
        }
    }
}