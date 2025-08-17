class Sample2 {
    void co(){
        System.out.println("co");
    }
}
class Guleyluu extends Sample2 {
    void disp () {
        System.out.println("disp");
    }
}

class a6 {
    public static void main(String[] args) {
        Sample2 ucrv = new Guleyluu();
        ucrv.co();
        Guleyluu dcrv = (Guleyluu) ucrv;
        dcrv.disp();
    }
}