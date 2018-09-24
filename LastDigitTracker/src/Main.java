public class Main {

    /*
    Write a method named hasSameLastDigit with three parameters of type int.
        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within
        the range, the method should return false.

        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it
        should
         return false.

    EXAMPLE INPUT/OUTPUT:

        hasSameLastDigit (41, 22, 71); should return true since 1 is the rightmost digit in numbers 41 and 71
        hasSameLastDigit (23, 32, 42); should return true since 2 is the rightmost digit in numbers 32 and 42
        hasSameLastDigit (9, 99, 999); should return false since 9 is not within the range of 10-1000

    NOTE: The hasSameLastDigit method needs to be defined as public static as we have been doing so far in the course.

    NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(777, 771, 77));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int num1a, num2a, num3a;

        if ((num1 < 10) || (num2 < 10) || (num3 < 10) || (num1 > 1000) || (num2 > 1000) || (num3 > 1000)) {
            return false;
        }

        num1a = num1 % 10;
        num2a = num2 % 10;
        num3a = num3 % 10;

        if ((num1a == num2a) || (num1a == num3a) || (num2a == num3a)) {
            return true;
        }

        return false;
    }
}
