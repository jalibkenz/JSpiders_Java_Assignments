class Cool {
    void add() {
        System.out.println("add");
    }
}
class Goolata extends Cool {
    void dispu () {
        System.out.println("dispu");
    }
}

class a4 {
    public static void main(String[] args) {
        Cool ucrv = new Goolata();
        ucrv.add();
        Goolata dcrv = (Goolata) ucrv;
        dcrv.dispu();
    }
}