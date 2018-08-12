import java.sql.Time;

import javax.print.DocFlavor.STRING;

public class Methods {

    public static void main(String[] args) {
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your score is " +highScore);
        calculateScore(true, 10000, 8, 200);
        highScore = calculateScore(true, 10000, 8, 200);      
        System.out.println("Your score is " +highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Alice", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static int calculateHighScorePosition(int playerScore) {
        // if (playerScore > 1000) {
        //     return 1;
        // }
        // else if (playerScore > 500) {
        //     return 2;
        // }
        // else if (playerScore > 100 ) {
        //     return 3;
        // } 
        // return 4;
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }
        return position;
        
    }

    public static void displayHighScorePosition(String playerName,int highScorePosition) {
        System.out.println(playerName +" managed to get in position " +highScorePosition +" on the high score table");
    }

}