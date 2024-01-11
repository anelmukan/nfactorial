public class Ex2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] array = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.println(array[n - 1]);
    }
}
