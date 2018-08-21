public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Coby", 500);
        System.out.println("New score is " + newScore);

        calculateScore();

        double test = calFeetAndInchesToCentimeters(-6, 2);
        if (test <0.0){
            System.out.println("Invalid feet or inches parameters");
        } else System.out.println("Results = " + test);

        test = calFeetAndInchesToCentimeters(185);
        System.out.println("Results = " + test);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No play name, no player score");
        return 0;
    }

    /*
    Create a method called calFeetAndInchesToCentimeters it needs to have two parameters.
        feet is the first parameter, inches is the 2nd parameter
        You should validate that the first parameter feet is (>=0) and that the 2nd parameter is (>=0 && <=12) return
         -1 from the method if either of the above is not true.

         If the parameters are valid, then calculate how many centimeters comprise of the feet and inches passed to
         this method and return that value.

     Create a 2nd method of the same name but with only one parameter.
        inches is the parameter and must validate that it is (>=0) return -1 if it is not true

        If the it is valid, calculate how many feet are in the inches and then call the other overloaded method
        passing the correct feet and inches calculated so that it can calculate correctly.


    HINTS:
        Use double for your number datatypes
        1 inch = 2.54 cm       12 inches = 1 foot
     */

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1d;
        }

        double totalInches = (feet * 12) + inches;
        double totalCentimeters = (totalInches * 2.54);

        return totalCentimeters;

    }

    public static double calFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1d;
        }

        int feet = ((int) inches / 12);
        inches = (inches % 12);

        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + inches);

        double results = calFeetAndInchesToCentimeters((double) feet, inches);
        return results;
    }
}
