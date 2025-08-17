class Rectangle {
    public static void main(String[] args) {
        InnerRectangle.areaRectangle(2, 3);
    }

}

class InnerRectangle {

    static void areaRectangle(int w, int h) {

        int area = w * h;
        System.out.println("Area of Rectangle: " + area);
    }

}
