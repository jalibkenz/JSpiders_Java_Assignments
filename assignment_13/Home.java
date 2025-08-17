class Home {
    static double home_cost = 20000000; // 2 Crore flat
    String home_name;
    String home_colour;

    Home(String home_name, String home_colour) {
        this.home_name = home_name;
        this.home_colour = home_colour;
    }

    public static void main(String[] args) {
        Home h = new Home("Spark", "White");

        System.out.println("Flat Cost: " + home_cost +
                " Flat Name: " + h.home_name +
                " Flat Colour: " + h.home_colour);
    }
}