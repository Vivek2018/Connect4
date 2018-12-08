package cs125project.connect4;

public class Player {
    private int score;
    public Player() {
        score = 0;
    }
    public int getScore() {
        return this.score;
    }
    public void addScore() {
        this.score++;
    }
}
