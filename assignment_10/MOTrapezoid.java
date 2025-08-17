class MOTrapezoid1 {

    void areaTrapezoid() {
        int s1 = 2;
        int s2 = 3;
        int h = 4;
        double area = 0.5 * (s1 + s2) * h;
        System.out.println("Area of Trapezoid: " + area);
    }
}

class MOTrapezoid {
    public static void main(String[] args) {
        MOTrapezoid1 t = new MOTrapezoid1();
        t.areaTrapezoid();
    }

}
