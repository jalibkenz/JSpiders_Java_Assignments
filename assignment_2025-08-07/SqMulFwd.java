public class SqMulFwd {

    static int calc(int a) {
        return a * a;
    }

    static void calcsqmulfwd(int s, int e) {
        int mul = 1;
        for (int i = s; i <=e; i++) {
            mul = mul + calc(i);
        }
        System.out.println(mul);
    }

    public static void main(String[] args) {
        calcsqmulfwd(1, 6);
    }
}