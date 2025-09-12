class Cola1 {
    int f=7;
}

class Chungacha extends Cola1 {
    int d=77;
}

class a7 {
    public static void main(String[] args) {
        Cola1 ucrv = new Chungacha();
        System.out.println(ucrv.f);
        Chungacha dcrv = (Chungacha) ucrv;
        System.out.println(dcrv.d);
    }
}
