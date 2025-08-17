class Mobile {
    double mobile_cost;
    static String mobile_model_name = "Google Pixel 8a";
    String mobile_colour;

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.mobile_cost = 15000.50;
        m.mobile_colour = "Black";

        System.out.println("Mobile Cost = " + m.mobile_cost + " | " +
                           "Mobile Model Name = " + mobile_model_name + " | " +
                           "Mobile Color = " + m.mobile_colour);
    }
}