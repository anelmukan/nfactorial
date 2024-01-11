public class number8 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if ((num % 400 == 0) || (num % 100 != 0 && num % 400 != 0 && num % 4 == 0)) {
            // if (num % 4 == 0) {
            //     if ((num % 100 != 0) && (num % 400 == 0))
            System.out.println("Это високосный год");
        }
        else {
            System.out.println("Это не високосный год");
        }
    }
}
