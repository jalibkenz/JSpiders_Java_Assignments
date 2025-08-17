public class MPSector {
    
 void areaSector(int r, int angle_in_radians){

    double area_sector=0.5*r*r*angle_in_radians;
    System.out.println("Area of the sector: "+area_sector);

}

    public static void main(String[] args) {
        
       MPSector s=new MPSector();
       s.areaSector(10, 2);
        
    }
}
