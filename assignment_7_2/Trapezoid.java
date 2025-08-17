class Trapezoid {
    public static void main(String[] args) {
        double a = InnerTrapezoid.areaTrapezoid();
        System.out.println("Area of Trapezoid: " + a);
    }

}

class InnerTrapezoid {

    static double areaTrapezoid() {
        int s1 = 2;
        int s2 = 3;
        int h = 4;

        double area = 0.5 * (s1 + s2) * h;
        return area;

    }

}
