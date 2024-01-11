public class RandomWalkers {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int total = 0;

        for (int j = 0; j < trials; j++) {
            int x = 0;
            int y = 0;

            for (int i = 0; i < n; i++) {
                double random = Math.random();
                if (random < 0.25) x++;
                else if (random < 0.5) x--;
                else if (random < 0.75) y++;
                else {
                    y--;
                }
                int distance = x * x + y * y; // посчитадли куда он ушел от начальной точки
                total += distance;
            }
        }
        System.out.println(total * 1.0 / trials);
    }
}
