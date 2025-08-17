class Pvr {
    void drive() {
        System.out.println("Class Level 3 Dispatch");
    }
}

class BookMyShow {
    static void dispatch(Pvr orvc) {
        orvc.drive();
    }
}

public class Customer7 {
    public static void main(String[] args) {
        Pvr orv = new Pvr();
        BookMyShow.dispatch(orv);               
    }
}