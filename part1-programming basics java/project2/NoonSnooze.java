public class NoonSnooze {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int hour = 12 + (num / 60);
        int min = num % 60;

        String ampm;

        if (num % 24 < 12) {
            ampm = "pm";
        }
        else {
            ampm = "am";
        }
        hour = hour % 12;
        if (hour == 00) hour = 12;

        System.out.printf("%d:%02d%s", hour, min, ampm);
    }
}
