public class MRTriangle {
    float areaTriangle() {
        int h = 2;
        int b = 3;
        float areaT = 0.5f * b * h;

        return areaT;
    }

    public static void main(String[] args) {
        MRTriangle t=new MRTriangle();
        float aot = t.areaTriangle();
        System.out.println("Area of Triangle: " + aot);
    }

}