public class Main {

    /*
    Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
            within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
            otherwise, the method should return false.

    EXAMPLE INPUT/OUTPUT:

        hasSharedDigit(12, 23); should return true since the digit 2 appears in both numbers
        hasSharedDigit(9, 99); should return false since 9 is not within the range of 10-99
        hasSharedDigit(15, 55); should return true since the digit 5 appears in both numbers

    NOTE: The hasSharedDigit method should be defined as public static like we have been doing so far in the course.

    NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int number1a, number1b, number2a, number2b;

        if ((number1 < 0) || (number2 < 0) || (number1 < 10) || (number2 < 10) || (number1 > 99) || (number2 > 99)){
            return false;
        }

        number1a = number1%10;
        number1 /=10;
        number1b = number1;

        number2a = number2%10;
        number2 /=10;
        number2b = number2;

        if ((number1a == number2a) || (number1a == number2b) || (number1b == number2a) || (number1b == number2b)){
            return true;
        }

        return false;
    }
}
