import java.awt.Color;

public class Checkboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i + j) % 2 == 0) { // потому что они все красные кв-ки в сумме дают четное число
                    StdDraw.setPenColor(Color.RED);
                }
                else {
                    StdDraw.setPenColor(Color.BLACK);
                }
                StdDraw.filledSquare( x: i, y: j, halfLength: 0,5);
            }
        }
    }
}

// 1. Write a program Checkboard.java that takes
// a command-line argument n and plots an n-by-n
// checkerboard with red and black squares.
// Color the lower-left square red.
