

public class MRParallelogram {
    
    int areaParallelogram(){
        int b=2;
        int h=3;
        int area_parallelogram=b*h;
        return area_parallelogram;
        
    }

     public static void main(String[] args) {
        MRParallelogram p =new MRParallelogram();
        int aop = p.areaParallelogram();
        System.out.println("Area of Parallelogram: "+aop);
     }
}
