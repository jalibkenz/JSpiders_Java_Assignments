class MRTrapezoid1 {
    
    double areaTrapezoid(){

        int ps1=2; int ps2=3; int h=4;
        double area_trapezoid=0.5*(ps1+ps2)*h;
        return area_trapezoid;
    }
}
class MRTrapezoid {
    public static void main(String[] args) {
        MRTrapezoid1 t= new MRTrapezoid1();
       double aot= t.areaTrapezoid();
                System.out.println("Area of Trapezoid: "+aot);
    }
}
