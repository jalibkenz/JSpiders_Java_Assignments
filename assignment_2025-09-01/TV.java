public class TV {
    int tvCost;
    String tvBrand;
    String tvType;

    TV(int tvCost, String tvBrand, String tvType) {
        this.tvCost = tvCost;
        this.tvBrand = tvBrand;
        this.tvType = tvType;
    }

    @Override
    public String toString() {
        return "TV [cost=" + tvCost + ", brand=" + tvBrand + ", type=" + tvType + "]";
    }

    public static void main(String[] args) {
        TV t1 = new TV(40000, "Sony", "LED");
        TV t2 = new TV(25000, "Samsung", "LCD");

        System.out.println(t1);
        System.out.println(t2);
    }
}