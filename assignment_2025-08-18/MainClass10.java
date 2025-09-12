// Parent class
abstract class Browser {
    abstract void renderpage();
}

// Child classes
class Chrome extends Browser {
    void renderpage() {
        System.out.println("Chrome renders page using Blink engine.");
    }
}

class Safari extends Browser {
    void renderpage() {
        System.out.println("Safari renders page using WebKit engine.");
    }
}

class Edge extends Browser {
    void renderpage() {
        System.out.println("Edge renders page using Blink + Chromium.");
    }
}

// ChooseBrowser
class ChooseBrowser {
    static void choose(Browser b) {
        b.renderpage();
    }
}

// Main Class
public class MainClass10 {
    public static void main(String[] args) {
        ChooseBrowser.choose(new Chrome());
        ChooseBrowser.choose(new Safari());
        ChooseBrowser.choose(new Edge());
    }
}