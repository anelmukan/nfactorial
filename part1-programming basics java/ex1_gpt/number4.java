public class number4 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if ((num >= 0 && num < 6) || (num >= 21 && num <= 24)) {
            System.out.println("Ночь");
        }
        else if (num >= 6 && num < 11) {
            System.out.println("Утро");
        }
        else if (num >= 11 && num <= 16) {
            System.out.println("День");
        }
        else if (num > 16 && num < 21) {
            System.out.println("Вечер");
        }
        else {
            System.out.println("Введите другую цифру");
        }
    }
}
