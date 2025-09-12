// Parent class
abstract class Launcher {
    abstract void launch();
}

// Child classes
class Pixel extends Launcher {
    void launch() {
        System.out.println("Pixel Launcher: Clean and smooth UI.");
    }
}

class Microsoft extends Launcher {
    void launch() {
        System.out.println("Microsoft Launcher: Productive with Office integration.");
    }
}

class Nova extends Launcher {
    void launch() {
        System.out.println("Nova Launcher: Highly customizable.");
    }
}

// ChooseLauncher
class ChooseLauncher {
    static void choose(Launcher l) {
        l.launch();
    }
}

// Main Class
public class MainClass9 {
    public static void main(String[] args) {
        ChooseLauncher.choose(new Pixel());
        ChooseLauncher.choose(new Microsoft());
        ChooseLauncher.choose(new Nova());
    }
}