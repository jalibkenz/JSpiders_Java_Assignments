class Rectangle {
    public static void main(String[] args) {
        int a = InnerRectangle.areaRectangle();
        System.out.println("Area of Rectangle: " + a);
    }

}

class InnerRectangle {

    static int areaRectangle() {
        int w = 2, h = 3;
        int area = w * h;
        return area;

    }

}
