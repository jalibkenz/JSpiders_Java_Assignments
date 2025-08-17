class MethodOverLoading4 {
    public static void main(String[] args) {
        InnerMethodOverLoading4 rv=new InnerMethodOverLoading4();
        System.out.println(rv.add(1.0f, 2.0));
        System.out.println(rv.add(1.0, 2.0f));
    }

}

class InnerMethodOverLoading4 {

     double add(float a, double b) {
        return (a + b);
    }

     double add(double a, float b) {
        return (a + b);
    }

}