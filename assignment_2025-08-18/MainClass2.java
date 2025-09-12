// Parent class
abstract class Ola {
    abstract void Ride();
}

// Child classes
class Car extends Ola {
    void Ride() {
        System.out.println("Riding in a Car via Ola.");
    }
}

class Auto extends Ola {
    void Ride() {
        System.out.println("Riding in an Auto via Ola.");
    }
}

class BikeRide extends Ola {
    void Ride() {
        System.out.println("Riding in a Bike via Ola.");
    }
}

// Stimulator
class Stimulator {
    static void veh_ride(Ola o) {
        o.Ride();
    }
}

// Main class
public class MainClass2 {
    public static void main(String[] args) {
        Stimulator.veh_ride(new Car());
        Stimulator.veh_ride(new Auto());
        Stimulator.veh_ride(new BikeRide());
    }
}