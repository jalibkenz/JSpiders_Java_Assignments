class MRSector1 {

    double areaSector() {
        int r = 2;
        int angle_in_radians = 3;
        double area_sector = 0.5 * r * r * angle_in_radians;
        return area_sector;

    }
}

class MRSector {

    public static void main(String[] args) {
        MRSector1 s = new MRSector1();
        double aos = s.areaSector();
        System.out.println("Area of the sector: " + aos);
    }
}
