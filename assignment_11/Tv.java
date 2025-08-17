class Tv {
    double tv_cost;
    static String tv_brand = "Sony";
    String tv_type;

    public static void main(String[] args) {
        Tv t = new Tv();
        t.tv_cost = 150000;
        t.tv_type = "OLED";

        System.out.println("Brand: " + tv_brand +
                           " Type: " + t.tv_type +
                           " Price: " + t.tv_cost);
    }
}