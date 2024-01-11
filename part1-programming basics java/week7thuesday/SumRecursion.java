// public class SumRecursion {
//     public static int sum(int n) {
//         if (n == 0) return 0;
//
//         return sum(n - 1) + n;
//     }
//
//     public static void main(String[] args) {
//         int number = Integer.parseInt(args[0]);
//         System.out.println(sum(number));
//     }
// }


public class SumRecursion {
    static int[] cash = new int[100];

    public static int sum(int n) {
        if (n == 0) return 0;

        if (cash[n] == 0) {
            cash[n] = sum(n - 1) + n;
        }
        return cash[n];
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(sum(number));
    }
}
