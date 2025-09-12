class Demo10 {
    double z = 1.0d;
    int r = 12;
}

class Dumtaka3 extends Demo10 {
    int x = 14;

}

class a9c {
    public static void main(String[] args) {
        Demo10 ucrv = new Dumtaka3();
        System.out.println(ucrv.z);
        System.out.println(ucrv.r);

        Dumtaka3 dcrv = (Dumtaka3) ucrv;
        System.out.println(dcrv.x);

    }

}
