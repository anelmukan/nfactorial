public class number6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println("Равносторонний треугольник");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("Равнобедренный треугольник");
        }
        else {
            System.out.println("Обычный треугольник");
        }
    }
}
