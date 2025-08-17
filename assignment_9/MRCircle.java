public class MRCircle {

    double areaCircle(int r) {
        final double pi = 3.142;

        double area_circle = pi * r * r;

        return area_circle;
        
    }

    public static void main(String[] args) {
        MRCircle c=new MRCircle();
        double aoc=c.areaCircle(10);
        System.out.println("Area of the circle: " + aoc);
    }
}
