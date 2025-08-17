public class CbMulBwd {

    static int calc(int a) {
        return a * a * a;
    }

    static void calccbmulbwd(int s, int e) {
        int mul = 1;
        for (int i = s; i >=e; i--) {
            mul = mul + calc(i);
        }
        System.out.println(mul);
    }

    public static void main(String[] args) {
        calccbmulbwd(6, 1);
    }
}