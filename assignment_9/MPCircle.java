public class MPCircle {

    void areaCircle(int r) {
        final double pi = 3.142;

        double area_circle = pi * r * r;
        System.out.println("Area of the circle: " + area_circle);
    }

    public static void main(String[] args) {
       MPCircle c=new MPCircle();
        c.areaCircle(10);
    }
}
