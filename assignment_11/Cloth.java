class Cloth {
    String cloth_colour;
    static double cloth_cost = 2000; // Uniform or sports
    String cloth_size;

    public static void main(String[] args) {
        Cloth c = new Cloth();
        c.cloth_colour = "Black";
        c.cloth_size = "XL";
        System.out.println("Cloth cost"+cloth_cost+"Size"+cloth_cost+"Size"+c.cloth_size);
    }
}