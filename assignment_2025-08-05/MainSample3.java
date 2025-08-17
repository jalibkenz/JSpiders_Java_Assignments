class MainSample3 {
    int a = 10;
}

class Demo3 extends MainSample3 {
    void test() {
        System.out.println("hey");
    }
}

class Tester3 extends MainSample3 {
    void po() {
        System.out.println("it po");
    }
}

class MainClass3 {
    public static void main(String[] args) {
        System.out.println("Demo3");
        Demo3 d1 = new Demo3();
        System.out.println(d1.a);
        d1.test();

        System.out.println("Tester3");
        Tester3 t1 = new Tester3();
        System.out.println(t1.a);
        t1.po();
    }
}