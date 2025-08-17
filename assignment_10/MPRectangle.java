 class MPRectangle1 {
    
     void areaRectangle( int w, int h){
        int area_rectangle=w*h;
        System.out.println("Ares of the Rectangle: "+area_rectangle);

    }
}
    class MPRectangle{
    public static void main(String[] args) {
        MPRectangle1 r= new MPRectangle1();
        r.areaRectangle(10, 20);
        
    }
}
