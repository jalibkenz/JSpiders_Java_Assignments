public class Ellipse {
    

    static void areaEllipse(int a, int b){
        final double pi=3.142;
        double area_ellipse=pi*a*b;
        System.out.println("Area of the Ellipse: "+area_ellipse);

    }

    public static void main(String[] args) {
        areaEllipse(10,10);
    }
}
