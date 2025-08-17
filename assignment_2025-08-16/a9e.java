class Cola13{
    int f=14;
    void disp(){
        System.out.println("Hello from Cola13 disp()");
    }
}

class Chungacha extends Cola13 {
    int d=1414;
}


class a9e {
    public static void main(String[] args) {
        Cola13 ucrv = new Chungacha();
        System.out.println("ucrv.f = " + ucrv.f);
        ucrv.disp();
        Chungacha dcrv = (Chungacha) ucrv;
      System.out.println("dcrv.d = " + dcrv.d);
       

    }
}
