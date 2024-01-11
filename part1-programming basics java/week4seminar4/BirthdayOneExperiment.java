public class BirthdayOneExperiment {
    public static void main(String[] args) {
        int people = 0;
        boolean[] birthday = new boolean[365];

        while (true) {
            int day = (int) (Math.random() * 365);
            if (birthday[day] == true)
                break;
            birthday[day] = true;
            people++;
        }
        System.out.println(people);
    }
}
