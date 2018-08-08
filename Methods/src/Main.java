public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Dick", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Joe", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Jack", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Harry", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Aaron", position);

    }

    /*
    Create a method called displayHighScorePosition
        It should have a players name as a parameter and a 2nd parameter as a position in the high schore table
        You should display the players name along with a message like " managed to get into position " and the
        position  they got and a purther message " on the high score table".

    Create a 2nd method called calculateHighScorePosition
        It should be sent one argument only, the player score
        It should return an int
        The return data should be:
            1 - if the score is > 1000
            2 - if the score is > 500 and < 1000
            3 - if the score is > 100 and < 500
            4 - in all other cases

    Call both methods and display the results of the following:
        Scores: 1500, 900, 400, 50
     */

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else
            return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        } else {
            return -1;
        }
    }
}

