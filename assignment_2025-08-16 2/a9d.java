class Sample21{
    void co(){
        System.out.println("Sample21 co()");
    }
    int r=13;
}
class Hahoha extends Sample21 {
    void disp(){
        System.out.println("Hahoha disp()");
    }
}

class a9d {
    public static void main(String[] args) {
        Sample21 ucrv = new Hahoha();
        ucrv.co(); // Calls Hahoha's co() method
        System.out.println(ucrv.r); // Accesses Sample21's r field
        Hahoha dcrv=(Hahoha)ucrv;
        dcrv.disp(); // Calls Hahoha's co() method again
    }
    
}
