class Laptop {
    String laptop_name;
    double laptop_cost;
    static String laptop_brand = "Apple";

    Laptop(String laptop_name, double laptop_cost) {
        this.laptop_name = laptop_name;
        this.laptop_cost = laptop_cost;
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Macbook Pro M4", 250000);

        System.out.println("Brand: " + laptop_brand +
                " Name/Model: " + l.laptop_name +
                " Price: " + l.laptop_cost);
    }
}