class MOCircle {

    void areaCalc() {
        int r = 2;
        final double pi = 3.142;
        double area = pi * r * r;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
       MOCircle c = new MOCircle();
       c.areaCalc();
    }

}


