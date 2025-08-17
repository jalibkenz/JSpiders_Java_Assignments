class Trapezoid {
    public static void main(String[] args) {
        InnerTrapezoid.areaTrapezoid();
    }

}

class InnerTrapezoid {

    static void areaTrapezoid() {
        int s1 = 2;
        int s2 = 3;
        int h = 4;
        double area = 0.5 * (s1 + s2) * h;
        System.out.println("Area of Trapezoid: " + area);
    }

}
