class Kmf {
    void drive() {
        System.out.println("Class Level 3 Dispatch");
    }
}

class Nandini {
    static void dispatch(Kmf orvc) {
        orvc.drive();
    }
}

public class Customer5 {
    public static void main(String[] args) {
        Kmf orv = new Kmf();
        Nandini.dispatch(orv);               
    }
}