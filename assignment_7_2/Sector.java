class Sector {

    public static void main(String[] args) {
        InnerSector.areaCalc(2, 3.14);
    }

}

class InnerSector {
    static void areaCalc(int r, double theeta) {
        /* angle=180 wiz pi rads */
        double area = 0.5 * r * r * theeta;
        System.out.println("Area of Sector: " + area);

    }

}
