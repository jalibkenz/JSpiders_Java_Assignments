public class MREllipse {

    double areaEllipse() {
        final double pi = 3.142;
        int a = 2;
        int b = 3;
        double area_ellipse = pi * a * b;
        return area_ellipse;

    }

    public static void main(String[] args) {
        MREllipse e= new MREllipse();
        double aoe = e.areaEllipse();
        System.out.println("Area of the Ellipse: " + aoe);
    }
}
