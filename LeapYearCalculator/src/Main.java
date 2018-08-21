public class Main {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        int oneHundred = year % 100;
        int fourHundred = year % 400;
        int oneYear = year % 4;

        if ((year >= 1) && (year <= 9999)) {
            if (oneYear == 0) {

                if (oneHundred == 0) {

                    if (fourHundred == 0) {
                        return true;
                    }

                    return false;

                }

                return true;

            }
        }

        return false;


    }
}
