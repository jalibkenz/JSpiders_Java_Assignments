class MOParallelogram1 {

    void calcArea() {
        int b = 2;
        int vh = 3;
        int area = b * vh;
        System.out.println("Area of Parallelogram: " + area);
    }
}

class MOParallelogram{
    public static void main(String[] args) {
        MOParallelogram1 p= new MOParallelogram1();
        p.calcArea();
    }

}
