// Parent class
abstract class Zomato {
    abstract void order();
}

// Child classes
class Hotel1 extends Zomato {
    void order() {
        System.out.println("Order from Hotel1: Biryani.");
    }
}

class Hotel2 extends Zomato {
    void order() {
        System.out.println("Order from Hotel2: Dosa.");
    }
}

class Hotel3 extends Zomato {
    void order() {
        System.out.println("Order from Hotel3: Pizza.");
    }
}

// Orders
class Orders {
    static void ordered(Zomato z) {
        z.order();
    }
}

// Main class
public class MainClass5 {
    public static void main(String[] args) {
        Orders.ordered(new Hotel1());
        Orders.ordered(new Hotel2());
        Orders.ordered(new Hotel3());
    }
}