public class DrunkenMaster {
    public static void main(String[] args) {

        String s = args[0];
        int x = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') x--;
            if (c == 'R') x++;
            if (c == 'U') y++;
            if (c == 'D') y--;
        }

        System.out.println(x + " " + y);
    }
}
