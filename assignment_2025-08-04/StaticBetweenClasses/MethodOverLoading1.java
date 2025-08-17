class MethodOverLoading1 {
    public static void main(String[] args) {
        System.out.println(InnerMethodOverLoading1.add(1, 2));
        System.out.println(InnerMethodOverLoading1.add(1.0f, 2.0f));
    }

}

class InnerMethodOverLoading1 {

    static int add(int a, int b) {
        return (a + b);
    }

    static float add(float a, float b) {
        return (a + b);
    }

}