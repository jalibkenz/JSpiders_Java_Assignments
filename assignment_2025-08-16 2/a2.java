class Sample {

    void disp() {
            System.out.println("disp");
        }

}

class Ampules extends Sample{
    
        void tata() {
            System.out.println("tata");
        }

}


class a2 {
    public static void main(String[] args) {
        Sample ucrv=new Ampules();
        ucrv.disp();
        Ampules dcrv=(Ampules)ucrv;
        dcrv.tata();

    }
    
}
