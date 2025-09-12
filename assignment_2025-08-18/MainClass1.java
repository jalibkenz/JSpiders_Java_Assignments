// Parent class
abstract class Bike {
    abstract void sound();
}

// Child classes
class BMW extends Bike {
    void sound() {
        System.out.println("BMW makes a powerful roar.");
    }
}

class JavaBike extends Bike {  // used Java as a bike brand here
    void sound() {
        System.out.println("Java bike makes a classic thump.");
    }
}

class Pulsar extends Bike {
    void sound() {
        System.out.println("Pulsar bike makes a sporty sound.");
    }
}

// Stimulator
class Stimulator1 {
    static void veh_sound(Bike b) {
        b.sound();  // runtime polymorphism
    }
}

// Main class
public class MainClass1 {
    public static void main(String[] args) {
        Stimulator1.veh_sound(new BMW());
        Stimulator1.veh_sound(new JavaBike());
        Stimulator1.veh_sound(new Pulsar());
    }
}