package exercises;

public class Leaderboard {

    static void displayHighScorePosition(String name, int position) {

        StringBuilder ordinal = new StringBuilder();
        if (position == 11) {
            ordinal.append("th");
        } else if (position % 10 == 1) {
            ordinal.append("st");
        } else if (position % 10 == 3) {
            ordinal.append("rd");
        } else if (position % 10 == 2) {
            ordinal.append("nd");
        } else {
            ordinal.append("th");
        }
        System.out.println("Player: " + name + " got " + position + ordinal + " position");


    }

    static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }


    }
}
