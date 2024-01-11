public class Tour {

    private class Node {
        private Point p;
        private Node next;
    }

    private Node first;

    // creates an empty tour`
    public Tour() {
        first = new Node();
        first.p = null;
        first.next = first;

    }

    // creates the 4-point tour a->b->c->d->a (for debugging)
    public Tour(Point a, Point b, Point c, Point d) {

        Node a1 = new Node();
        Node b1 = new Node();
        Node c1 = new Node();
        Node d1 = new Node();

        first = a1;

        a1.p = a;
        a1.next = b1;

        b1.p = b;
        b1.next = c1;

        c1.p = c;
        c1.next = d1;

        d1.p = d;
        d1.next = a1;
    }

    // returns the number of points in this tour
    public int size() {
        int count = 0;
        Node start = first;
        Node current = start;
        do {
            count = count + 1;
            current = current.next;

        } while (current.next != start);

        return count;
    }

    // returns the length of this tour
    public double length() {
        double total = 0;
        if (first.p != null) {
            Node start = first;
            Node current = start;
            do {
                double distance = current.p.distanceTo(current.next.p);
                total = total + distance;
                current = current.next;
            } while (current != start);
        }

        return total;
    }

    // returns a string representation of this tour
    public String toString() {
        String now = "";

        if (first.p != null) {

            Node start = first;
            Node current = start;
            do {
                String temp = current.p.toString();
                now = now + temp + "\n";
                current = current.next;
            } while (current.next != start);

        }

        return now;

    }

    // draws this tour to standard drawing
    public void draw() {

        if (first.p != null) {
            Node start = first;
            Node current = start;
            do {
                current.p.drawTo(current.next.p);

                current = current.next;
            } while (current != start);
        }

    }

    // inserts p using the nearest neighbor heuristic
    public void insertNearest(Point p) {
        Node closest = new Node();
        Node insertion = new Node();
        insertion.p = p;

        double greater = Double.POSITIVE_INFINITY;

        if (first.p == null) {
            first.p = p;
        }

        Node start = first;
        Node current = start;
        do {
            double dis = current.p.distanceTo(insertion.p);

            if (dis < greater) {
                closest = current;
            }

            greater = closest.p.distanceTo(insertion.p);

            current = current.next;
        } while (current != start);

        insertion.next = closest.next;
        closest.next = insertion;
    }

    // inserts p using the smallest increase heuristic
    public void insertSmallest(Point p) {
        Node closest = new Node();

        Node insertion = new Node();
        insertion.p = p;

        double greater = Double.POSITIVE_INFINITY;

        if (first.p == null) {
            first.p = p;
        }

        Node start = first;
        Node current = start;
        do {

            double dis = current.p.distanceTo(insertion.p) + insertion.p.distanceTo(current.next.p)
                    - current.p.distanceTo(current.next.p);

            if (dis < greater) {
                closest = current;
            }

            greater = closest.p.distanceTo(insertion.p) + insertion.p.distanceTo(closest.next.p)
                    - closest.p.distanceTo(closest.next.p);

            current = current.next;
        } while (current != start);

        insertion.next = closest.next;
        closest.next = insertion;
    }

    // tests this class by calling all constructors and instance methods
    public static void main(String[] args) {
        // define 4 points, corners of a square
        Point a = new Point(1.0, 1.0);
        Point b = new Point(1.0, 4.0);
        Point c = new Point(4.0, 4.0);
        Point d = new Point(4.0, 1.0);

        // create the tour a -> b -> c -> d -> a
        Tour squareTour = new Tour(a, b, c, d);

        // print the size to standard output
        int size = squareTour.size();
        StdOut.println("# of points = " + size);

        double length = squareTour.length();
        StdOut.println("Tour length = " + length);

        StdOut.println(squareTour);


        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);

        squareTour.draw();

        Point e = new Point(5.0, 6.0);
        squareTour.insertSmallest(e);
    }
}
