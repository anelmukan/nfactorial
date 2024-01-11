public class PowerFunction {
    public static int power(int x, int n) {
        if (n == 0) return 1;
        else if (n > 0) {
            return x * power(x, n - 1);
        }
        else {

        }
    public static void main(String[]args[0]);
        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
    }
}
