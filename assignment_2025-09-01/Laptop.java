public class Laptop {
    String laptopName;
    int laptopCost;
    String laptopBrand;

    Laptop(String laptopName, int laptopCost, String laptopBrand) {
        this.laptopName = laptopName;
        this.laptopCost = laptopCost;
        this.laptopBrand = laptopBrand;
    }

    @Override
    public String toString() {
        return "Laptop [name=" + laptopName + ", cost=" + laptopCost + ", brand=" + laptopBrand + "]";
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("MacBook Air", 90000, "Apple");
        Laptop l2 = new Laptop("ThinkPad", 70000, "Lenovo");

        System.out.println(l1);
        System.out.println(l2);
    }
}