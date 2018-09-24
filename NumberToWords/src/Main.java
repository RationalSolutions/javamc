public class Main {

    /*
    ---
    ** Please read this entire page before attempting to solve this coding exercise.  Additional help is available by
     *  watching the video mentioned at the bottom of the page **
    ---

    Write a method called numberToWords with one int parameter named number.

    The method needs to print out the passed number using words for the digits.

    If the number is negative then print "Invalid Value".

    To print the number in words use the following steps

        Extract last digit of given number using the remainder operator.
        Switch the value of digit found above. There are 10 possible values of digits those being 0, 1, 2, 3, 4, 5,
        6, 7, 8 ,9. Print the corresponding word for each digit.  e.g.  print "Zero" if digit is 0, "One" if digit is
         1, and so on.
        Remove the last digit from the number.
        Repeat step 2 through 4 until the number is 0.

    The logic above is correct but the words will be printed in reverse order. For example if the number is 234 the
    logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem write
    a second method called reverse.

    The reverse method has one int parameter and returns the reversed number (int). For example if the number passed
    is 234 then the reversed number returned would be 432.

    The reverse method should also reverse negative numbers. Use the reverse method in the numberToWords method then
    print the words in the correct order.

    For the number 100 the reverse number is 001. The logic above for the method numberToWords will print "One" but
    that is incorrect it should print "One Zero Zero".

    To solve the problem with leading zeroes write a third method getDigitCount.

    The getDigitCount method has one int parameter number and returns the count of digits in that number. If the
    number is negative then return -1 to indicate an invalid value.

    If number has the value of 100 then the method getDigitCount needs to return 3 since the number 100 has 3 digits
    1, 0, 0.

    Example Input/Output - getDigitCount method

    getDigitCount(0); should return 1 since there is only 1 digit.
    getDigitCount(123); should return 3.
    getDigitCount(-12); should return -1 since the parameter is negative.
    getDigitCount(5200); should return 4 since there are 4 digits in the number.

    Example Input/Output - reverse method

    reverse(-121); should  return -121.
    reverse(1212); should return  2121.
    reverse(1234); should return 4321.
    reverse(100); should return 1.

    Example Input/Output - numberToWords method

    numberToWords(123); should print "One Two Three".
    numberToWords(1010); should print "One Zero One Zero".
    numberToWords(1000); should print "One Zero Zero Zero".
     numberToWords(-12); should print "Invalid Value" since the parameter is negative.

    HINT: Use a for loop to print zeroes after reversing the number.

    e.g. 100 reversed is 1 so needs to print "One Zero Zero". To get the number of zeroes check the difference
    between the digit count from the original number and the reversed number.

    NOTE: Methods numberToWords, getDigitCount, reverse need to be defined as public static like we have been doing
    so far in the course.
    NOTE: In total you have to write 3 methods.
    NOTE: When printing words for example numberToWords(123); each word can be in its own line, for example

        One
        Two
        Three

    They dont have to be separated by a space.

    NOTE: Do not add main method to solution code.

    --
     */

    public static void main(String[] args) {

        System.out.println("--- Get Digit Count ---");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("--- Reverse ---");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("--- Number To Words ---");
        numberToWords(123);
        System.out.println("--- Number To Words ---");
        numberToWords(1010);
        System.out.println("--- Number To Words ---");
        numberToWords(1000);
        System.out.println("--- Number To Words ---");
        numberToWords(-12);

    }

    public static void numberToWords(int number) {

        int digitCount = getDigitCount(number);


        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int reversedNumber = reverse(number);
            int reversedNumberDigitCount = getDigitCount(reversedNumber);

            while (reversedNumber != 0) {
                int digit = (reversedNumber % 10);
                reversedNumber /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                }
            }

            if (reversedNumberDigitCount < digitCount) {
                for (int i = 0; i < (digitCount - reversedNumberDigitCount); i++) {
                    System.out.println("Zero");
                }
            }


        }
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        String numString = String.valueOf(Math.abs(number));

        return numString.length();

    }

    public static int reverse(int number) {

        int lastDigit;
        int reversed = 0;

        while (number != 0) {
            lastDigit = (number % 10);
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return reversed;
    }
}
