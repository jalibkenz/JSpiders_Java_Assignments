 class MPCircle1 {

    void areaCircle(int r) {
        final double pi = 3.142;

        double area_circle = pi * r * r;
        System.out.println("Area of the circle: " + area_circle);
    }

}

class MPCircle{
    public static void main(String[] args) {
       MPCircle1 c=new MPCircle1();
        c.areaCircle(10);
    }
}
