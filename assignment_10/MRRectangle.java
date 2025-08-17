
class MRRectangle1 {
    
    int areaRectangle(){
        int w=2; int h=3;
        int area_rectangle=w*h;
        return area_rectangle;
        

    }
}
class MRRectangle {
    public static void main(String[] args) {
        MRRectangle1 r=new MRRectangle1();
        int aor= r.areaRectangle();
        System.out.println("Ares of the Rectangle: "+aor);
        
    }
}
