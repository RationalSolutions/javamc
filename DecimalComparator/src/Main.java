import java.text.DecimalFormat;

import static java.math.RoundingMode.DOWN;

public class Main {

    public static void main(String[] args) {
        boolean isEqual = areEqualByThreeDecimalPlaces(-3.1756, -3.1755);
        System.out.println("Here is the result: " + isEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(DOWN);

        int arrayLength;

        String num1String = (String) df.format(num1);
        String num2String = (String) df.format(num2);

        char[] num1CharArray = num1String.toCharArray();
        char[] num2CharArray = num2String.toCharArray();

        if (num1CharArray.length < num2CharArray.length){
            arrayLength = num2CharArray.length;
        } else if (num1CharArray.length > num2CharArray.length){
            arrayLength = num1CharArray.length;
        } else arrayLength = num1CharArray.length;

        for (int i = 0; i < arrayLength; i++) {

            if(num1CharArray[i] != num2CharArray[i]){
                return false;
            }

        } return true;
    }
}
