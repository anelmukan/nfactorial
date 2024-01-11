public class RandomWalker {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.25) x++;
            else if (random < 0.5) x--;
            else if (random < 0.75) y++;
            else {
                y--;
            }
            System.out.println("(" + x + ", " + y + ")");
        }

    }
}
