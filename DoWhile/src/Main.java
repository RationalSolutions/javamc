public class Main {

    public static void main(String[] args) {
/*
        int count = 1;
        while (count !=6){
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count=1;
        while (true){
            if (count ==5){
                break;
            }
            System.out.println("Count value is "+count);
            count++;
        }

        count=6;
        do{
            System.out.println("Count value was " + count);
            count++;

            if (count > 100){

            }
        }while(count !=6);
        */

        int number = 0;
        int finishNumber = 200;
        int evenNumberCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumberCount++;
            if (evenNumberCount >= 5){
                break;
            }
        }

        /*
        Modify the while code above
            Make it also record the total number of even numbers it has found and break once 5 are found
            Display the total number of even numbers found
         */
    }

    /*
    Create a method called isEvenNumber that takes a parameter of type int
        Its purpose is to determine if the argument passed to the method is an even number or not.
            Return true if an even number
            Return false if it isn't
     */

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else return false;
    }
}
