public class Triangle {
    static void areaTriangle(int h, int b) {

        float areaT = 0.5f * b * h;

        System.out.println("Area of Triangle: " + areaT);
    }

    public static void main(String[] args) {
        areaTriangle(1,2);
    }

}