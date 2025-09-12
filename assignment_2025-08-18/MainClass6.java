// Parent class
abstract class Redbus {
    abstract void ticket();
}

// Child classes
class Airavata extends Redbus {
    void ticket() {
        System.out.println("Airavata bus ticket booked.");
    }
}

class VRL extends Redbus {
    void ticket() {
        System.out.println("VRL bus ticket booked.");
    }
}

class Janata extends Redbus {
    void ticket() {
        System.out.println("Janata bus ticket booked.");
    }
}

// Booking
class Booking {
    static void tickets(Redbus r) {
        r.ticket();
    }
}

// Main class
public class MainClass6 {
    public static void main(String[] args) {
        Booking.tickets(new Airavata());
        Booking.tickets(new VRL());
        Booking.tickets(new Janata());
    }
}