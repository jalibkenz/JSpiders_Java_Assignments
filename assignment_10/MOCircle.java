class MOCircle1 {

    void area() {
        final double pi = 3.142;
        int r = 2;
        double a = pi * r * r;
        System.out.println("Area" + a);
    }
}

class MOCircle {

    public static void main(String[] args) {
        new MOCircle1().area();

    }
}
