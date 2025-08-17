class Ellipse {

    void areaCalc() {
        final double pi = 3.142;
        int a = 2;
        int b = 3;
        double area = pi * a * b;
        System.out.println("Area of Ellipse: " + area);

    }
}

class MOEllipse {
    static void main(String[] args) {
        Ellipse e = new Ellipse();
        e.areaCalc();

    }

}
