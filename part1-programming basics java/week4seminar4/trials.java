public class trials {
    public static void main(String[] args) {
        int trials = 10000000;
        int totalPeople = 0;

        for (int i = 0; i < trials; i++) {
            int people = 0;
            boolean[] birthday = new boolean[365];
            while (true) {
                int day = (int) (Math.random() * 364);
                if (birthday[day])
                    break;
                birthday[day] = true;
                people++;
            }
            totalPeople += people;
        }
        double avg = totalPeople / trials;
    }
}
