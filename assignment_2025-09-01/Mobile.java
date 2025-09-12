public class Mobile {
    int mobileCost;
    String mobileModelName;
    String mobileColour;

    Mobile(int mobileCost, String mobileModelName, String mobileColour) {
        this.mobileCost = mobileCost;
        this.mobileModelName = mobileModelName;
        this.mobileColour = mobileColour;
    }

    @Override
    public String toString() {
        return "Mobile [cost=" + mobileCost + ", model=" + mobileModelName + ", colour=" + mobileColour + "]";
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile(25000, "Samsung", "Black");
        Mobile m2 = new Mobile(30000, "OnePlus", "Blue");
        Mobile m3 = new Mobile(20000, "Redmi", "White");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}