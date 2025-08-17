class MainSample1 {
    int c = 10;
}

class Demo1 extends MainSample1 {
    void test() {
        System.out.println("Hey, it is test...");
    }
}

class MainClass1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println(d1.c);
        d1.test();
    }
}