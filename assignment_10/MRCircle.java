class MRCircle1 {

    double areaCircle(int r) {
        final double pi = 3.142;

        double area_circle = pi * r * r;

        return area_circle;
        
    }
}
class MRCircle {
    public static void main(String[] args) {
        MRCircle1 c=new MRCircle1();
        double aoc=c.areaCircle(10);
        System.out.println("Area of the circle: " + aoc);
    }
}
