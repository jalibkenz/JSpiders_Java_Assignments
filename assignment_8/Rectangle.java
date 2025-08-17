class Rectangle {

    void areaRectangle() {
        int w = 2;
        int h = 3;
        int area = w * h;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        new Rectangle().areaRectangle();
    }

}
