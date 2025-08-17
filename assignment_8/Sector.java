class Sector {

    void areaCalc() {
        int r = 2;
        double theeta = 3.142; /* angle=180 wiz pi rads */
        double area = 0.5 * r * r * theeta;
        System.out.println("Area of Sector: " + area);

    }

    public static void main(String[] args) {
        new Sector().areaCalc();
    }

}
