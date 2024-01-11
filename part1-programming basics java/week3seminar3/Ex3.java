public class Ex3 {
    public static void main(String[] args) {
        int[] a = { 4, 6, 0, 6, 3, 7, 7, 6, 2, 4 };
        int c = 20;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                // up
                c -= a[i] - a[i - 1];
                if (c < 0) {
                    System.out.println("No fuel");
                    System.exit(0);
                }
            }
            else if (a[i] < a[i - 1]) {
                // down
                c++;
            }
            else {
                continue;
            }
        }
        System.out.println("We fiished, the reaminig charge is " + c);
    }
}
