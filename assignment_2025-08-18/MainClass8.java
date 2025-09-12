// Parent class
abstract class RemoteControl {
    abstract void buttons();
}

// Child classes
class Tv extends RemoteControl {
    void buttons() {
        System.out.println("TV has Power, Volume, Channel buttons.");
    }
}

class MusicSystem extends RemoteControl {
    void buttons() {
        System.out.println("Music System has Play, Pause, Volume buttons.");
    }
}

class Projector extends RemoteControl {
    void buttons() {
        System.out.println("Projector has Power, Brightness, Zoom buttons.");
    }
}

// Button Design
class ButtonDesign {
    static void features(RemoteControl r) {
        r.buttons();
    }
}

// Main Class
public class MainClass8 {
    public static void main(String[] args) {
        ButtonDesign.features(new Tv());
        ButtonDesign.features(new MusicSystem());
        ButtonDesign.features(new Projector());
    }
}