public class Color {
    private int r;
    private int g;
    private int b;

    public Color(int red, int green, int blue) {
        this.r = red;
        this.g = green;
        this.b = blue;
    }

    public int getR() {
        return this.r;
    }

    public void setR(int newR) {
        this.r = newR;
    }

    public String print() {
        return "color: " + "(" + this.r + ", " + this.g + ", " + this.b + ")";
    }

    public static void main(String[] args) {
        // int red = Integer.parseInt(args[0]);
        // int green = Integer.parseInt(args[1]);
        // int blue = Integer.parseInt(args[2]);
        // Color myColor = new Color(red, green, blue);
        // System.out.println(myColor.g);
        // myColor.g = 500;
        // System.out.println(myColor.g);
        // System.out.println(myColor.print());
    }
}
