public class Trapezoid {
    
    static void areaTrapezoid(int ps1, int ps2, int h){
        double area_trapezoid=0.5*(ps1+ps2)*h;
        System.out.println("Area of Trapezoid: "+area_trapezoid);
    }

    public static void main(String[] args) {
        areaTrapezoid(1,2,3);
    }
}
