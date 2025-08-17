class MPTriangle1 {
    void areaTriangle(int h, int b) {

        float areaT = 0.5f * b * h;

        System.out.println("Area of Triangle: " + areaT);
    }
}

class MPTriangle {
    public static void main(String[] args) {
        MPTriangle1 t = new MPTriangle1();
        t.areaTriangle(1, 2);
    }

}