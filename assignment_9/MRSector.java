public class MRSector {
    
double areaSector(){
    int r=2;
    int angle_in_radians=3;
    double area_sector=0.5*r*r*angle_in_radians;
    return area_sector;

}

    public static void main(String[] args) {
        MRSector s=new MRSector();
        double aos=s.areaSector();
        System.out.println("Area of the sector: "+aos);
    }
}
