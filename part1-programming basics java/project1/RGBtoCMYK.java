public class RGBtoCMYK {
    public static void main(String[] args) {
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        double white = Math.max(Math.max(red / 255.0, green / 255.0), blue / 255.0);
        double cyan = (white - (red / 255.0)) / white;
        double magenta = (white - (green / 255.0)) / white;
        double yellow = (white - blue / 255.0) / white;
        double black = (1 - white);

        System.out.println("red = " + red + "\n" + "green = " + green + "\n" + "blue = " + blue);
        System.out.println(
                "cyan = " + cyan + "\n" + "magenta = " + magenta + "\n" + "yellow = " + yellow
                        + "\n" + "black = "
                        + black);
    }
}
