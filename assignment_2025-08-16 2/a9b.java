class Cool4 {
   void add(){
    System.out.println("Cool4 add()");
   }
    
}

class Goolata2 extends Cool4 {
   void dispu(){
    System.out.println("Goolata2 dispu()");
   }
    
   int r=11;
}

public class a9b {

    public static void main(String[] args) {
        Cool4 ucrv = new Goolata2();
        ucrv.add(); // Calls the add method from Cool4
        Goolata2 dcrv=(Goolata2)ucrv;
        dcrv.dispu();
        System.out.println(dcrv.r);

    }
    
}
