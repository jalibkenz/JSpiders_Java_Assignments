public class SqSumFwd {

    static int calc(int a) {
        return a * a;
    }

    static void calcsqsumfwd(int s, int e) {
        int mul = 0;
        for (int i = s; i <=e; i++) {
            mul = mul + calc(i);
        }
        System.out.println(mul);
    }

    public static void main(String[] args) {
        calcsqsumfwd(1, 6);
    }
}