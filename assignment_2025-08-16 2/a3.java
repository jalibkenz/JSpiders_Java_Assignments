class Tester{
    int r=1;
}
class Tista extends Tester{
    void uliya(){
        System.out.println("Uliya");
    }
}
class a3{
    public static void main(String[] args) {
        Tester ucrv = new Tista();
        System.out.println(ucrv.r);
        Tista dcrv = (Tista) ucrv;
        dcrv.uliya();
    }
}