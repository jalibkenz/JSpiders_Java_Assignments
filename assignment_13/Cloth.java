class Cloth {
    String cloth_colour;
    static double cloth_cost = 2000; // Uniform or sports
    String cloth_size;

    Cloth(String cloth_colour, String cloth_size) {
        this.cloth_colour = cloth_colour;
        this.cloth_size = cloth_size;
    }

    public static void main(String[] args) {
        Cloth c = new Cloth("Black", "XL");

        System.out.println("Cloth cost " + cloth_cost + "Cost " + cloth_cost + "Size " + c.cloth_size);
    }
}