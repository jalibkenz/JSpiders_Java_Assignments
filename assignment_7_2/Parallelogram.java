class Parallelogram {

    public static void main(String[] args) {
        int a=InnerParallelogram.calcArea();
        System.out.println("Area of Parallelogram: " + a);
    }

}

class InnerParallelogram {

    static int calcArea() {
        int b = 2, vh = 3;
        int area = b * vh;
        return area;

    }

}
