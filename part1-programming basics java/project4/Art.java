public class Art {

    // draws one filled circle
    private static void drawCircle(int n, double x, double y, double r) {
        int red = (int) (Math.random() * 128 + 128);
        int green = (int) (Math.random() * 128 + 128);
        int blue = (int) (Math.random() * 128 + 128);
        StdDraw.setPenColor(red, green, blue);
        StdDraw.filledCircle(x, y, r);
    }

    // custom function that draws 12 circles (30 deg increment) inside a circle
    private static void drawAnel(int n, double x, double y, double r) {
        if (n == 0) return;

        drawCircle(n, x, y, r);

        int numCircles = 8;
        double newR = r / 2 - (r / 2) * 0.05;
        double angleIncr = 2 * Math.PI / numCircles;

        int clockwise = (int) (Math.random() * 2);

        if (clockwise == 1) {
            for (int i = 0; i < numCircles; i++) {
                double angle = i * angleIncr;
                double cx = x + newR * Math.cos(angle);
                double cy = y + newR * Math.sin(angle);
                drawCircle(n - 1, cx, cy, newR / 2);
                drawAnel(n - 1, cx, cy, newR);
            }
        }
        else {
            for (int i = numCircles - 1; i >= 0; i--) {
                double angle = i * angleIncr;
                double cx = x + newR * Math.cos(angle);
                double cy = y + newR * Math.sin(angle);
                drawCircle(n - 1, cx, cy, newR / 4);
                drawAnel(n - 1, cx, cy, newR);
            }
        }
    }

    //  Takes an integer command-line argument n;
    //  Runs custom drawAnel function of order N that draws circular patterns
    //  inside a circle starting from center (0.5, 0.5) position.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        drawAnel(n, 0.5, 0.5, 0.5);
    }
}
