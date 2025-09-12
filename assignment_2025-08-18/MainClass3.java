// Parent class
abstract class Tea {
    abstract void taste();
}

// Child classes
class Black_tea extends Tea {
    void taste() {
        System.out.println("Black Tea tastes strong and bold.");
    }
}

class Lemon_tea extends Tea {
    void taste() {
        System.out.println("Lemon Tea tastes tangy and refreshing.");
    }
}

class Green_tea extends Tea {
    void taste() {
        System.out.println("Green Tea tastes light and healthy.");
    }
}

// Stimulator
class Stimulator3 {
    static void taste_tea(Tea t) {
        t.taste();
    }
}

// Main class
public class MainClass3 {
    public static void main(String[] args) {
        Stimulator3.taste_tea(new Black_tea());
        Stimulator3.taste_tea(new Lemon_tea());
        Stimulator3.taste_tea(new Green_tea());
    }
}