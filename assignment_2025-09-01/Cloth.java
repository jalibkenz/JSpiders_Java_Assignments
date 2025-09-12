public class Cloth {
    String clothColour;
    int clothCost;
    String clothSize;

    Cloth(String clothColour, int clothCost, String clothSize) {
        this.clothColour = clothColour;
        this.clothCost = clothCost;
        this.clothSize = clothSize;
    }

    @Override
    public String toString() {
        return "Cloth [colour=" + clothColour + ", cost=" + clothCost + ", size=" + clothSize + "]";
    }

    public static void main(String[] args) {
        Cloth c1 = new Cloth("Blue", 1500, "L");
        Cloth c2 = new Cloth("Red", 1200, "M");

        System.out.println(c1);
        System.out.println(c2);
    }
}