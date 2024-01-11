public class Date {

    private int year;
    private int month;
    private int day;

    private static final String[] months = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean after(Date other) {
        if (this.year > other.year) return true;
        if (this.year == other.year && this.month > other.month) return true;
        if (this.year == other.year && this.month == other.month && this.day > other.day)
            return true;
        return false;
    }

    public boolean before(Date other) {
        if (this.year == other.year && this.month == other.month && this.day == other.day)
            return false;
        return !after(other);
    }

    public int compareTo(Date other) {
        if (before(other)) return -1;
        else if (after(other)) return 1;
        return 0;
    }

    @Override
    public String toString() {
        // March 21 2023
        return months[this.month - 1] + " " + this.day + " " + this.year;
    }


    public static void main(String[] args) {

        Date date1 = new Date(2010, 7, 18);
        Date date2 = new Date(2010, 7, 18);
        //
        // System.out.println(date1.compareTo(date2));
        // System.out.println(date1.after(date2));
        // System.out.println(date1.before(date2));
        //
        // System.out.println(date1);
        // System.out.println(date2);

        Color myColor = new Color(10, 20, 30);
        System.out.println(myColor.getR());
        myColor.setR(100);
        System.out.println(myColor.getR());

    }
}
