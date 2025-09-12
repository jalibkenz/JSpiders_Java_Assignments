class Tester1{
    int x=8;
    void disp(){
        System.out.println("Tester1 disp");
    }
}

class Huliyacha extends Tester1{
    void ho(){
        System.out.println("Huliyacha ho");
    }
}

class a8{
    public static void main(String[] args) {
        Tester1 ucrv = new Huliyacha();
        System.out.println(ucrv.x);
        ucrv.disp();
        Huliyacha dcrv=(Huliyacha)ucrv;
        dcrv.ho();
    }
}