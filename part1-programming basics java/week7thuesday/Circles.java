import java.awt.Color;

public class Circles {

    public static void draw(int n, double x, double y, double r) {
        if (n == 0) return;

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);


        StdDraw.setPenColor(red, green, blue);
        StdDraw.filledCircle(x, y, r);
        StdDraw.setPenColor(Color.black);
        StdDraw.circle(x, y, r);

        draw(n - 1, x - r / 2, y, r / 2);
        draw(n - 1, x + r / 2, y, r / 2);
        draw(n - 1, x, y + r / 2, r / 2);
        draw(n - 1, x, y - r / 2, r / 2);
    }

    public static void main(String[] args) {
        draw(5, 0.5, 0.5, 0.5);
    }
}
