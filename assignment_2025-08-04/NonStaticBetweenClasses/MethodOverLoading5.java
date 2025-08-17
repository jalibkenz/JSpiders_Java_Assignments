class MethodOverLoading5 {
    public static void main(String[] args) {
        InnerMethodOverLoading5 rv=new InnerMethodOverLoading5();
        System.out.println(rv.add(1.0f, 2.0, 3));
        System.out.println(rv.add(1.0, 2.0f, 3.0f));
    }

}

class InnerMethodOverLoading5 {

     double add(float a, double b, int c) {
        return (a + b + c);
    }

     double add(double a, float b, float c) {
        return (a + b + c);
    }

}