class Bike {
    double bike_cost;
    static String bike_brand = "Royal Enfield";
    String bike_colour;

    Bike(double a, String c){
        bike_cost=a;
        bike_colour=c;
    }

    public static void main(String[] args) {
        Bike b = new Bike(130000,"Black");

        System.out.println("Bike: " + bike_brand +
                           " Colour: " + b.bike_colour +
                           " Bike Cost: " + b.bike_cost);
    }
}