public class Operations {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum is equal to " + (a + b));
        System.out.println("Product is equal to " + a * b);
        System.out.println("Quotients is equal to " + a / b);
        System.out.println("Remainders is equal to " + a % b);

    }
}


// Take 2 integers from the command line. print their sum, product, quotient (/) and remainder (%) from division.

// public class int num1 = Integer.parseInt(args[0]); {
//         int num1 = Integer.parseInt(args[0]);
//         int num2 = Integer.parseInt(args[1]);
//
//         int sum = num1 + num2;
//         int product = num1 * num2;
//         double division = 1.0 * num1 / num2;
//         int remainder = num1 % num2;
//
//         System.out.println(num1 + " + " + num2 + " = " + sum);
//         System.out.println(num1 + " * " + num2 + " = " + product);
//         System.out.println(num1 + " / " + num2 + " = " + division);
//         System.out.println(num1 + " % " + num2 + " = " + remainder);
//         }
