class Triangle {

    public static void main(String[] args) {
        TriangleAreaCalc.calc(2,3);

    }

}

class TriangleAreaCalc {

    static void calc(int b, int h) {
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

}