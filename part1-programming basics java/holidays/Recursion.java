public class Recursion {
    public static double power(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(-2, -5));
    }
}
