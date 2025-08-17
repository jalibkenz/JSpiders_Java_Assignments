
public class MPSquare {
    
     void areaSquare(int a){

        int area_square=a*a;
        System.out.println("Area of the square is: "+area_square);
    }


    public static void main(String[] args) {
       MPSquare s=new MPSquare();
       s.areaSquare(10);
    }
}
