public class Sector {
    
static double areaSector(){
    int r=2;
    int angle_in_radians=3;
    double area_sector=0.5*r*r*angle_in_radians;
    return area_sector;

}

    public static void main(String[] args) {
        double aos=areaSector();
        System.out.println("Area of the sector: "+aos);
    }
}
