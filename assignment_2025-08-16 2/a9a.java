class Tester3 {
    int r = 10;

    void disp() {
        System.out.println("disp");
    }
}

class Tista1 extends Tester3 {
    void uliya() {
        System.out.println("uliya");
    }
}

class a9a{
    public static void main(String[] args) {
        Tester3 ucrv = new Tista1();
        System.out.println(ucrv.r);
        ucrv.disp();

        Tista1 dcrv=(Tista1) ucrv;
        dcrv.uliya(); 
    }
}
