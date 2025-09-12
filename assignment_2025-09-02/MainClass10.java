public class MainClass10 {

    String clothColour;
    int clothCost;
    String clothSize; // L, XL, M

    MainClass10(String clothColour, int clothCost, String clothSize) {
        this.clothColour = clothColour;
        this.clothCost = clothCost;
        this.clothSize = clothSize;
    }

    public boolean equals(Object obj) {
        MainClass10 c = (MainClass10) obj;
        return this.clothSize.equals(c.clothSize);
    }

    public static void main(String[] args) {
        MainClass10 c1 = new MainClass10("Red", 1500, "M");
        MainClass10 c2 = new MainClass10("Blue", 2000, "M");

        if (c1.equals(c2)) {
            System.out.println("Both clothes are of same size");
        } else {
            System.out.println("Cloth sizes are different");
        }
    }
}