 class MPTrapezoid1 {
    
     void areaTrapezoid(int ps1, int ps2, int h){
        double area_trapezoid=0.5*(ps1+ps2)*h;
        System.out.println("Area of Trapezoid: "+area_trapezoid);
    }
 }
 class MPTrapezoid {
 

    public static void main(String[] args) {
        MPTrapezoid1 t=new MPTrapezoid1();
        t.areaTrapezoid(1,2,3);
    }
}
