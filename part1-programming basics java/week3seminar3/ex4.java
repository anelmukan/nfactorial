public class ex4 {
    public static void main(String[] args) {

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "Noember", "December"
        };

        String month = args[0];

        for (int i = 0; i < months.length; i++) {
            if (month.equals(months[i])) {
                System.out.println(i + 1);
            }
        }
    }
}
