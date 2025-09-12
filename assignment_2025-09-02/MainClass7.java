public class MainClass7 {

    String laptopName;
    int laptopCost;
    String laptopBrand;

    MainClass7(String laptopName, int laptopCost, String laptopBrand) {
        this.laptopName = laptopName;
        this.laptopCost = laptopCost;
        this.laptopBrand = laptopBrand;
    }

    public boolean equals(Object obj) {
        MainClass7 l = (MainClass7) obj;
        return this.laptopBrand.equals(l.laptopBrand);
    }

    public static void main(String[] args) {
        MainClass7 l1 = new MainClass7("ThinkPad", 70000, "Lenovo");
        MainClass7 l2 = new MainClass7("XPS", 90000, "Dell");

        if (l1.equals(l2)) {
            System.out.println("Both laptops are of same brand");
        } else {
            System.out.println("Laptop brands are different");
        }
    }
}