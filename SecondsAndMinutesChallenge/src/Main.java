public class Main {

    public static void main(String[] args) {

      String test = getDurationString(61,0);
        System.out.println(test);

        test = getDurationString(1200000);
        System.out.println(test);


    }

    /*
    Create a method called getDuratinoString with two parameters
        1. minutes
            valid if minutes >= 0
        2. seconds
            valid if seconds >= 0 and <= 59

        The method should return "Invalid value" in the method if either of the above are not true

        If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds
        passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of
         hours, YY the minutes and ZZ the seconds.



     Create a 2nd method of the same name but with only one parameter
        1. seconds
            valid if seconds >= 0

        The method should return "Invalid value" if it is not true.

        If the parameter is valid then calculate how many minutes are in the seconds value and then call the other
        overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

    Call both methods to print values to the console

    Tips:
        Use int or long for your number data types is probably a good idea.
        1 minute = 60 seconds
        1 hour = 60 minutes OR 3600 seconds
        methods should be static

    Bonus:
        For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s
        (Tip: use if-else)
     */

    public static String getDurationString(int minutes, int seconds){
        String resultHours;
        String resultMinutes;
        String resultSeconds;

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))){
            return "Invalid value";
        }

        int totalSeconds = ((minutes*60)+seconds);

        int hours = (totalSeconds/3600);
        if(hours < 1){
            hours=0;
        }

        if(hours<10){
            resultHours = String.format("%02d", hours);
        } else resultHours = Integer.toString(hours);

        minutes = (minutes % 60);
        if(minutes<10){
            resultMinutes = String.format("%02d", minutes);
        } else resultMinutes = Integer.toString(minutes);

        seconds = (totalSeconds % 60);
        if(seconds<10){
            resultSeconds = String.format("%02d", seconds);
        } else resultSeconds = Integer.toString(seconds);

        String results = resultHours + "h " + resultMinutes + "m " + resultSeconds + "s";

        return results;
    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return "Invalid value";
        }

        int minutes = (seconds / 60);
        seconds = (seconds % 60);

        return getDurationString(minutes,seconds);
    }
}
