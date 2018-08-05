public class Main {

    public static void main(String[] args) {

        byte validByteNumber = 127;
        short validShortNumber = 2000;
        int validIntNumber = 123456789;
        long validLongNumber = (long) (5000 + (10 * (validByteNumber + validShortNumber + validIntNumber)));

        System.out.println(validLongNumber);
    }
}
