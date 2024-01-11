public class TriangleArea {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // /здесть можнно задавать 2.5 допустим, а не только целые числа, потому что double

        double s = (a + b + c) / 2;
        // так как здесь double, мы делим на 2, а не 2.0


        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(area);
    }
}

    // Write a program TriangleArea.java that takes three command
    //     line inputs a, b, and c, representing the side lengths
    //     of a triangle, and prints the area of the triangle using
    //     Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)), where s = (a + b + c) / 2.

