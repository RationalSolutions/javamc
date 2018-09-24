public class Main {

    static final int errorValue = -1;

    public static void main(String[] args) {

        System.out.println(sumOdd(10,20));

    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        }
        int remainder = number % 2;
        if ((remainder != 0)) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;


        if ((start > end) || (start <= 0)) {
            return errorValue;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println(i+" is an odd number");
                sum += i;
                System.out.println("The sum is now " + sum);
            }
        } return sum;
    }
}
