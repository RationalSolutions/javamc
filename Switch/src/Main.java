public class Main {

    public static void main(String[] args) {
/*        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
*/

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        /*
        Create a new switch statement using char instead of int
        Create a new char variable
        Create a switch statement testing for A, B, C, D or E

        Display a message if any of these are found and then break
        Add a default which displays a message saying not found
         */

        char charValue = 'A';

        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value was '" + charValue + "'");
                break;
            default:
                System.out.println("Value was not A, B, C, D or E");
                System.out.println("Value was " + charValue);
                break;

        }
    }
}
