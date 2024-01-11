public class number5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num >= 90 && num <= 100) {
            System.out.println("Отлично");
        }
        else if (num >= 70 && num <= 89) {
            System.out.println("Хорошо");
        }
        else if (num >= 50 && num <= 69) {
            System.out.println("Удовлетворительно");
        }
        else if (num >= 0 && num <= 49) {
            System.out.println("Неудовлитворительно");
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
}
