class Demo {
    int x=10;

}

class PemoCha extends Demo{
    
        void ho() {
            System.out.println("ho");
        }

}


class a1 {
    public static void main(String[] args) {
        Demo ucrv=new PemoCha();
        System.out.println(ucrv.x);
        PemoCha dcrv=(PemoCha)ucrv;
        dcrv.ho();

    }
    
}
