public class Bike {
    int bikeCost;
    String bikeBrand;
    String bikeColour;

    Bike(int bikeCost, String bikeBrand, String bikeColour) {
        this.bikeCost = bikeCost;
        this.bikeBrand = bikeBrand;
        this.bikeColour = bikeColour;
    }

    @Override
    public String toString() {
        return "Bike [cost=" + bikeCost + ", brand=" + bikeBrand + ", colour=" + bikeColour + "]";
    }

    public static void main(String[] args) {
        Bike b1 = new Bike(70000, "Hero", "Red");
        Bike b2 = new Bike(150000, "Royal Enfield", "Black");

        System.out.println(b1);
        System.out.println(b2);
    }
}