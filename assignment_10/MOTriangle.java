class MOTriangle1 {

    void calc() {
        int b = 2, h = 3;
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }


}
class MOTriangle{   
    public static void main(String[] args) {
        MOTriangle1 t=new MOTriangle1();
        t.calc();

    }

}
