public class ex2 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100 + 1);

        while (true) {
            int n = StdIn.readInt();
            if (number > n) {
                System.out.println("The hidden number is larger");
            }
            else if (number < n) {
                System.out.println("The hidden number is smaller");
            }
            else {
                System.out.println("You guessed! The number is: " + number);
                break;
            }
        }
    }
}
