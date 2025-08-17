class VarierBakery {
    void drive() {
        System.out.println("Cab Driver is on Level 3 Dispatch");
    }
}

class Ola {
    static void dispatch(Amazon driver) {
        driver.drive();  // calling method using CabDriver object
    }
}

public class Customer1 {
    public static void main(String[] args) {
        Amazon cab = new Amazon(); // creating CabDriver object
        Ekart.dispatch(cab);               // passing it to dispatch method
    }
}