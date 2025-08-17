public class MRTrapezoid {
    
    double areaTrapezoid(){

        int ps1=2; int ps2=3; int h=4;
        double area_trapezoid=0.5*(ps1+ps2)*h;
        return area_trapezoid;
    }

    public static void main(String[] args) {
        MRTrapezoid t= new MRTrapezoid();
       double aot= t.areaTrapezoid();
                System.out.println("Area of Trapezoid: "+aot);
    }
}
