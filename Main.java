import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        //1. Calling min method to find the smallest number
        System.out.println("The smallest value is: " + min(num1, num2, num3));

        System.out.println("------------------------------------------------");

        //2. Calling isNumber to check the number from the user
        System.out.print("Input a number to check if it's positive, negative or zero: ");
        System.out.println(isNumber(input.nextInt()));

        System.out.println("------------------------------------------------");

        //3. Calling isValidPass to check the password from user
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        System.out.println(isValidPass(input.next()));
    }

    //  1. Write a Java method to find the smallest number among three numbers.
    public static int min(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3)
            return num1;

        else if (num2 < num1 && num2 < num3)
            return num2;

        return num3;
    }

    //  2. Write a Java method that check if the entered number is negative or
//  positive or zero.
    public static String isNumber(int num) {
        if (num > 0)
            return "The number is positive";

        else if (num < 0)
            return "The number is negative";

        return "The number is zero";
    }

    //  3. Write a Java method to check whether a string is a valid password.
    public static String isValidPass(String password) {
        if (password.length() < 8)
            return "A password must have at least eight characters.";

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                return "A password consists of only letters and digits.";

            if (ch >= '0' && ch <= '9')
                digitCount++;
        }
        if (digitCount <= 2)
            return "A password must contain at least two digits";

        return "Password is valid: " + password;
    }
}
