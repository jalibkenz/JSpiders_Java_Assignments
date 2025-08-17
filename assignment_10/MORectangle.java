class MORectangle {

    public static void main(String[] args) {
        new MORectangle1().area();
    }
}

class MORectangle1 {

    void area() {
        int b = 2, h = 3;
        int area = b * h;
        System.out.println("Area" + area);
    }

}