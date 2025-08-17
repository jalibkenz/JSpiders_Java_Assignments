class Amazon {
    void drive() {
        System.out.println("Cab Driver is on Level 3 Dispatch");
    }
}

class BigBasket {
    static void dispatch(Amazon orvc) {
        orvc.drive();
    }
}

public class Customer2 {
    public static void main(String[] args) {
        Amazon orv = new Amazon();
        Ekart.dispatch(orv);               
    }
}