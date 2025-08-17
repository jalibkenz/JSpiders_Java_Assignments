

class MRParallelogram1 {
    
    int areaParallelogram(){
        int b=2;
        int h=3;
        int area_parallelogram=b*h;
        return area_parallelogram;
        
    }
}
class MRParallelogram {
     public static void main(String[] args) {
        MRParallelogram1 p =new MRParallelogram1();
        int aop = p.areaParallelogram();
        System.out.println("Area of Parallelogram: "+aop);
     }
}
