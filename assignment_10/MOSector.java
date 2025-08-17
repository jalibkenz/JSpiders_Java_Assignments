class MOSector1 {

    void areaCalc() {
        int r = 2;
        double theeta = 3.142; /* angle=180 wiz pi rads */
        double area = 0.5 * r * r * theeta;
        System.out.println("Area of Sector: " + area);

    }
}

class MOSector {
    public static void main(String[] args) {
        MOSector1 s = new MOSector1();
        s.areaCalc();
    }

}
