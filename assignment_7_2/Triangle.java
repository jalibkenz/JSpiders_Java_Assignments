class Triangle {

    public static void main(String[] args) {
        double a = TriangleAreaCalc.calc();
        System.out.println("Area of Traingle: " + a);

    }

}

class TriangleAreaCalc {

    static double calc() {
        int b = 2;
        int h = 3;
        double area = 0.5 * b * h;
        return area;
    }

}