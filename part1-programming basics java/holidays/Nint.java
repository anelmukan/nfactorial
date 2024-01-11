public class Nint {
    public static int nint(double n) {
        // return (int) (n + 0.5); это решение в 1 строчку
        int number = (int) n;
        if (n - number >= 0.5) {
            return number + 1;
        }
        else {
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(nint(Double.parseDouble(args[0])));
    }
}

