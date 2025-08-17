class Demo1 {
    double z=2.0d;

}

class Dumtaka extends Demo1 {
    int x=5;
}

class a5 {
    public static void main(String[] args) {
        Demo1 ucrv = new Dumtaka();
        System.out.println(ucrv.z);
        Dumtaka dcrv = (Dumtaka) ucrv;
        System.out.println(dcrv.x);
    }
}