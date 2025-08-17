
public class MRSquare {

    int areaSquare() {
        int a = 2;
        int area_square = a * a;
        return area_square;
    }

    public static void main(String[] args) {
        MRSquare s=new MRSquare();
        int aos = s.areaSquare();
        System.out.println("Area of the square is: " + aos);
        System.out.println("CHECK: "+s);
    }
}

