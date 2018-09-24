public class Main {

    /*
        Create a for statement using a range of numbers from 1 to 1000 inclusive.

        Sum all the numbers that can be divided with both 3 and also with 5.

        For those numbers that met the above conditions, print out the number.

        break out of the loop once you find 5 numbers that met the above conditions.

        After breaking out of the loop print the sum of the numbers that met the above conditions.

        Note: Type all code in main method
     */

    public static void main(String[] args) {

        int countOfNumbers = 0;
        int sumOfNumbers = 0;

        for (int i = 1; i <= 1000; i++) {
            int dividedBy3 = i % 3;
            int dividedBy5 = i % 5;

            if ((dividedBy3 == 0) && (dividedBy5 == 0)) {
                sumOfNumbers += i;
                countOfNumbers++;
                System.out.println(i + " is divisible by 3 and 5.");
                if (countOfNumbers == 5) {
                    System.out.println("The sum of all the valid numbers is " + sumOfNumbers);
                    break;
                }
            }
        }

    }
}
