class Triangle {

    public static void main(String[] args) {
        TriangleAreaCalc.calc();

    }

}

class TriangleAreaCalc {

    static void calc() {
        int b = 2, h = 3;
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

}