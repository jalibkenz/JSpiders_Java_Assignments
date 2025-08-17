class MREllipse1 {

    double areaEllipse() {
        final double pi = 3.142;
        int a = 2;
        int b = 3;
        double area_ellipse = pi * a * b;
        return area_ellipse;

    }
}
class MREllipse {

    public static void main(String[] args) {
        MREllipse1 e= new MREllipse1();
        double aoe = e.areaEllipse();
        System.out.println("Area of the Ellipse: " + aoe);
    }
}
