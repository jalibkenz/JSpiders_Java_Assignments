class MethodOverLoading3 {
    public static void main(String[] args) {
        InnerMethodOverLoading3 rv=new InnerMethodOverLoading3();
        System.out.println(rv.add(1.0f, 2.0));
        System.out.println(rv.add(1.0, 2.0));
    }

}

class InnerMethodOverLoading3 {

     double add(float a, double b) {
        return (a + b);
    }

     double add(double a, double b) {
        return (a + b);
    }

}