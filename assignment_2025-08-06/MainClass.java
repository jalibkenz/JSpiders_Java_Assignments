class gp{
    int gp;
}
class p1 extends gp{
    int p1;
}
class p2 extends gp{
    int p2;
}
class Ch extends p1{
    int c;

}





class MainClass {

    public static void main(String[] args) {
        Ch rv=new Ch();
        rv.c=2;
        rv.p1=3;
        rv.gp=4;
        System.out.println(rv.c+"|"+rv.p1+"|"+rv.gp);
    }
}