class MainSample2 {
    int y = 10;
}

class Demo2 extends MainSample2 {
    void cool() {
        System.out.println("Hey, it cool");
    }
}

class Tester2 extends Demo2 {
    int x = 20;
}

class MainClass2 {
    public static void main(String[] args) {
        Tester2 t1 = new Tester2();
        System.out.println(t1.x);
        t1.cool();
        System.out.println(t1.y);
    }
}