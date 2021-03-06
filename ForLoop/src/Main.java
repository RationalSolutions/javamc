public class Main {

    public static int amount = 10000;

    public static void main(String[] args) {

        System.out.println("$10,000 at 2% interest = $" + calculateInterest(10000.0, 2.0));
        System.out.println("$10,000 at 3% interest = $" + calculateInterest(10000.0, 3.0));
        System.out.println("$10,000 at 4% interest = $" + calculateInterest(10000.0, 4.0));
        System.out.println("$10,000 at 5% interest = $" + calculateInterest(10000.0, 5.0));
        System.out.println("$10,000 at 6% interest = $" + calculateInterest(10000.0, 6.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        /*
        Using the for statement, call the calculateInterest method with the amount of 10000, with an interestRate of
        2, 3, 4, 5, 6, 7, 8
        and print the results to the console window
         */

        for (int i = 2; i < 9; i++) {
            System.out.println("$" + amount + " at " + i + "% interest = $" + String.format("%.2f",
                    calculateInterest(amount, i)));
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 8; i > 1; i--) {
            System.out.println("$" + amount + " at " + i + "% interest = $" + String.format("%.2f",
                    calculateInterest(amount, i)));
        }


        int count = 0;

        for (int i = 50; i < 10000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");

                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
    
    
    /*
    Create a for statement using any range of numbers
    Determine if the number is a prime nbumber using the isPrime method
    if it is a prime number, print it out AND increment a count of the of the number of prime numbers found
    if that count is 3 exit the for loop.
    Hint: Use the break; statement to exit
     */

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
