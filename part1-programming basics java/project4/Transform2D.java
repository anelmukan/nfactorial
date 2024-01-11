public class Transform2D {
    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }

    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }

    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] newArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {

        for (int i = 0; i < x.length; i++) {
            double cosTheta = Math.cos(Math.toRadians(theta));
            double sinTheta = Math.sin(Math.toRadians(theta));
            double oldX = x[i];
            x[i] = x[i] * cosTheta - y[i] * sinTheta;
            y[i] = y[i] * cosTheta + oldX * sinTheta;
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {
        // uncomment one to test

        // testRotate1();
        // testRotate2();
        // testScale();
        // testTranslate();
        // testCopyRotateTranslate();
    }

    // function for testing rotate functionality #1
    public static void testRotate1() {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        rotate(x, y, 45.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }


    // function for testing rotate functionality #2
    public static void testRotate2() {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 1, 2, 2, 1 };
        double[] y = { 1, 1, 3, 2 };
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        // Rotate polygon
        // 90 degrees counterclockwise
        Transform2D.rotate(x, y, 90.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }


    // function for testing translate functionality
    public static void testTranslate() {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        translate(x, y, 2.0, 1.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }


    // function for testing scale functionality
    public static void testScale() {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        scale(x, y, 2.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }

    // function for testing copy, rotate, translate functionality
    public static void testCopyRotateTranslate() {
        // Set the x- and y-scale
        StdDraw.setScale(-5.0, 5.0);

        // Original polygon
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        // Copy of original polygon
        double[] cx = copy(x);
        double[] cy = copy(y);

        // Rotate, translate and draw the copy
        rotate(cx, cy, -45.0);
        translate(cx, cy, 1.0, 2.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(cx, cy);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
    }
}
