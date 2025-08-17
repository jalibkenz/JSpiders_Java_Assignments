
class MRSquare1 {

    int areaSquare() {
        int a = 2;
        int area_square = a * a;
        return area_square;
    }
}
class MRSquare {
    public static void main(String[] args) {
        MRSquare1 s=new MRSquare1();
        int aos = s.areaSquare();
        System.out.println("Area of the square is: " + aos);
        System.out.println("CHECK: "+s);
    }
}

