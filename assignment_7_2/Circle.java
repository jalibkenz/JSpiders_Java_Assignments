class Circle {

    public static void main(String[] args) {
        double a = InnerCircle.areaCalc();
        System.out.println("Area of Circle: " + a);

    }

}

class InnerCircle {

    static double areaCalc() {
        int r = 2;
        final double pi = 3.142;
        double area = pi * r * r;
        return area;

    }

}
