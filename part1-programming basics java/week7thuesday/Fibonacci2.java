public class Fibonacci2 {
    static long[] res = new long[110];

    public static long fibo(int n) {
        if (n == 1 || n == 2) return 1;

        if (n % 2 != 0) {

            if (res[n] == 0) {
                long a = fibo((n + 1) / 2);
                long b = fibo((n - 1) / 2);
                res[n] = a * a + b * b;
            }
            return res[n];
        }

        if (res[n] == 0) {
            long a = fibo(n / 2 + 1);
            long b = fibo(n / 2 - 1);
            res[n] = a * a - b * b;
        }
        return res[n];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fibo(n));
        for (int i = 0; i <= n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
