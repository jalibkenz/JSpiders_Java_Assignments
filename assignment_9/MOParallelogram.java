class MOParallelogram {

    void calcArea() {
        int b = 2;
        int vh = 3;
        int area = b * vh;
        System.out.println("Area of Parallelogram: " + area);
    }

    public static void main(String[] args) {
        MOParallelogram p= new MOParallelogram();
        p.calcArea();
    }

}
