class Honda {
    void drive() {
        System.out.println("Class Level 3 Dispatch");
    }
}

class HondaShowroom {
    static void dispatch(Honda orvc) {
        orvc.drive();
    }
}

public class Customer3 {
    public static void main(String[] args) {
        Honda orv = new Honda();
        HondaShowroom.dispatch(orv);               
    }
}