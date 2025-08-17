public class MPTriangle {
     void areaTriangle(int h, int b) {

        float areaT = 0.5f * b * h;

        System.out.println("Area of Triangle: " + areaT);
    }

    public static void main(String[] args) {
        MPTriangle t=new MPTriangle();
        t.areaTriangle(1,2);
    }

}