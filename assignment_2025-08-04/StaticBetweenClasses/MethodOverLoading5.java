class MethodOverLoading5 {
    public static void main(String[] args) {
        System.out.println(InnerMethodOverLoading5.add(1.0f, 2.0, 3));
        System.out.println(InnerMethodOverLoading5.add(1.0, 2.0f, 3.0f));
    }

}

class InnerMethodOverLoading5 {

    static double add(float a, double b, int c) {
        return (a + b + c);
    }

    static double add(double a, float b, float c) {
        return (a + b + c);
    }

}