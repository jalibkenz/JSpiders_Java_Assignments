
public class MPRectangle {
    
     void areaRectangle( int w, int h){
        int area_rectangle=w*h;
        System.out.println("Ares of the Rectangle: "+area_rectangle);

    }

    public static void main(String[] args) {
        MPRectangle r= new MPRectangle();
        r.areaRectangle(10, 20);
        
    }
}
