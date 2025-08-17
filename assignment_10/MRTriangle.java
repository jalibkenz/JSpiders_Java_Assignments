class MRTriangle1 {
    float areaTriangle() {
        int h = 2;
        int b = 3;
        float areaT = 0.5f * b * h;

        return areaT;
    }
}
class MRTriangle {
    public static void main(String[] args) {
        MRTriangle1 t=new MRTriangle1();
        float aot = t.areaTriangle();
        System.out.println("Area of Triangle: " + aot);
    }

}