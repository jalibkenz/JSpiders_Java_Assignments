

class MPParallelogram1 {
    
     void areaParallelogram(int b, int h){
        int area_parallelogram=b*h;
        System.out.println("Area of Parallelogram: "+area_parallelogram);
    }
   }
   class MPParallelogram{
     public static void main(String[] args) {
        MPParallelogram1 p=new MPParallelogram1();
        p.areaParallelogram(10, 20);
     }
}
