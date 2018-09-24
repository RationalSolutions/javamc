import java.util.Scanner;

public class Main {

    /*
        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has
        entered.
        -Before the user enters the number, print the message "Enter number:"
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

    Hint:
        -Use an endless while loop.
     */

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int input = scanner.nextInt();
                if (count == 0) {
                    min = input;
                    max = input;
                } else if (input < min) {
                    min = input;
                } else if (input > max) {
                    max = input;
                }
                count++;
            } else {
                System.out.println("The smallest number you entered: " + min);
                System.out.println("The largest number you entered: " + max);
                break;
            }
        }

        scanner.close();
    }


}
