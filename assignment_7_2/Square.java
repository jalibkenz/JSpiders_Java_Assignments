class Square {

    public static void main(String[] args) {
        InnerSquare.calcArea(10);

    }

}

class InnerSquare {

    static void calcArea(int a) {

        int area = a * a;
        System.out.println("Area of Square: " + area);
    }

}