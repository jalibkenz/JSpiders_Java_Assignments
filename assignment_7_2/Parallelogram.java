class Parallelogram {

    public static void main(String[] args) {
        InnerParallelogram.calcArea(2, 3);
    }

}

class InnerParallelogram {

    static void calcArea(int b, int vh) {

        int area = b * vh;
        System.out.println("Area of Parallelogram: " + area);
    }

}