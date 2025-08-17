public class Trapezoid {
    
    static void areaTrapezoid(){
        int parallel_side_1=10, parallel_side_2=20,h=2;
        double area_trapezoid=0.5*(parallel_side_1+parallel_side_2)*h;
        System.out.println("Area of Trapezoid: "+area_trapezoid);
    }

    public static void main(String[] args) {
        areaTrapezoid();
    }
}
