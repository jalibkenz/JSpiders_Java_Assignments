class Tv {
    double tv_cost;
    static String tv_brand = "Sony";
    String tv_type;

    Tv(double tv_cost, String tv_type) {
        this.tv_cost = tv_cost;
        this.tv_type = tv_type;
    }

    public static void main(String[] args) {
        Tv t = new Tv(150000, "OLED");

        System.out.println("Brand: " + tv_brand +
                " Type: " + t.tv_type +
                " Price: " + t.tv_cost);
    }
}