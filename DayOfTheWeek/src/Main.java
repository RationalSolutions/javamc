public class Main {

    public static void main(String[] args) {
        System.out.println("Here we go with the switch statement run");
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        System.out.println(" ");

        System.out.println("Here we go with the if-else statement run");

        ifElsePrintDayOfTheWeek(-1);
        ifElsePrintDayOfTheWeek(0);
        ifElsePrintDayOfTheWeek(1);
        ifElsePrintDayOfTheWeek(3);
        ifElsePrintDayOfTheWeek(4);
        ifElsePrintDayOfTheWeek(5);
        ifElsePrintDayOfTheWeek(6);

    }

    //something changes
    /*
    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
    The method should not return any value (hint: void)

    Using a switch statement print "Sunday", "Monday", ... ,"Saturday" if the int parameter day is 0,1, ... ,6
    respectively, otherwise it should print "Invalid day".

    Bonus:
        Write a second solutino using if then else instead of using switch.
     */

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    public static void ifElsePrintDayOfTheWeek(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else System.out.println("Invalid day");
    }
}
