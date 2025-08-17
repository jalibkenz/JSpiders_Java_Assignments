class Triangle {

    void calc() {
        int b = 2, h = 3;
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        new Triangle().calc();

    }

}
