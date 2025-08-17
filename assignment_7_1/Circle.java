class Circle {

    public static void main(String[] args) {
        InnerCircle.areaCalc(2);
    }

}

class InnerCircle {

    static void areaCalc(int r) {
        final double pi = 3.142;
        double area = pi * r * r;
        System.out.println("Area of Circle: " + area);
    }

}
