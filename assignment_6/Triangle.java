public class Triangle {
    static float areaTriangle() {
int h=2; int b=3;
        float areaT = 0.5f * b * h;


        return areaT;
    }

    public static void main(String[] args) {
       float aot= areaTriangle();
               System.out.println("Area of Triangle: " + aot);
    }

}