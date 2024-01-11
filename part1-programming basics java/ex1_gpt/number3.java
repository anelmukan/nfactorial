public class number3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num >= 18) {
            System.out.println("Вы совершеннолетний");
        }
        else {
            System.out.println("Вы несовершеннолетний");
        }
    }
}
