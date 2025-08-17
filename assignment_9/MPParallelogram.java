

public class MPParallelogram {
    
     void areaParallelogram(int b, int h){
        int area_parallelogram=b*h;
        System.out.println("Area of Parallelogram: "+area_parallelogram);
    }

     public static void main(String[] args) {
        MPParallelogram p=new MPParallelogram();
        p.areaParallelogram(10, 20);
     }
}
