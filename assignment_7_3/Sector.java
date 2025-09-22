class Sector {

    public static void main(String[] args) {
        double a = InnerSector.areaCalc();
        System.out.println("Area of Sector: " + a);

    }

}

class InnerSector {
    static double areaCalc() {
        int r = 2;
        double theeta = 3.14;
        /* angle=180 wiz pi rads */
        double area = 0.5 * r * r * theeta;
        return area;

    }

}
