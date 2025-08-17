public class Trapezoid {
    
    static double areaTrapezoid(){

        int ps1=2; int ps2=3; int h=4;
        double area_trapezoid=0.5*(ps1+ps2)*h;
        return area_trapezoid;
    }

    public static void main(String[] args) {
       double aot= areaTrapezoid();
                System.out.println("Area of Trapezoid: "+aot);
    }
}
