public class Bits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n >= 0) {
            int i = 0;
             
            while (n > 0) {
                i++;
                n /= 2;
            }
            System.out.println(i);
        }
        else {
            System.out.println("Illegal input");
        }
    }
}
