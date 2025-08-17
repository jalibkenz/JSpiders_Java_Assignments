class Bike {
    double bike_cost;
    static String bike_brand = "Royal Enfield";
    String bike_colour;

    public static void main(String[] args) {
        Bike b = new Bike();
        b.bike_cost = 130000;
        b.bike_colour = "Black";

        System.out.println("Bike: " + bike_brand +
                           " Colour: " + b.bike_colour +
                           " Bike Cost: " + b.bike_cost);
    }
}