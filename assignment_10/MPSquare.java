
class MPSquare1 {
    
     void areaSquare(int a){

        int area_square=a*a;
        System.out.println("Area of the square is: "+area_square);
    }
   }
   class MPSquare{

    public static void main(String[] args) {
       MPSquare1 s=new MPSquare1();
       s.areaSquare(10);
    }
}
