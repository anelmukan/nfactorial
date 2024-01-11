public class UseThree {
    public static void main(String[] args) {

        String firstName = args[0];
        String SecondName = args[1];
        String thirdName = args[2];

        System.out.println("Hi " + args[2] + ", " + args[1] + ", and " + args[0] + ".");
    }
}

// Write a program UseThree.java that takes three names and prints out a proper sentence
//     with the names in the reverse of the order given, so that for example,
//     "java UseThree Alice Bob Carol" gives "Hi Carol, Bob, and Alice.".
