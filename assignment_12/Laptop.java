class Laptop {
    String laptop_name;
    double laptop_cost;
    static String laptop_brand = "Apple";

    Laptop(String a, double b) {
        laptop_name = a;
        laptop_cost = b;
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Macbook Pro M4", 250000);

        System.out.println("Brand: " + laptop_brand +
                " Name/Model: " + l.laptop_name +
                " Price: " + l.laptop_cost);
    }
}