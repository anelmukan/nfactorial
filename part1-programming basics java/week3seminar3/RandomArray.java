public class RandomArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[] a = new double[n];

        double min = 1000;

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 1000;
            System.out.println(a[i]);
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
