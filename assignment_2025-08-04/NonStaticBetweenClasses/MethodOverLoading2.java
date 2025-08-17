class MethodOverLoading2 {
    public static void main(String[] args) {
        InnerMethodOverLoading2 rv = new InnerMethodOverLoading2();
        System.out.println(rv.add(1.0f, 2));
        System.out.println(rv.add(1.0, 2.0f));
    }

}

class InnerMethodOverLoading2 {

     float add(float a, int b) {
        return (a + b);
    }

     double add(double a, float b) {
        return (a + b);
    }

}