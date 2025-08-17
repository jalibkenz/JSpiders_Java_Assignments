class MethodOverLoading3 {
    public static void main(String[] args) {
        System.out.println(InnerMethodOverLoading3.add(1.0f, 2.0));
        System.out.println(InnerMethodOverLoading3.add(1.0, 2.0));
    }

}

class InnerMethodOverLoading3 {

    static double add(float a, double b) {
        return (a + b);
    }

    static double add(double a, double b) {
        return (a + b);
    }

}