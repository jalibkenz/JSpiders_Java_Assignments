public class CbSumBwd {

    static int calc(int a) {
        return a * a * a;
    }

    static void calccbsumbwd(int s, int e) {
        int sum = 0;
        for (int i = s; i >=e; i--) {
            sum = sum + calc(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calccbsumbwd(6, 1);
    }
}