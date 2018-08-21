public class Main {

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    /*
    ---

        Write a method named area with one double parameter named radius.

        The method needs to return a double value that represents the area of a circle.

        If the parameter radius is negative then return -1.0 to represent an invalid value.

        Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides
        of a rectangle.

        The method needs to return an area of a rectangle.

        If either or both parameters is/are negative return -1.0 to indicate an invalid value.

        For formulas and PI value please check the tips below.

        Examples of input/output:

            area(5.0); should return 78.53975
            area(-1);  should return -1 since the parameter is negative
            area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
            area(-1.0, 4.0);  should return -1 since first the parameter is negative

        TIP: Formula for calculating a circle area is radius * radius * PI. For PI use number 3.14159

        TIP: Formula for calculating a rectangle area is x * y.

        NOTE: The radius methods needs to be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to your solution code!

    --
     */

    static final double PI = 3.14159d;
    static final double ERROR_VALUE = -1.0d;
    public static double calculatedArea;

    public static double area(double radius) {

        if (radius < 0) {
            return ERROR_VALUE;
        }

        calculatedArea = ((radius * radius) * PI);
        return calculatedArea;
    }

    public static double area(double x, double y) {

        if ((x < 0) || (y < 0)) {
            return ERROR_VALUE;
        }

        calculatedArea = (x * y);
        return calculatedArea;
    }
}
