class Laptop {
    String laptop_name;
    double laptop_cost;
    static String laptop_brand = "Apple";

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.laptop_name = "Macbook Pro M4";
        l.laptop_cost = 250000;

        System.out.println("Brand: " + laptop_brand +
                           " Name/Model: " + l.laptop_name +
                           " Price: " + l.laptop_cost);
    }
}