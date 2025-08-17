class Ellipse {

    public static void main(String[] args) {
        double a = InnerEllipse.areaCalc();
        System.out.println("Area of Ellipse: " + a);

    }

}

class InnerEllipse {

    static double areaCalc() {
        int a = 2, b = 3;
        final double pi = 3.142;
        double area = pi * a * b;
        return area;
    }

}
