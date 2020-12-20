package exercises;

public class Score {

    static void score() {
        int score = 10000;
        int lvl = 8;
        int bonus = 200;
        boolean gameOver = true;
        int finalScore = 0;

        for (int i = 0; i < 4; i++) {


            if (gameOver) {
                if (finalScore > 0) {
                    System.out.println("Your previous score was: " + finalScore);
                }
                finalScore = score + lvl * bonus;
                System.out.println("Your final score is: " + finalScore);

            }
            score += 1000;
        }
    }
}
