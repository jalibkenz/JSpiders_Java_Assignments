class Tv {
    double tv_cost;
    static String tv_brand = "Sony";
    String tv_type;

    Tv(double a, String b) {
        tv_cost = a;
        tv_type = b;
    }

    public static void main(String[] args) {
        Tv t = new Tv(150000, "OLED");

        System.out.println("Brand: " + tv_brand +
                " Type: " + t.tv_type +
                " Price: " + t.tv_cost);
    }
}