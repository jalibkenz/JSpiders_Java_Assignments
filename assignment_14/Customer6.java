class Farmer {
    void drive() {
        System.out.println("Class Level 3 Dispatch");
    }
}

class Dmart {
    static void dispatch(Farmer orvc) {
        orvc.drive();
    }
}

public class Customer6 {
    public static void main(String[] args) {
        Farmer orv = new Farmer();
        Dmart.dispatch(orv);               
    }
}