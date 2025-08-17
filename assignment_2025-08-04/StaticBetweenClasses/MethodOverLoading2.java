class MethodOverLoading2 {
    public static void main(String[] args) {
        System.out.println(InnerMethodOverLoading2.add(1.0f, 2));
        System.out.println(InnerMethodOverLoading2.add(1.0, 2.0f));
    }

}

class InnerMethodOverLoading2 {

    static float add(float a, int b) {
        return (a + b);
    }

    static double add(double a, float b) {
        return (a + b);
    }

}