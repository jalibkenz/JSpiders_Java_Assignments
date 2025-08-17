
public class MRRectangle {
    
    int areaRectangle(){
        int w=2; int h=3;
        int area_rectangle=w*h;
        return area_rectangle;
        

    }

    public static void main(String[] args) {
        MRRectangle r=new MRRectangle();
        int aor= r.areaRectangle();
        System.out.println("Ares of the Rectangle: "+aor);
        
    }
}
