class Saudi {
    void drive() {
        System.out.println("Class Level 3 Dispatch");
    }
}

class IndianOil {
    static void dispatch(Saudi orvc) {
        orvc.drive();
    }
}

public class Customer4 {
    public static void main(String[] args) {
        Saudi orv = new Saudi();
        IndianOil.dispatch(orv);               
    }
}