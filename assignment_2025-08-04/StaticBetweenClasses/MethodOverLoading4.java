class MethodOverLoading4 {
    public static void main(String[] args) {
        System.out.println(InnerMethodOverLoading4.add(1.0f, 2.0));
        System.out.println(InnerMethodOverLoading4.add(1.0, 2.0f));
    }

}

class InnerMethodOverLoading4 {

    static double add(float a, double b) {
        return (a + b);
    }

    static double add(double a, float b) {
        return (a + b);
    }

}