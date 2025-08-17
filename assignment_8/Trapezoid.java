class Trapezoid {

    void areaTrapezoid() {
        int s1 = 2;
        int s2 = 3;
        int h = 4;
        double area = 0.5 * (s1 + s2) * h;
        System.out.println("Area of Trapezoid: " + area);
    }

    public static void main(String[] args) {
        new Trapezoid().areaTrapezoid();
    }

}
