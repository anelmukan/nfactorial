public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        for (int step = 1; step <= n; step++) {
            double random = Math.random();
            if (random < 0.25) x++;
            else if (random < 0.5) x--;
            else if (random < 0.75) y++;
            else y--;

            System.out.println("(" + x + ", " + y + ")");
        }

        int squaredDistance = x * x + y * y;
        System.out.println("squared distance = " + squaredDistance);

    }
}
