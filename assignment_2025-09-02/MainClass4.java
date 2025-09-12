public class MainClass4 {

    int tvCost;
    String tvBrand;
    String tvType;

    MainClass4(int tvCost, String tvBrand, String tvType) {
        this.tvCost = tvCost;
        this.tvBrand = tvBrand;
        this.tvType = tvType;
    }

    public boolean equals(Object obj) {
        MainClass4 t = (MainClass4) obj;
        return this.tvBrand.equals(t.tvBrand);
    }

    public static void main(String[] args) {
        MainClass4 t1 = new MainClass4(40000, "Sony", "LED");
        MainClass4 t2 = new MainClass4(50000, "Sony", "OLED");

        if (t1.equals(t2)) {
            System.out.println("Both TVs are of same brand");
        } else {
            System.out.println("TV brands are different");
        }
    }
}