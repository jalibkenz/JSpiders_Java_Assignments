class MPSector1 {

    void areaSector(int r, int angle_in_radians) {

        double area_sector = 0.5 * r * r * angle_in_radians;
        System.out.println("Area of the sector: " + area_sector);

    }
}
class MPSector{

    public static void main(String[] args) {

        MPSector1 s = new MPSector1();
        s.areaSector(10, 2);

    }
}
