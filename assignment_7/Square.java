class Square {

    public static void main(String[] args) {
        InnerSquare.calcArea();

    }

}

class InnerSquare {

    static void calcArea() {
        int a = 10;
        int area = a * a;
        System.out.println("Area of Square: " + area);
    }

}