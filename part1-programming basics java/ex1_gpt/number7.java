public class number7 {
    public static void main(String[] args) {
        String a = args[0];
        System.out.println("a: " + a);
        if (a.equals("w")) {
            System.out.println("Вы женщина");
        }
        else if (a.equals("m")) {
            System.out.println("Вы мужчина");
        }
        else {
            System.out.println("Вы ввели неправильную букву");
        }

    }
}
