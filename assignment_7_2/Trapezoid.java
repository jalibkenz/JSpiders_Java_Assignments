class Trapezoid {
    public static void main(String[] args) {
        InnerTrapezoid.areaTrapezoid(2, 3, 4);
    }

}

class InnerTrapezoid {

    static void areaTrapezoid(int s1, int s2, int h) {

        double area = 0.5 * (s1 + s2) * h;
        System.out.println("Area of Trapezoid: " + area);
    }

}
