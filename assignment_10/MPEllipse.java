 class MPEllipse1 {
    

    void areaEllipse(int a, int b){
        final double pi=3.142;
        double area_ellipse=pi*a*b;
        System.out.println("Area of the Ellipse: "+area_ellipse);

    }
}

 class MPEllipse {

    
    public static void main(String[] args) {
       MPEllipse1 e=new MPEllipse1();
        e.areaEllipse(10,10);
    }
}
