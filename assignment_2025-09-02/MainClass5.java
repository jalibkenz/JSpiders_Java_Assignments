public class MainClass5 {

    int bikeCost;
    String bikeBrand;
    String bikeColour;

    MainClass5(int bikeCost, String bikeBrand, String bikeColour) {
        this.bikeCost = bikeCost;
        this.bikeBrand = bikeBrand;
        this.bikeColour = bikeColour;
    }

    public boolean equals(Object obj) {
        MainClass5 b = (MainClass5) obj;
        return this.bikeBrand.equals(b.bikeBrand);
    }

    public static void main(String[] args) {
        MainClass5 b1 = new MainClass5(150000, "Yamaha", "Blue");
        MainClass5 b2 = new MainClass5(160000, "Yamaha", "Black");

        if (b1.equals(b2)) {
            System.out.println("Both bikes are of same brand");
        } else {
            System.out.println("Bike brands are different");
        }
    }
}