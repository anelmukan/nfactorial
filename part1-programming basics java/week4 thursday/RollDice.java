public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] dices = new int[61];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int random = (int) (Math.random() * 6) + 1;
                sum += random;
            }
            dices[sum]++;
        }
        for (int i = 10; i <= 60; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < dices[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
