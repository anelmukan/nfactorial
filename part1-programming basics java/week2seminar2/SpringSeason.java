public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("This date does not exist");
        }
        else {

            if (m == 3 || d >= 20) {
                System.out.println("true");
            }
            else if (m == 4 || m == 5) {
                System.out.println("true");
            }
            else if (m == 6 && d <= 20) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}


// if (m >= 3 && m <= 6) {
//         if (m == 4 && d >= 1 && d <= 30) {
//         System.out.println("true");
//         }
//
//         else if (m == 5 && d >= 1 && d <= 31) {
//         System.out.println("true");
//         }
//
//         else if (m == 3 && d >= 20 && d <= 31) {
//         System.out.println("true");
//         }
//         else if (m == 6 && d <= 20 && d >= 1) {
//         System.out.println("true");
//         }
//         else if (d < 1 || d > 31) {
//         System.out.println("This date does not exist");
//         }
//         else {
//         System.out.println("false");
//         }
//         }
//         else if (m < 1 || m > 12) {
//         System.out.println("This date does not exist");
//
//         }
//         else {
//         System.out.println("false");
//         }
