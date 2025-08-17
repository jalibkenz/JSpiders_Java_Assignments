class Circle {

    public static void main(String[] args) {
        InnerCircle.areaCalc();
    }

}

class InnerCircle {

    static void areaCalc() {
        int r = 2;
        final double pi = 3.142;
        double area = pi * r * r;
        System.out.println("Area of Circle: " + area);
    }

}
