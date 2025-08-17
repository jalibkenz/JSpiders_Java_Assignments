class MethodOverLoading1 {
    public static void main(String[] args) {
        InnerMethodOverLoading1 rv=new InnerMethodOverLoading1();
        System.out.println(rv.add(1, 2));
        System.out.println(rv.add(1.0f, 2.0f));
    }

}

class InnerMethodOverLoading1 {

     int add(int a, int b) {
        return (a + b);
    }

     float add(float a, float b) {
        return (a + b);
    }

}