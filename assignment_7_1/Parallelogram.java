class Parallelogram {

    public static void main(String[] args) {
        InnerParallelogram.calcArea();
    }

}

class InnerParallelogram {

    static void calcArea() {
        int b = 2;
        int vh = 3;
        int area = b * vh;
        System.out.println("Area of Parallelogram: " + area);
    }

}