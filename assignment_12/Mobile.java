class Mobile {
    double mobile_cost;
    static String mobile_model_name = "Google Pixel 8a";
    String mobile_colour;

    Mobile(double a, String b) {
        mobile_cost = a;
        mobile_colour = b;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile(15000.50, "Black");

        System.out.println("Mobile Cost = " + m.mobile_cost + " | " +
                "Mobile Model Name = " + mobile_model_name + " | " +
                "Mobile Color = " + m.mobile_colour);
    }
}