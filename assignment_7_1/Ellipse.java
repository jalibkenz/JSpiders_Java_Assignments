class Ellipse {

    public static void main(String[] args) {
        InnerEllipse.areaCalc(2, 3);

    }

}

class InnerEllipse {

    static void areaCalc(int a, int b) {
        final double pi = 3.142;
        double area = pi * a * b;
        System.out.println("Area of Ellipse: " + area);

    }

}
