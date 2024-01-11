public class RandomWalkers {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int squaredDistancesSum = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;

            for (int j = 0; j < n; j++) {
                double random = Math.random();
                if (random < 0.25) x++;
                else if (random < 0.5) x--;
                else if (random < 0.75) y++;
                else y--;
            }

            int squaredDistance = x * x + y * y;
            squaredDistancesSum += squaredDistance;
        }

        double meanSquaredDistance = (double) squaredDistancesSum / trials;

        System.out.println("mean squared distance = " + meanSquaredDistance);
    }
}
