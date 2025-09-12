class Cool2{
    void disp(){
        System.out.println("disp");
    }
}

class Dinga extends Cool2{
    void tata(){
        System.out.println("tata");
    }
    int x=9;
}

class a9 {
    public static void main(String[] args) {
        Cool2 ucrv = new Dinga();
        ucrv.disp();
        Dinga dcrv=(Dinga)ucrv; 
        dcrv.tata();
        System.out.println(dcrv.x);
        // c.tata(); // This line would cause a compile-time error because tata() is not defined in Cool2
        // System.out.println(c.x); // This line would also cause a compile-time error because x is not defined in Cool2
    }

    
}