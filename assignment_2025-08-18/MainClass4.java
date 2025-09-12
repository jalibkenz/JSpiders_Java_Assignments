// Parent class
abstract class BookMyShow {
    abstract void movie();
}

// Child classes
class Hollywood extends BookMyShow {
    void movie() {
        System.out.println("Watching a Hollywood movie.");
    }
}

class Bollywood extends BookMyShow {
    void movie() {
        System.out.println("Watching a Bollywood movie.");
    }
}

class Sandalwood extends BookMyShow {
    void movie() {
        System.out.println("Watching a Sandalwood movie.");
    }
}

// Booking
class Bookingm {
    static void movies(BookMyShow b) {
        b.movie();
    }
}

// Main class
public class MainClass4 {
    public static void main(String[] args) {
        Bookingm.movies(new Hollywood());
        Bookingm.movies(new Bollywood());
        Bookingm.movies(new Sandalwood());
    }
}