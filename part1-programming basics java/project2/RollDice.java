public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] totals = new int[51];

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 10; j++) {
                int roll = (int) (Math.random() * 6) + 1;
                total += roll;
            }
            totals[total - 10]++;
        }

        int maxCount = 0;
        for (int count : totals) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = 10; i <= 60; i++) {
            System.out.printf("%2d: ", i);
            int num = (int) ((double) totals[i - 10] / maxCount * 40);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
