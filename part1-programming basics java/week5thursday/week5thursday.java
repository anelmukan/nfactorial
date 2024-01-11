public class week5thursday {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);

        while (true) {
            int n = StdIn.readInt();
            if (number > n) {
                System.out.println("The number is larger");
            }
            else if (number < n) {
                System.out.println("The numebr is smaller");
            }
            else {
                System.out.println("You are guessed! The numer is" + number);
                break;
            }

        }
    }
}
