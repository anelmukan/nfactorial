public class ex {
    public static int power(int n, int x) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
        
    public static void main(String[] args) {
            System.out.println(power(2, 10));
        }
        
    }
}

