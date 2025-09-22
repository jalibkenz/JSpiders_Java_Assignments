class Square {

    public static void main(String[] args) {
        int a = InnerSquare.calcArea();
        System.out.println("Area of Square: " + a);
    }

}

class InnerSquare {

    static int calcArea() {
        int a = 10;
        int area = a * a;
        return area;

    }

}